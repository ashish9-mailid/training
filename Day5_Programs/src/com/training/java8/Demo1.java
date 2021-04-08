package com.training.java8;

//Java 8 lambda expressions



public class Demo1 {

	
	public static void main(String[] args) {
		I1.static1();
	/*	
		I1 i1=new I1()
				{
					@Override
					public void add(int x, int y) {
					
						System.out.println("adding:"+(x+y));
						
					}
			
				};
		

				i1.add(12, 34);*/
				
		I1 i2 = (int x,int y)->System.out.println("adding:"+(x+y));	
		
		i2.add(34, 45);
	}

	

}
