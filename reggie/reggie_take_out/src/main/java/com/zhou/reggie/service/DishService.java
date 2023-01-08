package com.zhou.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.reggie.dto.DishDto;
import com.zhou.reggie.entity.Dish;
import org.springframework.stereotype.Service;

@Service
public interface DishService extends IService<Dish> {

    //新增菜品且插入口味信息，需要操作两张表：dish和dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息且更新口味信息，需要操作两张表：dish和dish_flavor
    public void updateWithFlavor(DishDto dishDto);
}
