package com.training.nestedclasses;

public class Building1 {
	private double area;
	public Building1(double area) {this.area = area;}
	public Building1() { }
	public void m1B1() {System.out.println(("area of bldg:"+area));}

	public static void mStatic() {System.out.println("static");}
	
	public static class Room1 
	{
		private double area;
		//private static int x;
		public Room1() { }
		public Room1(double area) {this.area=area;}
		public void m1Room1() {int z=10; mStatic();System.out.println("area of room="+area);
		//System.out.println("Area of Buiding:"+Building1.this.area);
		}
		
		public static void m1() { }
	}
}
