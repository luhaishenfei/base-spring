package com.lsgf.controller;

import com.lsgf.pojo.Ct4Word;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HtmlController {
    @RequestMapping({"/", "/index"})
    public String toIndex(Model model) {
        model.addAttribute("msg", "Hello,Shiro");
        return "redirect:/index.html";
    }

    @RequestMapping({"/test"})
    public String toTestPage(Model model) {
        model.addAttribute("msg", "Hello,Shiro");
        return "redirect:/test.html";
    }

    @RequestMapping({"/toBilibili"})
    public String toBilibili(Model model) {
        return "redirect:https://www.bilibili.com";
    }

    @RequestMapping({"/shouye"})
    public String toShouYe(Model model) {
        model.addAttribute("msg", "Hello,Shiro");
        return "index";
    }


    @PostMapping("/queryByWord")
    public String queryByWord(@RequestParam("name") String name, @RequestParam("password") String password, Model model) {
        Ct4Word ct4Word=new Ct4Word();
        model.addAttribute("msg", "注册成功");
        System.out.println("注册成功");
        return "ct4WordList";
    }
}


