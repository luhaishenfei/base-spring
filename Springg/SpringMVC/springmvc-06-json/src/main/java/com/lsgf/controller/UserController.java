package com.lsgf.controller;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lsgf.pojo.User;
import com.lsgf.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller   @Controller  + @ResponseBody =@RestController
@RestController
public class UserController {

    @RequestMapping("/j1")
//    @ResponseBody //加了这个注解就不会走视图解析器，会直接返回一个字符串   或者将@Controller注解替换为@RestController 此时就可以不用此注解，该类所有String返回都不走视图解析器
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();


        User user = new User(1,"朱浩闻",24);

        String str = mapper.writeValueAsString(user);

        return user.toString()+"---"+str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();


        User user1 = new User(1,"朱浩闻",24);
        User user2 = new User(2,"王磊",24);
        User user3 = new User(3,"夏清宇",24);
        User user4 = new User(4,"朱乐春",24);
        User user5 = new User(5,"肖总",24);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        String str = mapper.writeValueAsString(userList);
        //[{"id":1,"name":"朱浩闻","age":24},{"id":2,"name":"王磊","age":24},{"id":3,"name":"夏清宇","age":24},{"id":4,"name":"朱乐春","age":24},{"id":5,"name":"肖总","age":24}]
        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        //BojectMapper时间解析后的默认格式为Timestamp，时间戳
        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //设置自定义的时间格式
        mapper.setDateFormat(sdf);
        return mapper.writeValueAsString(date);
//        return sdf.format(date);
    }

    @RequestMapping("/j4")
    public String json4(){
        Date date = new Date();
        return JsonUtils.getJson(date);
    }

    @RequestMapping("/j5")
    public String json5(){

        User user1 = new User(1,"朱浩闻",24);
        User user2 = new User(2,"王磊",24);
        User user3 = new User(3,"夏清宇",24);
        User user4 = new User(4,"朱乐春",24);
        User user5 = new User(5,"肖总",24);
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        String string = JSON.toJSONString(userList);
        return string;
    }
}
