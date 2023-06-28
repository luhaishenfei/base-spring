package com.lsgf.controller;

import com.lsgf.mapper.UserMapper;
import com.lsgf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("queryUserList")
    public List<User> queryUserList() {
        List<User> userList = userMapper.queryUserList();

        return userList;
    }
}
