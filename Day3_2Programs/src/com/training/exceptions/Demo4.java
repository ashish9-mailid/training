package com.training.exceptions;

import java.util.Scanner;

public class Demo4 {
	
	public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		try {
		if(n<0)
			//throw new ArithmeticException("Enter a positive no or 0");
			//throw new Exception("Enter a positive no or 0");
			throw new NoNegativeNumberException("Enter a positive no or 0");
		
		System.out.println("n="+n*n);
		}catch(Exception e) {System.out.println(e.getMessage()); System.out.println(e);}
	}

}
