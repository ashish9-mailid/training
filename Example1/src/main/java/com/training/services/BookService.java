package com.training.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Book;
import com.training.interfaces.BookServiceI;
import com.training.store.BookStore;

@Service
public class BookService implements BookServiceI{
	
	@Autowired
	private BookStore bookStore;
	
	public List<Book> getAllBooks()
	{
		return bookStore.getAllBooks();
	}

	@Override
	public boolean addBook(Book book) {
		
		return bookStore.getAllBooks().add(book);
	}

	@Override
	public boolean deleteBook(String isbn) {
		List<Book> books = bookStore.getAllBooks();
		for(Book b:books)
		{
			if(b.getIsbn().equalsIgnoreCase(isbn))
			{
				books.remove(books.indexOf(b));return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateStock(String isbn, long newStock) {
		List<Book> books = bookStore.getAllBooks();
		for(Book b:books)
		{
			if(b.getIsbn().equalsIgnoreCase(isbn))
			{
				b.setStock(b.getStock()+newStock);return true;
			}
		}
		return false;
	}

	@Override
	public Book getBook(String isbn) {
		
		List<Book> books = bookStore.getAllBooks();
		for(Book b:books)
		{
			if(b.getIsbn().equalsIgnoreCase(isbn))
			{
				return b;
			}
		}
		return null;
	}
	
	

}
