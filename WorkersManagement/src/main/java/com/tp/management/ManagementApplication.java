package com.tp.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zjuptian
 * @Date: 2021/1/19 13:33
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.tp.management.mapping")
public class ManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagementApplication.class,args);
    }
}
