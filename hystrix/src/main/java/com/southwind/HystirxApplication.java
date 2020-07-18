package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * EnableCircuitBreaker   声明启用数据监控
 * EnableHystrixDashboard 声明启用 可视化数据监控
 *
 *@description:
 *@author: guoyicai
 *@time: 2020/7/17 18:31
 *
 */

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystirxApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystirxApplication.class,args);
    }
}
