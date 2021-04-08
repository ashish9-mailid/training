package com.training.utility;

import com.training.classes1.CardPayment;
import com.training.classes1.CashPayment;
import com.training.interfaces.Payment;

public class Factory {

	public static Payment getPaymentInstance(int choice) {

		Payment payment=null;
		switch(choice)
			{
			case 1:payment = new CashPayment();break;
			case 2: payment = new CardPayment();break;
				
			}
		return payment;
	}

}
