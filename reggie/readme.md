
<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

<!-- code_chunk_output -->

- [业务开发](#业务开发)
  - [瑞吉外卖项目概述](#瑞吉外卖项目概述)
    - [软件开发整体介绍](#软件开发整体介绍)
      - [软件开发流程](#软件开发流程)
      - [角色分工](#角色分工)
      - [软件环境](#软件环境)
    - [瑞吉外卖项目介绍](#瑞吉外卖项目介绍)
      - [项目介绍](#项目介绍)
      - [产品原型展示](#产品原型展示)
      - [技术选型](#技术选型)
      - [功能架构](#功能架构)
      - [角色](#角色)
    - [开发环境搭建](#开发环境搭建)
      - [数据库环境搭建](#数据库环境搭建)
      - [Maven项目搭建](#maven项目搭建)
    - [后台登录功能开发](#后台登录功能开发)
      - [需求分析](#需求分析)
      - [代码开发](#代码开发)
      - [功能测试](#功能测试)
    - [后台退出功能开发](#后台退出功能开发)
      - [需求分析](#需求分析-1)
      - [代码开发](#代码开发-1)
      - [功能测试](#功能测试-1)
  - [员工管理业务开发](#员工管理业务开发)
    - [完善登录功能](#完善登录功能)
      - [需求分析](#需求分析-2)
      - [代码开发](#代码开发-2)
      - [功能测试](#功能测试-2)
    - [新增员工](#新增员工)
      - [需求分析](#需求分析-3)
      - [代码开发](#代码开发-3)
      - [功能测试](#功能测试-3)
      - [总结](#总结)
    - [员工信息分页查询](#员工信息分页查询)
      - [需求分析](#需求分析-4)
      - [代码开发](#代码开发-4)
    - [启用/禁用员工账号](#启用禁用员工账号)
      - [需求分析](#需求分析-5)
      - [代码开发](#代码开发-5)
      - [功能测试](#功能测试-4)
      - [代码修复](#代码修复)
    - [编辑员工信息](#编辑员工信息)
      - [需求分析](#需求分析-6)
      - [代码开发](#代码开发-6)
  - [分类管理业务开发](#分类管理业务开发)
    - [公共字段自动填充](#公共字段自动填充)
      - [需求分析](#需求分析-7)
      - [代码开发](#代码开发-7)
      - [功能测试](#功能测试-5)
      - [功能完善](#功能完善)
    - [新增分类](#新增分类)
      - [需求分析](#需求分析-8)
      - [数据模型](#数据模型)
      - [代码开发](#代码开发-8)
      - [功能测试](#功能测试-6)
    - [分类信息分页查询](#分类信息分页查询)
      - [需求分析](#需求分析-9)
      - [代码开发](#代码开发-9)
      - [功能测试](#功能测试-7)
    - [删除分类](#删除分类)
      - [需求分析](#需求分析-10)
      - [代码开发](#代码开发-10)
      - [功能完善](#功能完善-1)
    - [修改分类](#修改分类)
      - [需求分析](#需求分析-11)
      - [代码开发](#代码开发-11)
  - [分类管理业务开发](#分类管理业务开发-1)
    - [文件上传下载](#文件上传下载)
      - [文件上传下载介绍](#文件上传下载介绍)
      - [文件上传代码实现](#文件上传代码实现)
      - [文件下载代码实现](#文件下载代码实现)
    - [新增菜品](#新增菜品)
      - [需求分析](#需求分析-12)
      - [数据模型](#数据模型-1)
      - [代码开发](#代码开发-12)
    - [菜品信息分页查询](#菜品信息分页查询)
      - [需求分析](#需求分析-13)
      - [代码开发](#代码开发-13)
    - [修改菜品信息](#修改菜品信息)
      - [需求分析](#需求分析-14)
      - [代码开发](#代码开发-14)
  - [套餐管理业务开发](#套餐管理业务开发)
    - [新增套餐](#新增套餐)
      - [需求分析](#需求分析-15)
      - [数据模型](#数据模型-2)
      - [代码开发](#代码开发-15)
    - [套餐信息分页查询](#套餐信息分页查询)
      - [需求分析](#需求分析-16)
      - [代码开发](#代码开发-16)
    - [删除套餐](#删除套餐)
      - [需求分析](#需求分析-17)
      - [代码开发](#代码开发-17)
  - [手机验证码登录](#手机验证码登录)
    - [效果展示](#效果展示)
    - [短信发送](#短信发送)
      - [短信服务介绍](#短信服务介绍)
      - [阿里云短信服务](#阿里云短信服务)
      - [代码开发](#代码开发-18)
    - [手机验证码登录](#手机验证码登录-1)
      - [需求分析](#需求分析-18)
      - [数据模型](#数据模型-3)
      - [代码开发](#代码开发-19)
  - [菜品展示、购物车、下单](#菜品展示购物车下单)
    - [导入用户地址簿相关功能代码](#导入用户地址簿相关功能代码)
      - [需求分析](#需求分析-19)
    - [菜品展示](#菜品展示)
      - [需求分析](#需求分析-20)
    - [购物车](#购物车)
      - [需求分析](#需求分析-21)
      - [数据模型](#数据模型-4)
      - [代码开发](#代码开发-20)
    - [下单](#下单)
      - [需求分析](#需求分析-22)
      - [数据模型](#数据模型-5)
      - [代码开发](#代码开发-21)
- [环境部署](#环境部署)
  - [软件安装](#软件安装)
    - [软件安装方式](#软件安装方式)
    - [安装jdk](#安装jdk)
    - [安装Tomcat](#安装tomcat)
    - [安装MySQL](#安装mysql)
      - [开启mysql的被远程访问权限](#开启mysql的被远程访问权限)
      - [记得修改linux里mysql的端口权限](#记得修改linux里mysql的端口权限)
    - [安装lrzsz](#安装lrzsz)
- [项目部署](#项目部署)
  - [手动部署项目](#手动部署项目)
  - [通过Shell脚本自动部署项目](#通过shell脚本自动部署项目)
    - [1.在Linux中安装git](#1在linux中安装git)
    - [2.在Linux中安装maven](#2在linux中安装maven)
    - [3.编写Shell脚本(拉取代码、编译、打包、启动)](#3编写shell脚本拉取代码编译打包启动)
    - [4.为用户授权执行Shell脚本的权限](#4为用户授权执行shell脚本的权限)
    - [5.设置静态IP](#5设置静态ip)
    - [6.执行Shell脚本](#6执行shell脚本)
- [使用Redis](#使用redis)
  - [在java中使用Redis](#在java中使用redis)
    - [依赖](#依赖)
    - [yml配置项(如果有Spring配置项，需挂在Spring配置项下)](#yml配置项如果有spring配置项需挂在spring配置项下)
    - [使用RedisTemplate操作Redis](#使用redistemplate操作redis)
      - [注意：此接口封装了特殊的序列化规则，如果想在命令行窗口里获取该key的值，需要重新设置序列化规则，以确保key值不改变(添加一个SpringBoot配置类)](#注意此接口封装了特殊的序列化规则如果想在命令行窗口里获取该key的值需要重新设置序列化规则以确保key值不改变添加一个springboot配置类)
- [缓存优化](#缓存优化)
  - [问题说明](#问题说明)
  - [环境搭建](#环境搭建)
    - [maven坐标(Redis依赖)](#maven坐标redis依赖)
    - [配置文件](#配置文件)
    - [配置类(设置序列化规则)](#配置类设置序列化规则)
  - [缓存短信验证码](#缓存短信验证码)
    - [实现思路](#实现思路)
    - [代码改造](#代码改造)
    - [功能测试](#功能测试-8)
  - [缓存菜品数据](#缓存菜品数据)
    - [实现思路](#实现思路-1)
    - [代码改造](#代码改造-1)
    - [功能测试](#功能测试-9)
  - [Spring Cache](#spring-cache)
    - [介绍](#介绍)
    - [常用注解](#常用注解)
    - [使用方式(依赖包含在SpringBoot web依赖里)](#使用方式依赖包含在springboot-web依赖里)
      - [将底层缓存切换为Redis(图中为设置缓存有效时间)](#将底层缓存切换为redis图中为设置缓存有效时间)
  - [缓存套餐数据](#缓存套餐数据)
    - [实现思路](#实现思路-2)
    - [代码改造](#代码改造-2)
    - [功能测试](#功能测试-10)
- [主从复制](#主从复制)
  - [问题说明](#问题说明-1)
  - [mysql主从复制](#mysql主从复制)
    - [介绍](#介绍-1)
    - [配置](#配置)
      - [配置主库(master)](#配置主库master)
      - [配置从库(slave)](#配置从库slave)
    - [测试](#测试)
  - [读写分离案例](#读写分离案例)
    - [背景](#背景)
    - [Sharding-JDBC介绍](#sharding-jdbc介绍)
      - [依赖](#依赖-1)
    - [入门案例](#入门案例)
      - [yml配置](#yml配置)
    - [功能测试](#功能测试-11)
  - [项目实现读写分离](#项目实现读写分离)
    - [数据库环境准备](#数据库环境准备)
    - [代码改造](#代码改造-3)
    - [功能测试](#功能测试-12)
- [Nginx](#nginx)
  - [概述](#概述)
  - [命令](#命令)
    - [查看版本](#查看版本)
    - [检查配置文件正确性](#检查配置文件正确性)
    - [启动和停止](#启动和停止)
    - [重新加载配置文件](#重新加载配置文件)
    - [配置环境变量，使nginx命令可以在任何地方使用](#配置环境变量使nginx命令可以在任何地方使用)
  - [配置文件结构](#配置文件结构)
    - [全局块](#全局块)
    - [Events块](#events块)
    - [Http块](#http块)
  - [具体应用](#具体应用)
    - [部署静态资源](#部署静态资源)
    - [反向代理](#反向代理)
    - [负载均衡](#负载均衡)
      - [配置负载均衡](#配置负载均衡)

<!-- /code_chunk_output -->

# 业务开发
## 瑞吉外卖项目概述
### 软件开发整体介绍
#### 软件开发流程
>>>>![1](/pic/01.png)
#### 角色分工
>>>>![1](/pic/02.png)
#### 软件环境
>>>>![1](/pic/03.png)
---
### 瑞吉外卖项目介绍
#### 项目介绍
>>>>![1](/pic/04.png)
#### 产品原型展示
>>>>![1](/pic/05.png)
#### 技术选型
>>>>![1](/pic/06.png)
#### 功能架构
>>>>![1](/pic/07.png)
#### 角色
>>>>![1](/pic/08.png)
---
### 开发环境搭建
#### 数据库环境搭建
>>>>![1](/pic/09.png)
>>>>![1](/pic/10.png)
>>>>![1](/pic/11.png)
#### Maven项目搭建
>>>>![1](/pic/12.png)
---
### 后台登录功能开发
#### 需求分析
>>>>![1](/pic/13.png)
>>>>![1](/pic/14.png)
>>>>![1](/pic/15.png)
>>>>![1](/pic/16.png)
#### 代码开发
>>>>![1](/pic/17.png)
>>>>![1](/pic/18.png)
>>>>![1](/pic/19.png)
>>>>![1](/pic/20.png)
#### 功能测试
---
### 后台退出功能开发
#### 需求分析
>>>>![1](/pic/21.png)
#### 代码开发
>>>>![1](/pic/22.png)
#### 功能测试
---
---
## 员工管理业务开发
### 完善登录功能
#### 需求分析
>>>>![1](/pic/23.png)
#### 代码开发
>>>>![1](/pic/24.png)
>>>>![1](/pic/25.png)
#### 功能测试
---
### 新增员工
#### 需求分析
>>>>![1](/pic/26.png)
>>>>![1](/pic/27.png)
>>>>![1](/pic/28.png)
#### 代码开发
>>>>![1](/pic/29.png)
>>>>![1](/pic/30.png)
#### 功能测试
#### 总结
>>>>![1](/pic/31.png)
---
### 员工信息分页查询
#### 需求分析
#### 代码开发
>>>>![1](/pic/32.png)
---
### 启用/禁用员工账号
#### 需求分析
>>>>![1](/pic/33.png)
>>>>![1](/pic/34.png)
>>>>![1](/pic/35.png)
#### 代码开发
>>>>![1](/pic/36.png)
>>>>![1](/pic/37.png)
>>>>![1](/pic/38.png)
#### 功能测试
>>>>![1](/pic/39.png)
#### 代码修复
>>>>![1](/pic/40.png)
>>>>![1](/pic/41.png)
---
### 编辑员工信息
#### 需求分析
>>>>![1](/pic/42.png)
#### 代码开发
>>>>![1](/pic/43.png)
---
---
## 分类管理业务开发
### 公共字段自动填充
#### 需求分析
>>>>![1](/pic/44.png)
#### 代码开发
>>>>![1](/pic/45.png)
>>>>![1](/pic/46.png)
>>>>![1](/pic/47.png)
#### 功能测试
>>>>![1](/pic/48.png)
#### 功能完善
>>>>![1](/pic/49.png)
>>>>![1](/pic/50.png)
>>>>![1](/pic/51.png)
>>>>![1](/pic/52.png)
---
### 新增分类
#### 需求分析
>>>>![1](/pic/53.png)
#### 数据模型
>>>>![1](/pic/54.png)
#### 代码开发
>>>>![1](/pic/55.png)
>>>>![1](/pic/56.png)
#### 功能测试
---
### 分类信息分页查询
#### 需求分析
>>>>![1](/pic/57.png)
#### 代码开发
>>>>![1](/pic/58.png)
#### 功能测试
---
### 删除分类
#### 需求分析
>>>>![1](/pic/59.png)
#### 代码开发
>>>>![1](/pic/60.png)
#### 功能完善
>>>>![1](/pic/61.png)
---
### 修改分类
#### 需求分析
>>>>![1](/pic/62.png)
#### 代码开发
---
---
## 分类管理业务开发
### 文件上传下载
#### 文件上传下载介绍
>>>>![1](/pic/63.png)
>>>>![1](/pic/64.png)
>>>>![1](/pic/65.png)
#### 文件上传代码实现
>>>>![1](/pic/66.png)
#### 文件下载代码实现
>>>>![1](/pic/67.png)
---
### 新增菜品
#### 需求分析
>>>>![1](/pic/68.png)
#### 数据模型
>>>>![1](/pic/69.png)
#### 代码开发
>>>>![1](/pic/70.png)
>>>>![1](/pic/71.png)
>>>>![1](/pic/72.png)
---
### 菜品信息分页查询
#### 需求分析
>>>>![1](/pic/73.png)
#### 代码开发
>>>>![1](/pic/74.png)
---
### 修改菜品信息
#### 需求分析
>>>>![1](/pic/75.png)
#### 代码开发
>>>>![1](/pic/76.png)
---
---
## 套餐管理业务开发
### 新增套餐
#### 需求分析
>>>>![1](/pic/77.png)
#### 数据模型
>>>>![1](/pic/78.png)
>>>>![1](/pic/79.png)
>>>>![1](/pic/80.png)
#### 代码开发
>>>>![1](/pic/81.png)
>>>>![1](/pic/82.png)
---
### 套餐信息分页查询
#### 需求分析
>>>>![1](/pic/83.png)
#### 代码开发
>>>>![1](/pic/84.png)
---
### 删除套餐
#### 需求分析
>>>>![1](/pic/85.png)
#### 代码开发
>>>>![1](/pic/86.png)
---
---
## 手机验证码登录
### 效果展示
>>>![1](/pic/87.png)
---
### 短信发送
#### 短信服务介绍
>>>>![1](/pic/88.png)
#### 阿里云短信服务
>>>>![1](/pic/89.png)
>>>>![1](/pic/90.png)
>>>>![1](/pic/91.png)
>>>>![1](/pic/92.png)
>>>>![1](/pic/93.png)
#### 代码开发
>>>>![1](/pic/94.png)
>>>> 导入maven坐标
>>>>>        <!--阿里云短信服务-->
>>>>>        <dependency>
>>>>>            <groupId>com.aliyun</groupId>
>>>>>            <artifactId>aliyun-java-sdk-core</artifactId>
>>>>>            <version>4.5.16</version>
>>>>>        </dependency>
>>>>>        <dependency>
>>>>>            <groupId>com.aliyun</groupId>
>>>>>            <artifactId>aliyun-java-sdk-dysmsapi</artifactId>
>>>>>            <version>2.1.0</version>
>>>>>        </dependency>
>>>>![1](/pic/95.png)
---
### 手机验证码登录
#### 需求分析
>>>>![1](/pic/96.png)
#### 数据模型
>>>>![1](/pic/97.png)
#### 代码开发
>>>>![1](/pic/98.png)
>>>>![1](/pic/99.png)
>>>>![1](/pic/100.png)
>>>>![1](/pic/101.png)
---
---
## 菜品展示、购物车、下单
### 导入用户地址簿相关功能代码
#### 需求分析
>>>>![1](/pic/102.png)
---
### 菜品展示
#### 需求分析
>>>>![1](/pic/103.png)
>>>>![1](/pic/104.png)
---
### 购物车
#### 需求分析
>>>>![1](/pic/105.png)
#### 数据模型
>>>>![1](/pic/106.png)
#### 代码开发
>>>>![1](/pic/107.png)
---
### 下单
#### 需求分析
>>>>![1](/pic/108.png)
#### 数据模型
>>>>![1](/pic/109.png)
>>>>![1](/pic/110.png)
>>>>![1](/pic/111.png)
#### 代码开发
>>>>![1](/pic/112.png)
---
---
---
# 环境部署
## 软件安装
### 软件安装方式
>>>![1](/pic/113.png)
---
### 安装jdk
>>>![1](/pic/114.png)
---
### 安装Tomcat
>>>![1](/pic/115.png)
>>>![1](/pic/117.png)
>>>![1](/pic/118.png)
>>>![1](/pic/119.png)
---
### 安装MySQL
>>>![1](/pic/116.png)
>>>![1](/pic/120.png)
>>>![1](/pic/121.png)
>>>![1](/pic/122.png)
>>>![1](/pic/123.png)
>>>![1](/pic/124.png)
>>>![1](/pic/125.png)
#### 开启mysql的被远程访问权限
>>>![1](/pic/126.png)
>>>![1](/pic/127.png)
#### 记得修改linux里mysql的端口权限
---
### 安装lrzsz
>>>![1](/pic/128.png)
---
---
---
# 项目部署
## 手动部署项目
>>![1](/pic/129.png)
>>![1](/pic/130.png)
>>![1](/pic/131.png)
>>![1](/pic/132.png)
>>![1](/pic/133.png)
---
---
## 通过Shell脚本自动部署项目
>>![1](/pic/134.png)
### 1.在Linux中安装git
>>>![1](/pic/135.png)
---
### 2.在Linux中安装maven
>>>![1](/pic/136.png)
---
### 3.编写Shell脚本(拉取代码、编译、打包、启动)
>>>![1](/pic/137.png)
>>>   #!/bin/sh
>>>   echo =============================================
>>>   echo  自动化部署脚本启动
>>>   echo =============================================
>>>   echo 停止原来运行中的工程
>>>   APP_NAME=reggie_take_out
>>>   tpid=`ps -ef|grep $APP_NAME|grep -v grep|grep -v kill|awk '{print $2}'`
>>>   if [ ${tpid} ]; then
>>>          echo 'Stop Process...'
>>>          kill -15 $tpid
>>>   fi
>>>   sleep 2
>>>   tpid=`ps -ef|grep $APP_NAME|grep -v grep|grep -v kill|awk '{print $2}'`
>>>   if [ ${tpid} ]; then
>>>           echo 'Kill Process!'
>>>           kill -9 $tpid
>>>   else
>>>           echo 'Stop Success!'
>>>   fi
>>>   echo 准备从Git仓库拉去最新代码
>>>   cd /usr/local/Project_Practice
>>>   echo 开始从Git仓库拉取最新代码
>>>   git pull
>>>   echo 代码拉取完成
>>>   cd /usr/local/Project_Practice/reggie/reggie_take_out
>>>   echo 开始打包
>>>   output=`mvn clean package -Dmaven.test.skip=true`
>>>   cd target
>>>   echo 启动项目
>>>   nohup java -jar reggie_take_out-1.0-SNAPSHOT.jar &> reggie_take_out-1.0-SNAPSHOT.log &
>>>   echo 项目启动完成
---
### 4.为用户授权执行Shell脚本的权限
>>>![1](/pic/138.png)
>>>![1](/pic/139.png)
---
### 5.设置静态IP
>>>![1](/pic/140.png)
>>>![1](/pic/141.png)
---
### 6.执行Shell脚本
>>>![1](/pic/142.png)
---
---
---
# 使用Redis
## 在java中使用Redis
>>>![1](/pic/143.png)
>>>![1](/pic/144.png)
>>>![1](/pic/145.png)
>>>![1](/pic/146.png)
### 依赖
>>>     <!--Jedis依赖-->
>>>     <dependency>
>>>         <groupId>redis.clients</groupId>
>>>         <artifactId>jedis</artifactId>
>>>         <version>3.3.0</version>
>>>     </dependency>
>>>     <!--Spring Data Redis依赖，简化Redis操作-->
>>>     <dependency>
>>>         <groupId>org.springframework.boot</groupId>
>>>         <artifactId>spring-boot-starter-data-redis</artifactId>
>>>     </dependency>
---
### yml配置项(如果有Spring配置项，需挂在Spring配置项下)
>>>![1](/pic/147.png)
>>>
>>>     #Redis相关配置
>>>     redis:
>>>       host: 192.168.201.100
>>>       port: 6379
>>>       #password:
>>>       database: 0 #操作0号数据库
>>>       jedis:
>>>         pool:
>>>           max-active: 8 #最大连接数
>>>           max-wait: 1ms #连接池最大阻塞等待时间
>>>           max-idle: 4 #连接池中的最大空闲连接
>>>           min-idle: 0 #连接池中的最小空闲连接
---
### 使用RedisTemplate操作Redis
>>>![1](/pic/148.png)
#### 注意：此接口封装了特殊的序列化规则，如果想在命令行窗口里获取该key的值，需要重新设置序列化规则，以确保key值不改变(添加一个SpringBoot配置类)
>>>>      @Configuration
>>>>      public class RedisConfig extends CachingConfigurerSupport {
>>>>      
>>>>          @Bean
>>>>          public RedisTemplate<Object,Object> redisTemplate (RedisConnectionFactory connectionFactory){
>>>>              //默认的key序列化器为:JdkSerializationRedisSerializer
>>>>              RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
>>>>              redisTemplate.setKeySerializer(new StringRedisSerializer());
>>>>              redisTemplate.setHashKeySerializer(new StringRedisSerializer());
>>>>              redisTemplate.setConnectionFactory(connectionFactory);
>>>>              return redisTemplate;
>>>>          }
>>>>      }
---
---
---
# 缓存优化
## 问题说明
>>![1](/pic/149.png)
## 环境搭建
### maven坐标(Redis依赖)
>>>     <!--Spring Data Redis依赖，简化Redis操作-->
>>>     <dependency>
>>>         <groupId>org.springframework.boot</groupId>
>>>         <artifactId>spring-boot-starter-data-redis</artifactId>
>>>     </dependency>
--- 
### 配置文件
>>>     spring:
>>>       #Redis相关配置
>>>       redis:
>>>         host: 192.168.201.100
>>>         port: 6379
>>>         #password: 123456
>>>         database: 0 #操作0号数据库
---
### 配置类(设置序列化规则)
>>>>      @Configuration
>>>>      public class RedisConfig extends CachingConfigurerSupport {
>>>>      
>>>>          @Bean
>>>>          public RedisTemplate<Object,Object> redisTemplate (RedisConnectionFactory connectionFactory){
>>>>              //默认的key序列化器为:JdkSerializationRedisSerializer
>>>>              RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
>>>>              redisTemplate.setKeySerializer(new StringRedisSerializer());
>>>>              redisTemplate.setHashKeySerializer(new StringRedisSerializer());
>>>>              redisTemplate.setConnectionFactory(connectionFactory);
>>>>              return redisTemplate;
>>>>          }
>>>>      }
---
---
## 缓存短信验证码
### 实现思路
>>>![1](/pic/150.png)
---
### 代码改造
---
### 功能测试
---
---
## 缓存菜品数据
### 实现思路
>>>![1](/pic/151.png)
---
### 代码改造
---
### 功能测试
---
---
## Spring Cache
### 介绍
>>>![1](/pic/152.png)
---
### 常用注解
>>>![1](/pic/153.png)
---
### 使用方式(依赖包含在SpringBoot web依赖里)
>>>![1](/pic/154.png)
>>>![1](/pic/155.png)
#### 将底层缓存切换为Redis(图中为设置缓存有效时间)
>>>![1](/pic/156.png)
---
---
## 缓存套餐数据
### 实现思路
---
>>>![1](/pic/157.png)
### 代码改造
>>>![1](/pic/158.png)
>>>![1](/pic/159.png)
>>>![1](/pic/160.png)
>>> #### 如果Controller方法使用的定制的返回结果集类，需要注意此类无法被序列化的问题，解决需要使用此类实现序列化接口
>>>![1](/pic/161.png)
---
### 功能测试
---
---
---
# 主从复制
## 问题说明
>>![1](/pic/162.png)
---
---
## mysql主从复制
### 介绍
>>>![1](/pic/163.png)
---
### 配置
>>>![1](/pic/164.png)
#### 配置主库(master)
>>>>![1](/pic/165.png)
>>>>![1](/pic/166.png)
>>>>![1](/pic/167.png)
>>>>> # 注意：MySQL 8及之后版本需要先创建用户再赋予权限
>>>>>     create user 'zhou'@'%' identified with mysql_native_password by 'Weizijierhuo0214';
>>>>>     GRANT REPLICATION SLAVE ON *.* to 'zhou'@'%';
>>>>![1](/pic/168.png)
#### 配置从库(slave)
>>>>![1](/pic/169.png)
>>>>![1](/pic/170.png)
>>>>![1](/pic/171.png)
>>>>![1](/pic/172.png)
>>>> # 
>>>>>     change master to master_host='主库ip地址',master_user='主库设置的用户',master_password='用户密码',master_log_file='查询主库状态的File',master_log_pos=查询主库状态的Position;
---
### 测试
---
---
## 读写分离案例 
### 背景
>>>![1](/pic/173.png)
---
### Sharding-JDBC介绍
>>>![1](/pic/174.png)
#### 依赖
>>>> ### 注意:使用此依赖整合druid，依赖不能使用springboot关于druid的starter，否则项目无法启动
>>>>      <!--Sharding-JDBC依赖-->
>>>>      <dependency>
>>>>          <groupId>org.apache.shardingsphere</groupId>
>>>>          <artifactId>sharding-jdbc-spring-boot-starter</artifactId>
>>>>          <version>4.0.0-RC1</version>
>>>>      </dependency>
---
### 入门案例
>>>![1](/pic/175.png)
#### yml配置
>>>>      spring:
>>>>        #配置读写分离sharding-JDBC
>>>>        shardingsphere:
>>>>          datasource:
>>>>            names: master,slave
>>>>            #主数据源
>>>>            master:
>>>>              type: com.alibaba.druid.pool.DruidDataSource
>>>>              driver-class-name: com.mysql.cj.jdbc.Driver
>>>>              url:  jdbc:mysql://192.168.201.100:3306/reggie?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true
>>>>              username: root
>>>>              password: Weizijierhuo0214
>>>>            # 从数据源
>>>>            slave:
>>>>              type: com.alibaba.druid.pool.DruidDataSource
>>>>              driver-class-name: com.mysql.cj.jdbc.Driver
>>>>              url: jdbc:mysql://192.168.201.101:3306/reggie?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true
>>>>              username: root
>>>>              password: Weizijierhuo0214
>>>>          masterslave:
>>>>            #读写分离配置
>>>>            load-balance-algorithm-type: round-robin #轮询策略
>>>>            #最终的数据源名称
>>>>            name: dataSource
>>>>            #主库数据源名称
>>>>            master-data-source-name: master
>>>>            #从库数据源名称列表
>>>>            slave-data-source-names: slave
>>>>          props:
>>>>            sql:
>>>>              show: true  #开启sql显示
>>>>        main:
>>>>            allow-bean-definition-overriding: true #允许bean定义覆盖
---
### 功能测试
---
---
## 项目实现读写分离
### 数据库环境准备
---
### 代码改造
---
### 功能测试
---
---
---
# Nginx
## 概述
>>![1](/pic/176.png)
>>![1](/pic/177.png)
>>> ### 注意 需要先安装wget插件才可使用wget指令
>>>>      yum install wget
>>![1](/pic/178.png)
---
---
## 命令
### 查看版本
>>>![1](/pic/179.png)
---
### 检查配置文件正确性
>>>![1](/pic/180.png)
--- 
### 启动和停止
>>>![1](/pic/181.png)
>>>> #### nginx的默认端口为80，需要开放端口的访问权限
--- 
### 重新加载配置文件
>>>![1](/pic/182.png)
---
### 配置环境变量，使nginx命令可以在任何地方使用
>>>![1](/pic/184.png)
>>>![1](/pic/183.png)
>>>![1](/pic/185.png)
---
---
## 配置文件结构
>>![1](/pic/186.png)
### 全局块
---
### Events块
---
### Http块
---
---
## 具体应用
### 部署静态资源
>>>![1](/pic/187.png)
---
### 反向代理
>>>![1](/pic/188.png)
>>>![1](/pic/189.png)
>>>![1](/pic/190.png)
---
### 负载均衡
>>>![1](/pic/191.png)
#### 配置负载均衡
>>>>![1](/pic/192.png)
---
---
---