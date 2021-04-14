package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
//@EnableDiscoveryClient
@SpringBootApplication
public class MyEurekaBookConsumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaBookConsumerServiceApplication.class, args);
	}

}
