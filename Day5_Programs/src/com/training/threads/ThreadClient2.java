package com.training.threads;

import java.util.Comparator;
import java.util.TreeSet;

import com.training.logic.NumberLogic;
class Book {
	private String isbn;
	private String title;
	private double price;
	private long stock;
	
	public Book(String isbn, String title, double price, long stock) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.stock = stock;
	}

	public Book() {
		super();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}
	
	public String toString() {return isbn+" "+title;}

}
public class ThreadClient2 {

	public static void main(String[] args) {

		/*
		 * NumberLogic numberLogic = new NumberLogic();
		 * 
		 * Runnable evenThread = ()->{numberLogic.genEvenNumbers();}; new
		 * Thread(evenThread).start();
		 * 
		 * Runnable oddThread = ()->{numberLogic.genOddNumbers();}; new
		 * Thread(oddThread).start();
		 */
		
		Comparator<Book> c=(Book b1,Book b2)->{return b1.getIsbn().compareTo(b2.getIsbn());};
		
				TreeSet<Book> ts=new TreeSet<>(c);
				ts.add(new Book("345", "C", 10.50, 10));
				ts.add(new Book("644", "C", 10.50, 10));
				ts.add(new Book("123", "C", 10.50, 10));
				
				System.out.println(ts);
		
	}




}
