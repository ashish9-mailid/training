package com.training.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("d:\\test.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		else
		{
			System.out.println("File Exists");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("d:\\test1.txt");
			String line=null;
			while((line=br.readLine())!=null)
			{System.out.println(line);
			//copy to test1.txt
			
			fw.write(line+"\n");
			
			}
			fw.close();
		}
	}


}


