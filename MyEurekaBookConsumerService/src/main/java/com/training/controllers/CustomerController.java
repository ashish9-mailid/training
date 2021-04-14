package com.training.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.bean.Book;

@RequestMapping("/customer/api")
@RestController
public class CustomerController {
	@Autowired
	private RestTemplate restTemplate;

	private String producerUrl = "http://localhost:8090/bookstore/api/getbook/isbn/{isbn}";
	//http://localhost:8093/customer/api/getpbook/isbn/456/qty/10
	@GetMapping("/getpbook/isbn/{isbn}/qty/{qty}")
	public Book getPurchasedBook(@PathVariable("isbn") String isbn,
			@PathVariable("qty") int qty)
	{
		
		Map<String,String> map=new HashMap<>();
		map.put("isbn", isbn);
		
		Book purchasedBook = restTemplate.getForObject(producerUrl, Book.class, map);
		purchasedBook.setQty(qty);
		purchasedBook.setAmount(qty * purchasedBook.getPrice());
		
		return purchasedBook;
	}
	
	@Bean
	RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
}
