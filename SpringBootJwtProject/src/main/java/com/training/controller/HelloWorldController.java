package com.training.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/buy")
	public String Buy() {
		return "You are buying products";
	}

}

/* localhost:8080/authenticate -- POST 
 * a token will get generated JWT 
 hello send the token as Authorization header
 */
