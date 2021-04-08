package com.training.classes;

public class Employee {
	private String name;
	private int age;
	private Address address;//has a
	private Car car;  //has a relation
	
	public Employee() {
		super();
	}
	public Employee(String name, int age, Car car,Address address) {
		super();
		this.name = name;
		this.age = age;
		this.car=car;
		this.address=address;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	/*
	 * public void travels(Car car) {
	 * 
	 * 
	 * System.out.println("Travels in "+car.getColor()+" "+car.getModel());
	 * 
	 * }
	 */
	

}
