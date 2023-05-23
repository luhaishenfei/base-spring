package com.lsgf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {
    @RequestMapping("/e")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}
