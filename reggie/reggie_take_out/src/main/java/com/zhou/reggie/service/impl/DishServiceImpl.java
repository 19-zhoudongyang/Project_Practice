package com.zhou.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.reggie.dto.DishDto;
import com.zhou.reggie.entity.Dish;
import com.zhou.reggie.entity.DishFlavor;
import com.zhou.reggie.mapper.DishMapper;
import com.zhou.reggie.service.DishFlavorService;
import com.zhou.reggie.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {


    @Autowired
    private DishFlavorService dishFlavorService;
    /**
     * 新增菜品且插入口味数据，需要操作两张表：dish和dish_flavor
     * @param dishDto
     */
    @Transactional
    @Override
    public void saveWithFlavor(DishDto dishDto) {
        //保存菜品的基本信息到菜品表dish
        this.save(dishDto);

        Long id = dishDto.getId();

        List<DishFlavor> flavors = dishDto.getFlavors();
        flavors = flavors.stream().map(item -> {
            item.setDishId(id);
            return item;
        }).collect(Collectors.toList());
        //保存菜品口味数据到菜品口味表dish_flavor
        dishFlavorService.saveBatch(flavors);
    }

    /**
     * 根据id查询菜品信息和对应的口味信息
     * @param id
     * @return
     */
    @Override
    public DishDto getByIdWithFlavor(Long id) {
        //查询菜品信息,从dish表查询
        Dish dish = this.getById(id);

        //拷贝信息
        DishDto dishDto = new DishDto();
        BeanUtils.copyProperties(dish,dishDto);
        //查询当前菜品对应的口味信息，从dish_flavor表查询
        LambdaQueryWrapper<DishFlavor> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DishFlavor::getId,dish.getId());
        List<DishFlavor> flavors = dishFlavorService.list(queryWrapper);


        dishDto.setFlavors(flavors);
        return dishDto;
    }

    /**
     * 更新菜品信息且更新口味信息，需要操作两张表：dish和dish_flavor
     * @param dishDto
     */
    @Override
    @Transactional
    public void updateWithFlavor(DishDto dishDto) {
        //更新dish表基本信息
        this.updateById(dishDto);
        //清理当前菜品对应口味数据--dish_flavor表的delete操作
        LambdaQueryWrapper<DishFlavor> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DishFlavor::getDishId,dishDto.getId());
        dishFlavorService.remove(queryWrapper);
        //添加当前提交过来的口味信息dish_flavor表的insert操作
        List<DishFlavor> flavors = dishDto.getFlavors();

        flavors = flavors.stream().map(item -> {
            item.setDishId(dishDto.getId());
            return item;
        }).collect(Collectors.toList());

        dishFlavorService.saveBatch(flavors);
    }
}
