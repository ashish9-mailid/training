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
import com.training.interfaces.MyFeignClient;

@RequestMapping("/customer/api")
@RestController
public class CustomerControllerFeign {
	
	@Autowired
	private MyFeignClient myFeignClient;
	
	//http://localhost:8093/customer/api/getpbook/isbn/456/qty/10
	@GetMapping("/getpbookfeign/isbn/{isbn}/qty/{qty}")
	public Book getPurchasedBook(@PathVariable("isbn") String isbn,
			@PathVariable("qty") int qty)
	{
		Book purchasedBook = myFeignClient.getBook(isbn);
		purchasedBook.setQty(qty);
		purchasedBook.setAmount(purchasedBook.getPrice() * qty);
		
		return purchasedBook;
	}
	
	
	
}
