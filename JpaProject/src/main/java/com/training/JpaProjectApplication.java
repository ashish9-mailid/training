package com.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class JpaProjectApplication implements CommandLineRunner{
	
@Value("${message}")	
private String message;
	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	System.out.println("message:"+message);
		
	}

	
	
}
