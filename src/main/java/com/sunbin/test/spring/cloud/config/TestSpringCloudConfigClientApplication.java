package com.sunbin.test.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // 开启发现服务功能
@SpringBootApplication
public class TestSpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudConfigClientApplication.class, args);
	}

}
