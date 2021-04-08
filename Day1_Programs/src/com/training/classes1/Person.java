package com.training.classes1;

import com.training.classes.Address;

public class Person {
	
	private String name; //null
	private Address address;//null has a 
	public Person() {
		super(); //Object()
	}
	public Person(String name, Address address) {
		super(); //Object()
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
