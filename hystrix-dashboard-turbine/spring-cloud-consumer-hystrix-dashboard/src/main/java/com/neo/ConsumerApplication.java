package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
// 开启 EnableHystrixDashboard 后, 才能访问 http://xxxx:xx/hystrix, 打开进入断路器App监控页面的引导页
// 开启 EnableTurbine 后, 才能访问 http://xxxx:xx/turbine.stream, 进行 ping 多个断路器App数据
// 开启 EnableCircuitBreaker 后, 才能访问 http://xxxx:xx/hystrix.stream , 进行 ping 单个断路器App数据
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
