package com.training.threads1;

import com.training.logic.NumberLogic;

public class ThreadClient {

	public static void main(String[] args) throws InterruptedException {
		
		NumberLogic numberLogic =  new NumberLogic();
		// Create  Thread objects
		EvenThread evenThread=new EvenThread(numberLogic);
		Thread t1=new Thread(evenThread);
		
		t1.setName("even thread");
		
		OddThread oddThread=new OddThread(numberLogic);
		Thread t2=new Thread(oddThread);
		
		t2.setName("Odd Thread");
		
		t1.start();  // run()
		t2.start();  // run()

		Runnable depositThread=new Runnable()
				{
					@Override
					public void run() {
						numberLogic.deposit(1000);
						
					}
			
				};
		Thread t3=new Thread(depositThread); t3.setName("thread3");
		
		t3.start();	
		
	}

}
