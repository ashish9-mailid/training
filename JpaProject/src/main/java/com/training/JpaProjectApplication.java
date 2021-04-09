package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.training.bean.Book;
import com.training.repo.BookRepo;

@Configuration
@SpringBootApplication
public class JpaProjectApplication implements CommandLineRunner{

@Autowired	
private BookRepo bookRepo;
	
@Value("${message}")	
private String message;
	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	//System.out.println("message:"+message);
	
	/*
	 * System.out.println(bookRepo.count()); System.out.println(bookRepo.findAll());
	 * System.out.println(bookRepo.findById("456").get());
	 */
	//System.out.println(bookRepo.getOne("456"));
	/*
	 * Book b1=new Book("6789", "Python", 175.50, 200);
	 * System.out.println(bookRepo.save(b1));
	 */
	
	//Book b2=bookRepo.findById("456").get();
	//update stock
	/*
	 * b2.setStock(270); bookRepo.save(b2);
	 */

	/*
	 * System.out.println(bookRepo.findByTitle("C"));
	 * 
	 * System.out.println(bookRepo.findByStock(100));
	 * 
	 * System.out.println(bookRepo.findByIsbnAndTitle("111", "C"));
	 * 
	 * System.out.println(bookRepo.findByStockLessThan(200));
	 * System.out.println(bookRepo.findByTitleLike("C%"));
	 */
	//	System.out.println(bookRepo.abc("p%"));	
		
	//	System.out.println(bookRepo.booksLessThanStock(200));
		
		System.out.println(bookRepo.updateStock(100, 60));
	
	}
	
	

	
	
}
