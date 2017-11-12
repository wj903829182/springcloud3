package com.jack.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
//通过@EnableFeignClients开启feign客户端支持
@EnableFeignClients
//通过@EnableCircuitBreaker开启CircuitBreaker的支持
@EnableCircuitBreaker
//通过@EnableZuulServer开启网关带的支持
@EnableZuulServer
public class UiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}
}
