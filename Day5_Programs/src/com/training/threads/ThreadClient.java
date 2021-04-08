package com.training.threads;

import com.training.logic.NumberLogic;

public class ThreadClient {

	public static void main(String[] args) throws InterruptedException {
		
		NumberLogic numberLogic =  new NumberLogic();
		// Create  Thread objects
		EvenThread evenThread=new EvenThread(numberLogic);
		evenThread.setName("even thread");
		OddThread oddThread=new OddThread(numberLogic);
		oddThread.setName("Odd Thread");
		//System.out.println(evenThread.getPriority());
		//Start the threads
		evenThread.start();  // run()
		oddThread.start();  // run()

		/*
		 * //evenThread.start(); System.out.println("Even:"+evenThread.isAlive());
		 * System.out.println("Odd:"+oddThread.isAlive());
		 * 
		 * evenThread.join(); // current executing thread main() holds till the invoking
		 * thread evenThread completes. oddThread.join();
		 * 
		 * 
		 * System.out.println("Even:"+evenThread.isAlive());
		 * System.out.println("Odd:"+oddThread.isAlive());
		 * 
		 * System.out.println("....End of Main.....");
		 */
	}

}
