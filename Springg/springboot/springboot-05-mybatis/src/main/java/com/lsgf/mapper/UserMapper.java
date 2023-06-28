package com.lsgf.mapper;

import com.lsgf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//标识本类是一个mybatis的mapper类:Dao
@Mapper
@Repository
public interface UserMapper {



    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);



}
