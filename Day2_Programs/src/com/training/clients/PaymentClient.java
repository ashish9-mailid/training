package com.training.clients;

import java.util.Scanner;

import com.training.classes1.CardPayment;
import com.training.classes1.CashPayment;
import com.training.interfaces.Payment;
import com.training.utility.Factory;

public class PaymentClient {

	public static void main(String[] args) {
		
		// Read choices from user
		System.out.println("Enter 1 for cash | 2 for Card");
		int choice = new Scanner(System.in).nextInt();
		
		Payment payment=Factory.getPaymentInstance(choice);
			
		payment.makePayment(5000);

	}

}
