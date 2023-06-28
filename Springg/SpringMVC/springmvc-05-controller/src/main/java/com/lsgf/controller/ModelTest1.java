package com.lsgf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {
    //需要注解掉spring的视图解析器 不然会拼接 从而地址错误

    @RequestMapping("/m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "test";
    }

    @RequestMapping("/m1/t2")
    public String test2(Model model){
        model.addAttribute("msg","okokokok");
        //转发一
//        return "/WEB-INF/jsp/test.jsp";
        //转发二
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/m1/t3")
    public String test3(Model model){
        model.addAttribute("msg","okokokok");
        //重定向（url地址栏发生改变）
        return "redirect:/index.jsp";
    }
}
