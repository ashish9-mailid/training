package com.training.clients;

import com.training.interfaces.I1;
import com.training.interfaces.I2;

public class TestClass implements I1,I2{

	public static void test()
	{
		System.out.println(I1.PI);
	}
	public static void main(String[] args) {
		test();

	}
	@Override
	public void m1() {
		System.out.println("implemented");
		
	}

}
