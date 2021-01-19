package com.tp.learning.service;

import com.tp.learning.mapping.StudentDOMapper;
import com.tp.learning.model.StudentDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zjuptian
 * @Date: 2021/1/18 22:15
 * @Description:
 */
@Service
public class StudentService {
    @Autowired
    private StudentDOMapper studentDOMapper;

    public StudentDO getStudent(int id){
        StudentDO studentDO = studentDOMapper.selectByPrimaryKey(id);
        return studentDO;
    }
}
