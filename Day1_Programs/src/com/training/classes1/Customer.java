package com.training.classes1;

import com.training.classes.Address;
import com.training.classes.Employee;

public class Customer extends Person{ // is a 

	private int customerId; //instance variable 0
		private double walletBalance;//instance variable 0.0
	private static int count;//static 0
	
	public Customer() { }
	
	public Customer(String name,Address address,double walletBalance)
	{
		//super(); // Person()
		super(name,address);
		this.customerId = ++count;
		this.walletBalance=walletBalance;
	}
	
	
	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public int getCustomerId() {
		return customerId;
	}
	

	public static int getCount() {
		return count;
	}
}
