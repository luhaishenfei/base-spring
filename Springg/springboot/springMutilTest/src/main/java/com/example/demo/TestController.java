package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @RequestMapping("/multi")
    public void multiTest(String msg){
//        String msg="hello";
        System.out.println("" + new Date() + " : start : ThreadId " + Thread.currentThread().getId() + " : param : " + msg);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("" + new Date() + " : end : ThreadId " + Thread.currentThread().getId() + " : param : " + msg);
    }
}
