package com.training.classes;

public class Client {

	public static void main(String[] args) {
	
		Car car = new Car("red", "Alto");
		Car car2=new Car();
		
		System.out.println(car.getColor()+" "+car.getModel());
		System.out.println(car2.getColor()+" "+car2.getModel());
		
		car2.setColor("blue");
		System.out.println(car2.getColor()+" "+car2.getModel());
		
		Address address=new Address(101, "blr");
		
		Employee sam=new Employee("sam", 23,car,address);
		
		System.out.println(sam.getName()+" is "+sam.getAge()+" years and drives "+sam.getCar().getColor()+" "+sam.getCar().getModel());
		System.out.println(sam.getName()+" lives in"+sam.getAddress().getCity());
		
		
		
	}

}
