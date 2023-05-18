package com.lsgf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
//    localhost:8080/hello/h1
    @RequestMapping("/h1")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg","Hello,SpringMCVAnnotation!");

        return "hello";//会被视图解析器处理

    }
    @RequestMapping("/h2")
    public String hello2(Model model) {
        //封装数据
        model.addAttribute("msg","Hello,SpringMCVAnnotation222!");

        return "hello";//会被视图解析器处理

    }
    @RequestMapping("/h3")
    public String hello3(Model model) {
        //封装数据
        model.addAttribute("msg","Hello,SpringMCVAnnotation333!");

        return "hello";//会被视图解析器处理

    }


}
