package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableZuulProxy
@SpringBootApplication
public class MyZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyZuulGatewayApplication.class, args);
	}

	@Bean
	public RouteFilter getFilter()
	{
		return new RouteFilter();
	}
	
	@Bean
	public PreFilter getPreFilter()
	{
		return new PreFilter();
	}
}
