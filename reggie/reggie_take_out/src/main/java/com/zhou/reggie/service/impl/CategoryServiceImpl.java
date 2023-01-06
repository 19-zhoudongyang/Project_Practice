package com.zhou.reggie.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.reggie.common.CustomException;
import com.zhou.reggie.entity.Category;

import com.zhou.reggie.entity.Dish;
import com.zhou.reggie.entity.Setmeal;
import com.zhou.reggie.mapper.CategoryMapper;
import com.zhou.reggie.mapper.DishMapper;
import com.zhou.reggie.mapper.EmployeeMapper;
import com.zhou.reggie.service.CategoryService;
import com.zhou.reggie.service.DishService;
import com.zhou.reggie.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper,Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类，删除之前进行判断逻辑
     * @param id
     */
    @Override
    public void remove(Long id) {


        //1.查询当前分类是否关联了菜品，如果已经关联，抛出一个业务异常
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //1.1添加查询条件，根据分类id进行查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        //1.2执行查询
        int count1 = dishService.count(dishLambdaQueryWrapper);
        //1.3判断是否关联菜品
        if (count1 > 0){
            //已经关联菜品，抛出一个业务异常
            throw new CustomException("当前分类关联了菜品，不能删除");
        }
        //2.查询当前分类是否关联了套餐，如果已经关联，抛出一个业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //2.1添加查询条件，根据分类id进行查询
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        //2.2执行查询
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        //1.3判断是否关联菜品
        if (count2 > 0){
            //已经关联套餐，抛出一个业务异常
            throw new CustomException("当前分类关联了套餐，不能删除");
        }
        //正常删除分类
        super.removeById(id);
    }
}
