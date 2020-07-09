package com.youyoustudio.bookstore.controller;

import com.youyoustudio.bookstore.UserServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author youyoustudio
 * @Date 2020/7/9 4:44 下午
 * @Package com.youyoustudio.bookstore.controller
 * @description :
 */
@SpringBootApplication
public class UserController {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
    }
}
