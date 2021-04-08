package com.training.logic;

public class NumberLogic {
	
	{
	synchronized(this) {
	System.out.println("test");
	}
	}
	
	public NumberLogic()
	{
		
	}
	private double balance=2000; // min should be 500
	
	public /* synchronized */ void withdraw(double amount)
	{
		if(balance-amount > 500) {
		System.out.println("Withdraw request is taken"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			System.out.println("processing thread:"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this) {
		balance-=amount;
		System.out.println("Balance:"+balance);
		}}
		else
		{
			System.out.println("Insufficient Balance.."+Thread.currentThread().getName());
		}
	}
	
	public synchronized void deposit(double amount)
	{
		
		System.out.println("Deposit request is taken"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			System.out.println("processing thread:"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance+=amount;
		System.out.println("Balance:"+balance);
				
	}
	
	
	
	public void genEvenNumbers() 
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=2;i<10;i+=2)
		{
			System.out.println("Even:"+i);
			try {
				Thread.sleep(1000);
				System.out.println("processing thread:"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//interrupt()
		}
	}
	public void genOddNumbers()
	{
		//System.out.println("Odd Threads");
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=11;i+=2)
		{
			System.out.println("Odd:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
