package com.zhou.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.reggie.entity.Category;

public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
