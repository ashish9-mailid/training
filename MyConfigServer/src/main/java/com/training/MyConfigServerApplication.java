package com.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@RestController
@SpringBootApplication
public class MyConfigServerApplication {

	@Value("${message}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(MyConfigServerApplication.class, args);
	}

	@GetMapping("/getmessageserver")
	public String getMessage()
	{
		return message;
	}
}
