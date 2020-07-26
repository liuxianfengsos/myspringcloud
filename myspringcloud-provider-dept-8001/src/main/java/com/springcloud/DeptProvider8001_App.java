package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient//本服务启动后自动注册进eureka
public class DeptProvider8001_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_App.class, args);
	}

}
