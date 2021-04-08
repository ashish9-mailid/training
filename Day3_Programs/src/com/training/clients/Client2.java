package com.training.clients;

import com.training.nestedclasses.Building1;

public class Client2 {

	public static void main(String[] args) {
				
		Building1.mStatic();
		Building1.Room1 room1= new Building1.Room1(100); // new Building().new Room()
		room1.m1Room1();

	}

}
