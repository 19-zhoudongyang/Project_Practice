package com.zhou.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhou.reggie.common.BaseContext;
import com.zhou.reggie.common.R;
import com.zhou.reggie.entity.ShoppingCart;
import com.zhou.reggie.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingCart")
@Slf4j
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;


    /**
     * 添加到购物车
     * @param shoppingCart
     * @return
     */
    @PostMapping("/add")
    public R<ShoppingCart> add(@RequestBody ShoppingCart shoppingCart){
        log.info("购物车数据:{}",shoppingCart);
        log.info("当前线程为：{}",Thread.currentThread().getName());

        //设置用户id,指定当前购物车是哪个用户的
        Long id = BaseContext.getCurrentId();
        shoppingCart.setUserId(id);

        //增加菜品数量number
        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        //区分加入购物车的是菜品还是套餐
        if (shoppingCart.getDishId() != null){
            queryWrapper.eq(ShoppingCart::getDishId,shoppingCart.getDishId());
        }else{
            queryWrapper.eq(ShoppingCart::getSetmealId,shoppingCart.getSetmealId());
        }
        queryWrapper.eq(ShoppingCart::getUserId,shoppingCart.getUserId());
        ShoppingCart one = shoppingCartService.getOne(queryWrapper);
        if (one != null){
            //如果已经存在，则在原本的数量上加1
            one.setNumber(one.getNumber()+1);
            shoppingCartService.updateById(one);
        }else {
            //如果不存在，则添加到购物车，数量默认就是1
            shoppingCart.setNumber(1);
            shoppingCartService.save(shoppingCart);
            one = shoppingCart;
        }

        return R.success(one);
    }

    @GetMapping("/list")
    public R<List<ShoppingCart>> list(){
        Long currentId = BaseContext.getCurrentId();
        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        //根据当前登录的用户id查询购物车信息
        queryWrapper.eq(ShoppingCart::getUserId,currentId);
        //根据创建数据的时间升序排列
        queryWrapper.orderByAsc(ShoppingCart::getCreateTime);
        //执行查询
        List<ShoppingCart> list = shoppingCartService.list(queryWrapper);

        return R.success(list);
    }

//    @PostMapping("/sub")
//    public R<Stri>


    @DeleteMapping("/clean")
    public R<String> clean(){
        Long currentId = BaseContext.getCurrentId();
        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ShoppingCart::getUserId,currentId);

        shoppingCartService.remove(queryWrapper);

        return R.success("情况购物车成功");
    }
}
