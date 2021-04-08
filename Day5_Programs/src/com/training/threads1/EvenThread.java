package com.training.threads1;

import com.training.logic.NumberLogic;

public class EvenThread implements Runnable {
private NumberLogic numberLogic;

public EvenThread(NumberLogic numberLogic)
{
	this.numberLogic=numberLogic;
}
	
	public void run()
	{
		//numberLogic.genEvenNumbers();
		numberLogic.withdraw(500);
		
	}
}
