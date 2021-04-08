package com.training.classes1;

import com.training.interfaces.Payment;

public class Customer extends User {
	protected long custId;
	protected String email;
	protected static int count;

		
	{
		this.custId=++count;
	}
	public Customer() {
		super();
		//this.custId = ++count;
	}

	public Customer(String name, String city, String email) {
		//super(name, city);
		this.name=name;
		this.city=city;
	//	this.custId = ++count;
		this.email = email;
	}
	
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString()
	{		
		return super.toString()+" "+custId+" "+email;
	}

	
	 public void giveOffers(double amount) {
		System.out.println("You will get a discount of 5%");
		System.out.println("Your net amount is :"+(amount - amount * 0.05));
		
	}


	
	

}
