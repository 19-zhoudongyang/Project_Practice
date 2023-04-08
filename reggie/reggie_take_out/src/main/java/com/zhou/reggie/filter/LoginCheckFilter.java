package com.zhou.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.zhou.reggie.common.BaseContext;
import com.zhou.reggie.common.R;
import com.zhou.reggie.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebFilter(filterName = "LoginCheckFilter",urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    @Autowired
    private RedisTemplate redisTemplate;
    //使用此类将字符串进行路径比较
    //路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request =  (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        //1.获取本次请求的URI
        String requestURI = request.getRequestURI();

        log.info("拦截到请求：{}",request.getRequestURI());


        //2.判断本次请求是否需要处理
        //定义不需要处理的请求路径
        String []urls = new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**",
                "/user/sendMsg",
                "/user/login",
                "/doc.html",
                "/webjars/**",
                "/swagger-resources",
                "/v2/api-docs"
        };

        //3.如果不需要处理则直接放行
        if (check(urls,requestURI)){
            log.info("本次请求{}不需要处理",request.getRequestURI());
            filterChain.doFilter(request,response);
            return;
        }

        //4.1判断登录状态，如果已经登录，则放行(pc端)
        if(request.getSession().getAttribute("employee") != null){
            log.info("用户已登录，用户id为{}",request.getSession().getAttribute("employee"));
            //获取当前登录用户的id并存到维护的ThreadLocal线程空间中去
            Long empId = (Long)request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(empId);

            filterChain.doFilter(request,response);
            return;
        }

        //4.2判断登录状态，如果已经登录，则放行(移动端)
        if(request.getSession().getAttribute("user") != null){
//        if (redisTemplate.opsForValue().get("user") != null){
            log.info("用户已登录，用户id为{}",request.getSession().getAttribute("user"));
            log.info("当前线程为：{}",Thread.currentThread().getName());
            //获取当前登录用户的id并存到维护的ThreadLocal线程空间中去
            User user = (User)request.getSession().getAttribute("user");
//            User user = (User)redisTemplate.opsForValue().get("user");
            BaseContext.setCurrentId(user.getId());

            filterChain.doFilter(request,response);
            return;
        }

        //5.如果未登录则返回未登录结果,通过输出流的方式向客户端页面响应数据
        log.info("用户未登录");
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;

    }

    /**
     * 路径匹配，检查此次请求是否需要放行
     * @param urls
     * @param requestURI
     * @return
     */
    public boolean check(String[] urls,String requestURI){
        for (String url : urls) {
            if (PATH_MATCHER.match(url,requestURI)){
                return true;
            }
        }
        return false;
    }
}
