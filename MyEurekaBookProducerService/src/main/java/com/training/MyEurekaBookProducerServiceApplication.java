package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableDiscoveryClient
@SpringBootApplication
public class MyEurekaBookProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaBookProducerServiceApplication.class, args);
	}

}
