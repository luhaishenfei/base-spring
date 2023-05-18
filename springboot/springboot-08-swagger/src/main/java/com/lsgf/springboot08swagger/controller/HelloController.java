package com.lsgf.springboot08swagger.controller;

import com.lsgf.springboot08swagger.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    //只要我们的接口中，返回值存在实体类，它就会被扫描到Swagger中
    @PostMapping("/user")
    public User user() {
        return new User();
    }


    //Operation 接口
    @ApiOperation("Hello控制类")
    @GetMapping("/hello2")
    public String hello(@ApiParam("input用户名") String username){
        return "hello "+username;
    }


    @ApiOperation("Test测试类")
    @GetMapping(value = "/postt")
    public User postt(@ApiParam("用户名") User user){
        return user;
    }
}
