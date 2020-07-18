package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *  EnableZuulProxy  包含了 EnableZuulService   设置该类失望观念
 *  EnableAutoConfiguration  可以办张渚 SpringBoot 应用将所有符合条件的 Configuration
 *  配置加载到当前 SpringBoot创建并使用得Ioc容器中
 *@description:  Spring Cloud 网关
 *@author: guoyicai
 *@time: 2020/7/17 11:03
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {
    public static void main(String args[]){
        SpringApplication.run(ZuulApplication.class,args);
    }
}
