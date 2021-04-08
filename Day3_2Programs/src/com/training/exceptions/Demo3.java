package com.training.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {

	/*
	 * public static void writeFile(String data) { FileWriter fw; try { fw = new
	 * FileWriter("data.txt"); fw.write(data); fw.close(); } catch (IOException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 */
	
	public static  void writeFile(String data) throws IOException
	{
		FileWriter fw=null;
		
			fw = new FileWriter("data.txt");
			fw.write(data);
			fw.close();
				
	}
	
	public static void main(String[] args) throws IOException  {
		writeFile("Hello This is Java IO");
		
		
	}

	public static void m1() 
	{
		try {
			writeFile("Hello This is another Java IO");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}








