package com.lsgf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/t1")
    public String test(){

        return "test";
    }
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg","adminTest");

        return "admin/testadmin";
    }
}
