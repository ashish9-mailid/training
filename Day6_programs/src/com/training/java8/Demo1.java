package com.training.java8;

//Java 8 lambda expressions



public class Demo1 {

	
	public static void main(String[] args) {
		I1.static1();
		
		I1 i1=new I1()
				{
					@Override
					public void add(int x, int y) {
					
						System.out.println("adding:"+(x+y));
						
					}
			
				};
		
				i1.add(12, 34);
			
		I1 i2 = (int a,int b)->System.out.println("Implementing add:"+(a+b));		
		i2.add(56, 89);
				
			
		
		Thread t1=new Thread(()->{for(int i=0;i<=5;i++) System.out.println(i);});
		t1.start();
	
	}

	

}
