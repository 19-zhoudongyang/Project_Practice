package com.zhou.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhou.reggie.common.R;
import com.zhou.reggie.entity.Employee;
import com.zhou.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 登录
     * @param request
     * @param employee
     * @return
     */
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee){
        //1.密码MD5加密
        String password = DigestUtils.md5DigestAsHex(employee.getPassword().getBytes());

        //2.根据页面提交的用户名username查询数据库
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Employee::getUsername,employee.getUsername());
        Employee emp = employeeService.getOne(wrapper);

        //3.如果没有查询到则返回登录失败结果
        if (emp == null){
            return R.error("登录失败");
        }

        //4.密码比对，如果不一致则返回登录失败结果
        if (!emp.getPassword().equals(password)){
            return R.error("登录失败");
        }

        //5.查看员工状态，如果为已禁用状态，则返回员工已禁用结果
        if (emp.getStatus() == 0){
            return R.error("账号已禁用");
        }
        //6.登录成功，将员工id存入Session并返回登录成功结果
        request.getSession().setAttribute("employee",emp.getId());
        return R.success(emp);
    }

    /**
     * 登出
     * @param request
     * @return
     */
    @PostMapping("logout")
    public R<String> logout(HttpServletRequest request){
        request.getSession().removeAttribute("employee");
        return R.success("退出成功");
    }

    /**
     * 新增员工
     * @param employee
     * @param request
     * @return
     */
    @PostMapping
    public R<String> save(@RequestBody Employee employee,HttpServletRequest request){
        log.info("新增员工，员工信息：{}",employee.toString());
        //设置初始密码，需要使用MD5加密处理
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));


        //设置创建时间
        //employee.setCreateTime(LocalDateTime.now());
        //设置更新时间
        //employee.setUpdateTime(LocalDateTime.now());
        //设置创建人(获取当前登录用户的id)
        //Long empId = (Long)request.getSession().getAttribute("employee");
        //employee.setCreateUser(empId);
        //设置修改人(获取当前登录用户的id)
        //employee.setUpdateUser(empId);

        //在数据库创建管理员用户
        employeeService.save(employee);

        return R.success("新增员工成功");
    }

    /**
     * 查询所有员工
     */
    @GetMapping("/page")
    public R<Page> page(Integer page, Integer pageSize,String name){
        log.info("page={},pageSize={},name={}",page,pageSize,name);
        //1.构造分页构造器
        Page pageInfo = new Page(page, pageSize);

        //2.构造条件构造器
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper();
        //2.1添加过滤条件
        queryWrapper.like(StringUtils.isNotEmpty(name),Employee::getName,name);
        //2.2添加排序条件
        queryWrapper.orderByDesc(Employee::getUpdateTime);

        //3.执行查询
        employeeService.page(pageInfo,queryWrapper);
        //4.返回结果集
        return R.success(pageInfo);
    }

    /**
     * 更新账户状态(禁用/启用)
     * @param employee
     * @param request
     * @return
     */
    @PutMapping
    public R<String> update(@RequestBody Employee employee,HttpServletRequest request){
        log.info(employee.toString());

        //1.设置更新时间
        //employee.setUpdateTime(LocalDateTime.now());

        //2.设置更新此账户状态的用户
        //Long empId = (Long) request.getSession().getAttribute("employee");
        //employee.setUpdateUser(empId);



        //3.执行更新
        employeeService.updateById(employee);

        //4.返回成功信息
        return R.success("员工信息修改成功");
    }

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public R<Employee> add(@PathVariable Long id){
        log.info("根据id查询员工信息...");
        Employee employee = employeeService.getById(id);
        if (employee != null){
            return R.success(employee);
        }
        return R.error("没有查询到对应员工信息");
    }
}
