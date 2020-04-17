package com.lixwcs.springbootfirstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/17 10:42
 */
//@Controller
public class MyController {
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
