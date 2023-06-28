package com.lsgf.dao;

import com.lsgf.pojo.User;
import com.lsgf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

    //insert一个用户 通过万能map
    int addUser2(Map<String,Object> map);


    //根据ID查询用户  通过万能map
    User getUserById2(Map<String,Object> map);

    //模糊查询like
    List<User> getUserLike(String value);


    //模糊查询like sql注入 错误示范
    List<User> getUserLikesqlzhuru(String value);
}
