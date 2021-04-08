package com.training.clients;

import com.training.nestedclasses.Building;

public class NestedClassDemo {

	public static void main(String[] args) {
		
		Building b1=new Building(5000);
		Building.Room r1=b1.new Room(100);
		b1.m1B();
		r1.m1Room();
		
		
	}
}
