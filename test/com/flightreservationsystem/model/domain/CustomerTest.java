package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * CustomerTest tests validate and equal methods for the domain class Customer.
 * @author alysha_velasquez
 *
 */
public class CustomerTest extends TestCase{

	/**
	 * Tests if valid Customer is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		Customer c1 = new Customer("9999", "Billy Bob", "555-555-5555", "1234 Madison ave", 
				"billy@gmail.com", "password", 122344564);
		/**
		 * Validate method from c1 will assert True, since all variables being passed to
		 * create a new Customer are all valid.
		 */
		assertTrue("c1 validates", c1.validate());
		System.out.println("CustomerTest: testValidate PASSED");
	}

	/**
	 * Tests whether two Customers are equal
	 */
	@Test
	public void testEqualsCustomer() {
		System.out.println("Starting testEqualsCustomer()");
		Customer c2 = new Customer("999", "Billy Bob", "555-555-5555", 
				"1234 Madison ave", "billy@gmail.com",
				"password", 122344564);
		Customer c3 = new Customer("999", "Billy Bob", "555-555-5555", 
				"1234 Madison ave", "billy@gmail.com",
				"password", 122344564);
		assertTrue("c2 equals c3", c2.equals(c3));
		System.out.println("CustomerTest: testEqualsCustomer PASSED");
	}

}
