package com.lsgf.dao;

import com.lsgf.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    List<User> getUserByLimit(Map<String,Integer> map);

}
