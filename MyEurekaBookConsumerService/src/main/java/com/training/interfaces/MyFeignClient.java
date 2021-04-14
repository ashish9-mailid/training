package com.training.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.bean.Book;

@FeignClient(name="bookstore", url="localhost:8090") 
public interface MyFeignClient {
	
	@GetMapping("/bookstore/api/getbook/isbn/{isbn}")
	public Book getBook(@PathVariable("isbn") String isbn);

}
