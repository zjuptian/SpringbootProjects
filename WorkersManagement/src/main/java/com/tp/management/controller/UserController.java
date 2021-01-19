package com.tp.management.controller;

import com.tp.management.model.UserDO;
import com.tp.management.service.impl.UserServiceImpl;
import com.tp.management.vo.LoginVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zjuptian
 * @Date: 2021/1/19 13:46
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/login")
    public String login(@RequestBody LoginVO loginVO){
        System.out.println(loginVO.getUsername());
        System.out.println(loginVO.getPassword());
        UserDO userDO = userService.getUserByName(loginVO.getUsername());
        if(userDO.getPassword().equals(loginVO.getPassword())){
            return "登陆成功";
        }
        else{
            return "账号或密码错误";
        }
    }
}
