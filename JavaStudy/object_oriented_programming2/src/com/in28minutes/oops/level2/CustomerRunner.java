package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address homeAddress = new Address("123 Main St", "Anytown", "12345");

		Customer customer = new Customer("minji", homeAddress);

		Address workAddress = new Address("line2 for work", "abd", "1234");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);

	}

}
