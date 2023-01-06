package com.zhou.reggie.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.reggie.entity.Category;

import com.zhou.reggie.mapper.CategoryMapper;
import com.zhou.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper,Category> implements CategoryService {
}
