package com.training.classes;

class A
{
	//public A(int x) {this();System.out.println(" Para A Called ");}
	//public A() {System.out.println(" Default A Called "); }
	
	//overloading same but different signatures () , (int,int)
	//public void m1() {System.out.println("M1 default");}
	
	// public void m1(int p,int q) { } // not valid
	
	public void m1(int x,int y) {System.out.println(" m1 in A");}
	
		
}

class B extends A
{
	/*
	 * public B() { } public B(byte y) {this(6);
	 * System.out.println("Para B called");}
	 * 
	 * public B(double d) {System.out.println("double");}
	 * 
	 * public void m1() {System.out.println("m1 in B customized");} // overriding
	 * public void m1(int z) {System.out.println("m1 in B customized");}
	 * //overloading
	 *///	public void m1(int z,int p) {System.out.println("m1 in B new");} //not valid
	
	public void m1(int z,int p) {System.out.println("m1 in B new");} // Overriding
	public void testB() {System.out.println("test B"); }
} 

class C extends B
{
	public C() {super(); }
	public void m1(int z,int p) {System.out.println("m1 in C new");} // Overriding
	
	public void testC() {System.out.println("test C"); }
}

class D extends A
{
	
}
	
 public class Demo {

	public static void main(String[] args) {
		
		//A ob = new A(); //Default A Called
		
		/*
		 * B ob1=new B(5);//Default A Called Default B called
		 * 
		 * ob1.m1(); System.out.println(ob1 instanceof B);//true System.out.println(ob1
		 * instanceof A);//true System.out.println(ob1 instanceof C);//false
		 * 
		 * C ob2=new C(); ob2.m1();
		 * 
		 * D ob3=new D(); ob3.m1(); System.out.println(ob3 instanceof A);//true
		 * System.out.println(ob3 instanceof D);//true
		 */		//System.out.println(ob3 instanceof B);
		
		/*
		 * System.out.println(5+6);//11 System.out.println("sum"+5+6);//sum56
		 */	
		
		/*
		 * B ob=null; //local variable has to be initialized ob=new B();
		 * 
		 * 
		 * System.out.println(ob.m1(56, 78));// m1
		 */	
		
		A ob =new B();
		ob.m1(12, 34); // m1 of B
		
	
		//B ob1=(B)ob;
		
		((B)ob).testB();
		
		ob=new C();
		
		ob.m1(67, 78);
		((C)ob).testC();
		
	}

}
 
 
 
 
 
