package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.config.MyConfiguration;


@SpringBootApplication
public class Example1Application implements CommandLineRunner{

	@Autowired
	private MyConfiguration config;
	
	public static void main(String[] args) {
		SpringApplication.run(Example1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(config.getMessage());
		
	}
	
	
}
	
	
	
	

