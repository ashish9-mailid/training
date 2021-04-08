package com.training.threads1;

import com.training.logic.NumberLogic;

public class OddThread extends Thread {
	private NumberLogic numberLogic;

	public OddThread(NumberLogic numberLogic)
	{
		this.numberLogic=numberLogic;
	}
	
	public void run()
	{
		//numberLogic.genOddNumbers();
		numberLogic.withdraw(3000);
	}
}
