package com.zhou.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
