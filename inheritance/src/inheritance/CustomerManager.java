package inheritance;

import java.util.Iterator;

public class CustomerManager {
	public void add(Customer customer) {
		/*
		 * Some times we may want to access other fields e.g Corporate's any field.
		 * Unboxing is the name of the solution about this problem.
		 */
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}

//SOLID - Open Closed Principle
