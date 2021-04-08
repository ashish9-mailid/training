package com.training.threads;

import com.training.logic.NumberLogic;

public class EvenThread extends Thread {
private NumberLogic numberLogic;

public EvenThread(NumberLogic numberLogic)
{
	this.numberLogic=numberLogic;
}
	
	public void run()
	{
		//numberLogic.genEvenNumbers();
		numberLogic.withdraw(1500);
		
	}
}
