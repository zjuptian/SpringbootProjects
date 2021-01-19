package com.tp.learning.controller;

import com.tp.learning.mapping.StudentDOMapper;
import com.tp.learning.model.StudentDO;
import com.tp.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zjuptian
 * @Date: 2021/1/18 22:08
 * @Description:
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public @ResponseBody  Object getStudent(){
        StudentDO studentDO = studentService.getStudent(1);
        return  studentDO;
    }
}
