package by.htp.less14.customer.presentation;

import java.util.ArrayList;

import by.htp.less14.customer.entity.Customer;

public class CustomerView {
	
	public void printList(ArrayList<Customer> list) {
		for(Customer customer  : list) {
			System.out.println(customer.toString());
			
		}
	}
}
