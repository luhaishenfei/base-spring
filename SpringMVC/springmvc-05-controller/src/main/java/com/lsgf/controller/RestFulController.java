package com.lsgf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    //   原来的： http://localhost:8080/05/add?a=1&b=2
    @RequestMapping("/add")
    public String test(int a, int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为" + res);
        return "test";
    }

    //    RestFul：http://localhost:8080/05/add/1/2
    @RequestMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable String b, Model model){
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }

    //    RestFul：http://localhost:8080/05/add/1/2
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test3(@PathVariable int a, @PathVariable String b, Model model){
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }

    //    RestFul：http://localhost:8080/05/add/1/2
    @GetMapping("/add/{b}/{a}")//等价于    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test4(@PathVariable int a, @PathVariable String b, Model model){
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
}
