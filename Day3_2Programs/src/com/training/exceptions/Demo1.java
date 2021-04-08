package com.training.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		
		try {
		int x=Integer.parseInt(args[0]); // java Demo1 
		int y=Integer.parseInt(args[1]);  // java Demo1 12  java Demo1 12 2e
		System.out.println("Value:"+x/y);  // java Demo1 12 0   
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e)
		{
			//code
			//try catch
		//	System.out.println("execute with arguments : <number> <non-zero-number>");
		//	e.printStackTrace();
			System.out.println(e);
		}
		/*
		 * catch(ArithmeticException e) { e.printStackTrace(); }
		 * catch(NumberFormatException e) { System.out.println("Input is not a number");
		 * }
		 */
		catch(Exception e) { }
		
		
	}

}
