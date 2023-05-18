package com.lsgf.eurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @RequestMapping("sayHello")
    public String sayHello(String param) {
        return "hello" + param;
    }
}
