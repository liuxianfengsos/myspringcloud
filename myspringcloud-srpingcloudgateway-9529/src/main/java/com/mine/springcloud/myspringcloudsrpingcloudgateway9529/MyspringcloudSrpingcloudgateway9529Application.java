package com.mine.springcloud.myspringcloudsrpingcloudgateway9529;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyspringcloudSrpingcloudgateway9529Application {
//测试时访问http://localhost:9529/hello?url=baidu 由于百度没有hello组件所以会报错误页面
    public static void main(String[] args) {
        SpringApplication.run(MyspringcloudSrpingcloudgateway9529Application.class, args);
    }

}
