package com.zlt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZltEurekaApplication11 {
    public static void main(String[] args ){
        SpringApplication.run(ZltEurekaApplication11.class,args);
    }
}
