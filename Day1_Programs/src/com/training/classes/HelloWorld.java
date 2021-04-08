package com.training.classes;

public class HelloWorld {

	public static int sumTotal(String[] abc) // instance
	{
		int sumTotal = 0;
		for(int i=0;i < abc.length ; i++)
		{
			sumTotal+=Integer.parseInt(abc[i]);
		}
		return sumTotal;
	}
	
	public static void main(String[] abc) {
		
		System.out.println("Sum = "+sumTotal(abc));
		/*
		 * System.out.println("Hello world java!!!");
		 * 
		 * int x=Integer.parseInt(abc[0]); int y=Integer.parseInt(abc[1]); int sum=x+y;
		 * 
		 * System.out.println("Sum of "+x+" and "+y+"="+sum);
		 */
		
		//sum of n numbers
		
		
	

	}
	
	// sum of n numbers
	
	
}
