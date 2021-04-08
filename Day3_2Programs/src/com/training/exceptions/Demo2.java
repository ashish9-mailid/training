package com.training.exceptions;

public class Demo2 {

	public static int operate(int x,int y)
	{
		try {
		return x/y;
		}
		catch(ArithmeticException e)
		{
			return -999;
		}
		finally {
		System.out.println("Finishing statements");
		}
	}
	public static void main(String[] args) {
		System.out.println("Result:"+operate(10,2));
		System.out.println("Result:"+operate(6,0));
	}
}
