package com.training.utility;

import com.training.classes1.Customer;
import com.training.classes1.Employee;
import com.training.classes1.PrivilegedCustomer;
import com.training.classes1.User;

public class Utility  {

	public static void printOffers(User ref,double amount) {
		
		/*
		 * if(ref instanceof Customer) {
		 * System.out.println(((Customer)ref).getCustId());
		 * 
		 * }
		 */
		 
		
		ref.giveOffers(amount);
		
		
	}

}

