package com.training.classes1;

public class Employee extends User {
	private long empId;
	private String dept;
	public Employee() {
		super();
	}
	public Employee(String name, String city, long empId, String dept) {
		//super(name, city);
		this.name=name;
		this.city=city;
		this.empId = empId;
		this.dept = dept;
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public void giveOffers(double amount) {
		System.out.println("You will get a discount of 5%");
		System.out.println("Your net amount is :"+(amount - amount * 0.2));

		
	}
	
	public String toString()
	{
		return super.toString()+" "+empId+" "+dept;
	}
	
	
}
