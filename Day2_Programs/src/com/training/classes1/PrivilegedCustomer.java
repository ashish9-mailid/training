package com.training.classes1;

public class PrivilegedCustomer extends Customer {
	
	private int rewardPoints;

	
	public PrivilegedCustomer() {
		super();
	//	this.custId = ++count;
	}

	public PrivilegedCustomer(String name, String city, String email, int rewardPoints) {
		//super(name, city, email);
		this.name=name;
		this.city=city;
		this.email=email;
		this.rewardPoints = rewardPoints;
		//this.custId = ++count;
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public String toString()
	{		
		return super.toString()+" "+rewardPoints;
	}
	
	public void giveOffers(double amount) {
		//System.out.println("You will get a discount of 5%");
		//System.out.println("Your net amount is :"+(amount - amount * 0.05));
		
		super.giveOffers(amount);
		System.out.println("You have earned 100 reward points");
	}
}
