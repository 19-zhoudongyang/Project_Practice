package com.zhou.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.reggie.common.BaseContext;
import com.zhou.reggie.common.CustomException;
import com.zhou.reggie.entity.AddressBook;
import com.zhou.reggie.entity.Orders;
import com.zhou.reggie.entity.ShoppingCart;
import com.zhou.reggie.entity.User;
import com.zhou.reggie.mapper.OrdersMapper;
import com.zhou.reggie.service.AddressBookService;
import com.zhou.reggie.service.OrdersService;
import com.zhou.reggie.service.ShoppingCartService;
import com.zhou.reggie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private UserService userService;

    @Autowired
    private AddressBookService addressBookService;

    /**
     * 用户下单
     * @param orders
     * @return
     */
    @Override
    @Transactional
    public void submit(Orders orders) {
        //获取当前用户id
        Long userId = BaseContext.getCurrentId();

        //查询当前用户的购物车数据
        LambdaQueryWrapper<ShoppingCart> shoppingCartLambdaQueryWrapper = new LambdaQueryWrapper<>();
        shoppingCartLambdaQueryWrapper.eq(ShoppingCart::getUserId,userId);
        List<ShoppingCart> shoppingCartList = shoppingCartService.list(shoppingCartLambdaQueryWrapper);
        if (shoppingCartList == null || shoppingCartList.size() == 0){
            throw new CustomException("购物车为空，不能下单");
        }

        //查询用户数据
        User user = userService.getById(userId);

        //查询地址数据
        Long addressBookId = orders.getAddressBookId();
        AddressBook addressBook = addressBookService.getById(addressBookId);
        if (addressBook == null){
            throw new CustomException("地址信息有误，不能下单");
        }

        //完成下单，向订单表插入数据，一条数据
        long id = IdWorker.getId();
        orders.setNumber(String.valueOf(id));

        this.save(orders);

        //向明细表插入数据

        //清空购物车数据
    }
}
