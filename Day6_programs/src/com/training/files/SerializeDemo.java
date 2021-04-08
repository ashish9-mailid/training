package com.training.files;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.listdemo.Book;

public class SerializeDemo {

	public static void main(String[] args) throws Exception {
		/*
		 * List<String> list1=Arrays.asList("abc","xyz","sam");
		 * 
		 * ObjectOutputStream oout = new ObjectOutputStream(new
		 * FileOutputStream("record.ser")); oout.writeObject(list1);
		 */
		
		// Book object 
		
		Book book=new Book("4566", "Think Like a Monk", 250.50, 100);
		ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("book.ser"));
		oout.writeObject(book);

	} 

}
