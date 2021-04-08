package com.training.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.training.bean.Book;

@Component
public class BookStore {

	List<Book> books;
	
	public BookStore()
	{
		books = new ArrayList<>();
		books.add(new Book("2345", "Think like a Monk", 250.50, 100));
		books.add(new Book("789", "Alchemist", 150.50, 100));
	}
	
	public List<Book> getAllBooks()
	{
		return books;
	}
	
}
