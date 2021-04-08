package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	@GetMapping("/start")
	public String start()
	{
		return "hello.html";
	}
	
	@ResponseBody
	@GetMapping("/hello")
	public String sayHello(@RequestParam("name") String name)
	{
		return "Hello Spring Boot  "+name;
	}

}
