package com.mine.springcloud.myspringcloudsrpingcloudgateway9529;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyspringcloudSrpingcloudgateway9529Application {
//测试时访问http://localhost:9529/dept/get/1    http://localhost:8001/dept/get/1
//测试时访问http://localhost:9529/dept/list    http://localhost:8001/dept/get/1
    public static void main(String[] args) {
        SpringApplication.run(MyspringcloudSrpingcloudgateway9529Application.class, args);
    }

}
