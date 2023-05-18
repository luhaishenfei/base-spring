package com.lsgf.config;

import com.lsgf.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lsgf.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法中的名字，就相当于bean标签中的 id属性
    //这个方法中的返回值，就相当于bean标签中的 class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }
}
