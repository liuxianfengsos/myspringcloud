package com.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	//添加轮训的随机算法，覆盖默认的轮询算法；
	@Bean
	public IRule myRule(){
		//return new RoundRobinRule();
		return new RetryRule();// 测试这个策略需要关闭8002然后80访问几次后会发现8002被甩开了。
	}
}
