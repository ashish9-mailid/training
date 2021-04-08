package com.training.threads3;

public class ThreadsClient {

	public static void main(String[] args) {

		NumberGenerator ng=new NumberGenerator();

		Thread t1=new Thread()
		{
			public void run()
			{
				ng.genRandomGenerator();
			}
		};
		
		Thread t2=new Thread()
		{
			public void run()
			{
				ng.calcSum();
			}
		};
		
		t1.start();t2.start();
		
	}
}
