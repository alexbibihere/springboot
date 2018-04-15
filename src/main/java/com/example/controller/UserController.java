package com.example.controller;

import com.example.dao.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yan
 * @Date: 2018/4/16/0016 2:37
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/demo")
    public User get(){
        User user = userMapper.getUserById(1);
        return user;
    }

    @RequestMapping(value = "res")
    public String df(){
        return "Hello";
    }
}
