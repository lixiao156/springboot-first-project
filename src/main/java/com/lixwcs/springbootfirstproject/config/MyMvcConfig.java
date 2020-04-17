package com.lixwcs.springbootfirstproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/17 12:55
 * 可以扩展springmvc的功能、要什么功能重写什么方法
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //浏览器发送请求 /hello 来到 success页面
        registry.addViewController("/hello").setViewName("success02");
    }
}
