package com.zhou.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.reggie.dto.SetmealDto;
import com.zhou.reggie.entity.Setmeal;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐与菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

}
