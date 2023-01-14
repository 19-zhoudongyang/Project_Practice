package com.zhou.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.reggie.entity.Orders;
import org.springframework.stereotype.Service;

@Service
public interface OrdersService extends IService<Orders> {
    /**
     * 用户下单
     * @param orders
     * @return
     */
    public void submit(Orders orders);
}
