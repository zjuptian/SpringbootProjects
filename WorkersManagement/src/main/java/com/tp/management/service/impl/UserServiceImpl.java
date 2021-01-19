package com.tp.management.service.impl;

import com.tp.management.mapping.UserDOMapper;
import com.tp.management.model.UserDO;
import com.tp.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zjuptian
 * @Date: 2021/1/19 13:56
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDOMapper userDOMapper;

    @Override
    public UserDO getUserByName(String username) {
        UserDO userDO = userDOMapper.selectByUsername(username);

        return userDO;
    }

    @Override
    public UserDO getUserById(int id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        return userDO;
    }
}
