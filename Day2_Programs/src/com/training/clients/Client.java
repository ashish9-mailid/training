package com.training.clients;

import com.training.classes1.Customer;
import com.training.classes1.Employee;
import com.training.classes1.PrivilegedCustomer;
import com.training.classes1.User;
import com.training.utility.Utility;

public class Client {

	public static void main(String[] args) {
	
		Customer customer = new Customer("sam", "Mysore", "sam@gmail.com");
	
		System.out.println(customer); //toString() 
		
		PrivilegedCustomer pCustomer = new PrivilegedCustomer("John", "Jaipur", "john@gmail.com", 200);
		
		System.out.println(pCustomer);
		
	//	User user=new User();
		
		Employee emp = new Employee("Ajay", "Mumbai", 5677, "Sales");
		System.out.println(emp);
		
		Utility.printOffers(emp,2000);
		Utility.printOffers(customer,3000);
		Utility.printOffers(pCustomer,7000);
		
	

	}

}
