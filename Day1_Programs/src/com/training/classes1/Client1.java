package com.training.classes1;

import com.training.classes.Address;

public class Client1 {

	public static void main(String[] args) {
		
		Address address=new Address(101, "Bangalore");
		Customer john=new Customer("Johnson", address, 100.00);
		System.out.println(john.getCustomerId());
		System.out.println(john.getName()+" "+john.getAddress().getCity());

		
		System.out.println(Customer.getCount());
	}

}
