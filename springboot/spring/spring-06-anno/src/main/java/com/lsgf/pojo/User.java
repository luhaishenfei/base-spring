package com.lsgf.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.lsgf.pojo.User">
@Component
//单列模式
@Scope("singleton")
public class User {
    //    @Value("zhw")
    public String name;

    @Value("zhw")
    public void setName(String name) {
        this.name = name;
    }
}
