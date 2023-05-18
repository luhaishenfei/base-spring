package com.lsgf.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    //告诉Spring 这是一个异步的方法
    @Async
    public void hello(){
        System.out.println("数据准备处理");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据正则处理");
    }
}
