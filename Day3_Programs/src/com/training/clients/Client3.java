package com.training.clients;

import com.training.classes.Book;
import com.training.nestedclasses.CustomerDemo;
import com.training.nestedclasses.MyComparator;
import com.training.nestedclasses.User;

public class Client3 {
	
	public void clientMethod()
	{
		User user2=new User("sam")
				{
					@Override
					public void operate(int x, int y) {
						System.out.println("Divide.."+x/y);
						
					}
			
				};
				user2.operate(56, 8);
				System.out.println(user2.getName());
	}

	public static void main(String[] args) {
		
		/*
		 * CustomerDemo.Customer customer = new CustomerDemo().new
		 * Customer("sam","sam@gmail.com");
		 * System.out.println(customer.getName()+" "+customer.getEmail());
		 */

		/*
		 * CustomerDemo cDemo=new CustomerDemo(); cDemo.user1.operate(34, 56);
		 */
		
		//new Client3().clientMethod();
		
		MyComparator<Integer> myComp=new MyComparator<Integer>()
				{
					@Override
					public int compare(Integer x, Integer y) {
						
						return x-y;
					}
			
				};
				
				System.out.println(myComp.compare(12, 45));
				
				
				MyComparator<Book> myBookComp=new MyComparator<Book>()
						{

							@Override
							public int compare(Book t1, Book t2) {
								
								//return (int) (t1.getPrice() - t2.getPrice());   // 100.5  100.8   -ve 
							Double d1=t1.getPrice();
							Double d2=t2.getPrice(); //autoboxing
							return d1.compareTo(d2);
							}
					
						};
						
						Book b1=new Book("345", "C", 100.5, 100);
						Book b2=new Book("78", "CPlus", 100.8, 100);
						
						System.out.println(myBookComp.compare(b1, b2));
				
		
	}

}







