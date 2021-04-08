package com.training.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.listdemo.Book;

public class DeSerializeDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
		/*
		 * ObjectInputStream oOin = new ObjectInputStream(new
		 * FileInputStream("record.ser"));
		 * 
		 * List<String> list1 = (List<String>) oOin.readObject();
		 * System.out.println(list1);
		 */
		ObjectInputStream oOin = new ObjectInputStream(new FileInputStream("book.ser"));
		Book newBook = (Book) oOin.readObject();
		System.out.println(newBook);

		
		
	} 

}
 