package com.training.nestedclasses;

public class Building {
	private double area;
	public Building(double area) {this.area = area;}
	public Building() { }
	public void m1B() {System.out.println(("area of bldg:"+area));}

	public class Room 
	{
		private double area;
		//private static int x;
		public Room() { }
		public Room(double area1) {this.area=area;}
		public void m1Room() {int z=10; m1B();System.out.println("area of room="+area);
		System.out.println("Area of Buiding:"+Building.this.area);}
		
		
		
		//public static void m1() { } //error
	} 
}
