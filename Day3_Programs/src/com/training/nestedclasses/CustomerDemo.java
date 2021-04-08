package com.training.nestedclasses;

public class CustomerDemo{
		
	public User user1=new User() // anonymous inner class , child class of User
			{
				@Override
				public void operate(int x, int y) {
					System.out.println("Adding :"+(x+y));
					
				}
			};
		
			/*
			 * public User getUser() { return user1; }
			 */
	
	/*public class Customer extends User
	{
		private String email;
		public Customer(String name,String email)
		{ 
			super(name); this.email=email;
			
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}*/
	

}
