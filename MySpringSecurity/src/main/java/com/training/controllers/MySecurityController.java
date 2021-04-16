package com.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecurityController {

	@GetMapping("/sayhello")
	public String sayHello()
	{
		return "Hi !! Welcome to Spring Security";
	}
	// user is the username
	
	@GetMapping("/hello/user")
	public String sayHelloUser()
	{
		return "Hi User! This is for User";
	}
	
	@GetMapping("/hello/admin")
	public String sayHelloAdmin()
	{
		return "Hi Admin! This is for Admin";
	}
}
