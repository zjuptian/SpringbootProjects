package com.tp.management.service;

import com.tp.management.model.UserDO;


/**
 * @Author: zjuptian
 * @Date: 2021/1/19 13:55
 * @Description:
 */
public interface UserService {
    UserDO getUserByName(String username);

    UserDO getUserById(int id);
}
