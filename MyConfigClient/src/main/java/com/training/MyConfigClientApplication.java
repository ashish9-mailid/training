package com.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@SpringBootApplication
public class MyConfigClientApplication {
	@Value("${message}")
	private String message;
	
	public static void main(String[] args) {
		SpringApplication.run(MyConfigClientApplication.class, args);
	}

	@GetMapping("/getmessageclient")
	public String getmessage()
	{
	return message;	
	}
}
