package com.tp.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zjuptian
 * @Date: 2021/1/18 21:36
 * @Description:
 */
@Controller
//@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        return "hello world";
    }
}
