package com.training.bean;

import java.io.Serializable;

public class Book implements Serializable{
	private String isbn;
	private String title;
	private double price;
	private transient long stock;
	
	public Book(String isbn, String title, double price, long stock) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.stock = stock;
	}
	
	public boolean equals(Object obj)  // b1.equals(b2)
	{
		Book b2=(Book)obj;
			
		return isbn.equals(b2.getIsbn());
	}
	
	public int hashCode()
	{
		return isbn.hashCode();
		
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
	
	public String toString()
	{
		return isbn+" "+title+" "+price+" "+stock;
	}

}
