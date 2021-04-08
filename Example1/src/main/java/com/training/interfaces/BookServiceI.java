package com.training.interfaces;

import java.util.List;

import com.training.bean.Book;

public interface BookServiceI
	{
	List<Book> getAllBooks();
	boolean addBook(Book book);
	boolean deleteBook(String isbn);
	boolean updateStock(String isbn,long newStock);
	Book getBook(String isbn);
	}