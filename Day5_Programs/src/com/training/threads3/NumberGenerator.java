package com.training.threads3;

import java.util.Random;

public class NumberGenerator {
	private int sum;
	//private int array[]=new int[5];
	private boolean flag; // false

	public synchronized void genRandomGenerator()
	{
		Random r=new Random();
		int index=0,i=1;
		for(;i<=5;i++) { 
			int n =r.nextInt(10)+1;
			System.out.println("Number generated is:"+n);
			try {
				Thread.sleep(500); // does not release the lock
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sum+=n;
			//array[index++]=n;
		}
		flag=true;notify();
		}

		public  synchronized  void calcSum()
	{
		if(!flag)
			try {
				wait(); // releases the lock
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		System.out.println("Sum:"+sum); 
	
	}
	



}
