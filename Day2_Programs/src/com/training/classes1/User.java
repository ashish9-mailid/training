package com.training.classes1;



final class X  
{
	
}
public abstract class User  {

	protected String name;
	protected String city;
	public User() {
		super();
	}
	public User(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return name+" "+city;
	}
	
	   public abstract void giveOffers(double amount);
	
	public final void m1() { } // cannot be overridden
	
}






