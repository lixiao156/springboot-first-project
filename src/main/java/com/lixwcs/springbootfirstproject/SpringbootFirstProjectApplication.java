package com.lixwcs.springbootfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringbootFirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstProjectApplication.class, args);
    }
    // 自己添加放在容器中即可：因为源码中是将所有的视图解析 遍历一遍 --需要进一步知道具体的匹配模式
    @Bean
    public ViewResolver MyViewResolver(){
        return new MyViewResolver();
    }
    //静态内部类
    private static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }

}
