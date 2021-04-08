package com.training.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\test.csv");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);

		String line=null;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			String data[] = line.split(",");
			System.out.println(data[0]);

		}
	}

}
