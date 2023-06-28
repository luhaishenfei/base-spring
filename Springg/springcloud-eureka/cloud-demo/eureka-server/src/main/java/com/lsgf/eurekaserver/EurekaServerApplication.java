package com.lsgf.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//添加@EnableEurekaServer，该注解表明标注类是一个Eureka Server
@EnableEurekaServer
public class EurekaServerApplication {

    //项目来源https://www.cnblogs.com/binyue/p/12079356.html

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
