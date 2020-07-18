package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 *
 *
 *@description: 注册中心启动类
 *@author: guoyicai
 *@time: 2020/7/15 16:54
 *
 * SpringBootApplication  声明该类是 Spring Boot 服务入口
 * EnableEurekaServer 声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册证中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaServiceApplication.class,args);
    }
}
