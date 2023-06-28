package com.lsgf.controller;

import com.lsgf.pojo.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    //    localhost:8080/05/user/t1?name1=xxxx
    @GetMapping("/t1")
    public String test1(@RequestParam("name1") String name, Model model) {
        //1.接受前端参数
        System.out.println("接收到前端的参数为:" + name);
//        2.将返回的结果传递给前端
        model.addAttribute("msg", name);
//          3.视图跳转
        return "test";
    }


    //前端接受的是一个对象：id,name,age
    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user);

        return "test";
    }

    @GetMapping("/t3")
    public String test3(User user, ModelMap map) {
//        map.addAttribute();


        return "test";
    }
}
