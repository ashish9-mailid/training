package com.training.classes;

import java.util.Arrays;

public class PrimeDemo {

	public static final int SIZE=10;
	
	public static boolean isPrime(int number)
	{
		for(int ctr=2;ctr<=number/2;ctr++)
		{
			if(number%ctr==0) return false;
		}
		return true;
	}
	
	public static int[] genPrimeNumbers(int low,int high)
	{
		int arr[]=new int[SIZE];
		int index=0;
		
		for(int number=low;number<=high;number++)
		{
			if(isPrime(number))
				//System.out.println(number);
				if(index < SIZE)
					arr[index++]=number;
					
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		//int number = Integer.parseInt(args[0]);
		int low = Integer.parseInt(args[0]);
		int high = Integer.parseInt(args[1]);
		
		int arr[] =genPrimeNumbers(low, high);
		
		//loop
		System.out.print("[");
		for(int i=0;i<SIZE;i++)
			System.out.print(arr[i]+",");
		
		System.out.println("]");
		
		System.out.println("___________________________");
		
		//method 2
		System.out.print("[");
		for(int n:arr)
		{
			System.out.print(n+",");
		}
		System.out.println("]");
	
		//library
		System.out.println(Arrays.toString(arr));
	}

}
