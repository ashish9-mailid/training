package com.training.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {

		File file = new File("d:\\test.csv");

		FileWriter fw=new FileWriter(file,true);
		fw.write("2345");
		fw.write(",");
		fw.write("C");
		fw.write(",");
		fw.write("150.0");
		fw.write(",");
		fw.write("100");
		fw.close();
		
		
	}


}


