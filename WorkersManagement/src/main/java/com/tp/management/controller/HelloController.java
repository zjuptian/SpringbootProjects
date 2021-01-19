package com.tp.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zjuptian
 * @Date: 2021/1/19 13:35
 * @Description:
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody String Hello(){
        return "Hello!";
    }
}
