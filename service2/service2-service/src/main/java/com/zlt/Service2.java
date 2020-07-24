package com.zlt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.xml.ws.Service;
@SpringBootApplication
@EnableDiscoveryClient
public class Service2 {
    public static void main(String[] args){
        SpringApplication.run(Service2.class , args);
    }
}
