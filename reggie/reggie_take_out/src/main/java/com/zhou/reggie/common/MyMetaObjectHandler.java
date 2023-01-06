package com.zhou.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 自定义元数据对象处理器，填充公共字段
 */
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入操作自动填充
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充[insert]...");
        log.info(metaObject.toString());

        log.info("创建此数据的用户为{}",BaseContext.getCurrent());

        //自动填充创建此数据的时间和创建此数据的账户
        metaObject.setValue("createTime",LocalDateTime.now());
        metaObject.setValue("createUser",BaseContext.getCurrent());
        //自动填充更新此数据的时间和更新此数据的账户
        metaObject.setValue("updateTime",LocalDateTime.now());
        metaObject.setValue("updateUser",BaseContext.getCurrent());

    }

    /**
     * 更新操作自动填充
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动填充[update]...");
        log.info(metaObject.toString());

        log.info("更新此数据的用户为{}",BaseContext.getCurrent());

        //自动填充更新此数据的时间和更新此数据的账户
        metaObject.setValue("updateTime",LocalDateTime.now());
        metaObject.setValue("updateUser",BaseContext.getCurrent());
    }
}
