package com.lsgf.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//只要实现了Controller接口的类，说明这就是一个控制器了
//这种方法可以省去spring里下面三个配置
//    <context:component-scan base-package="com.lsgf.controller"/>
//    <mvc:default-servlet-handler/>
//    <mvc:annotation-driven/>
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg","ControllerTest1");
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
