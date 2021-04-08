package com.training.java8;

@FunctionalInterface
public interface I1 {
	public void add(int x,int y);
		
	public default void default1() {System.out.println("default1"); }
	
	public static void static1() {System.out.println("static method");}
}

/* Comparable - compareTo(..)

	Comparator - compare(....)
	Runnable -- run(..)
*/