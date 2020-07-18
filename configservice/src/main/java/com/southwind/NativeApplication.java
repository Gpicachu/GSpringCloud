package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *@EnableConfigServer：声明一个配置中心
 *
 *@description: 
 *@author: guoyicai
 *@time: 2020/7/18 14:43
 * 
 */
@SpringBootApplication
@EnableConfigServer
public class NativeApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(NativeApplication.class, args);
    }
}
