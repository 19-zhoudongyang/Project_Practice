package com.zhou.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhou.reggie.common.R;
import com.zhou.reggie.entity.User;
import com.zhou.reggie.service.UserService;
import com.zhou.reggie.utils.SMSUtils;
import com.zhou.reggie.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/sendMsg")
    public R<String> sendMsg(@RequestBody User user, HttpSession session){
        //获取手机号码
        String phone = user.getPhone();
        if (StringUtils.isNotEmpty(phone)){
            //生成随机的四位验证码
            String validateCode = ValidateCodeUtils.generateValidateCode(4).toString();
            log.info("验证码为：{}",validateCode);
            //调用阿里云提供的短信服务api完成发送短信
            SMSUtils.sendMessage("瑞吉外卖","",phone,validateCode);
            //需要将生成的验证码保存到Session
            session.setAttribute(phone,validateCode);
            return R.success("短信发送成功");
        }
        return R.error("短信发送失败");


    }

    @PostMapping("/login")
    public R<User> login(@RequestBody Map map, HttpSession session){
        //获取手机号码
        String phone = map.get("phone").toString();
        //获取验证码
        String code = map.get("code").toString();
        //从Session中获取保存的验证码
        String codeInSession = session.getAttribute(phone).toString();
        //进行验证码的比对
        if (codeInSession != null && codeInSession.equals(code)){

            //判断当前手机号对应的用户是否为新用户，如果是新用户自动完成注册
            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(User::getPhone,phone);
            User user = userService.getOne(queryWrapper);
            if (user == null){
                //自动完成注册
                user = new User();
                user.setPhone(phone);
                userService.save(user);
            }
            return R.success(user);
        }
        return R.error("登录失败");
    }
}
