package com.lsgf.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询数据库的所有信息
    //没用实体类，数据库中的东西，怎么获取？ Map
    @GetMapping("/userList")
    public List<Map<String,Object>> userList(){
        String sql="select * from user";
        List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql);
        return list_maps;
    }


    @GetMapping("/addUser")
    public List<Map<String,Object>> addUser(){
        String sql="insert into testdb.user(id,name,pwd) values (4,'zhuhaowen','123456')";
        jdbcTemplate.update(sql);
        sql="select * from user";
        List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql);
        return list_maps;
    }


    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
        String sql="update user set name=?,pwd=? where id="+id;

        //封装
        Object[] objects = new Object[2];
        objects[0]="夏清宇";
        objects[1]="1qaz!QAZ";


        jdbcTemplate.update(sql,objects);
        return "update-ok";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        String sql="delete from testdb.user where id =?";
        jdbcTemplate.update(sql,id);
        return "delete-ok";
    }
}
