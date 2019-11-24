package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * CustomerTest tests validate and equal methods for the domain class Customer.
 * @author alysha_velasquez
 *
 */
public class CustomerTest extends TestCase{
	
	//Declare instance variables
	private User user;
	private Customer c1, c2, c3;
	
	/**
	 * Instantiates required object for all test, and config test environment
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		//initialize instance variables
		user = new User("ironman101","pword");
		c1 = new Customer();
		c2 = new Customer(999,"Edward","555-555-5555","1234 Christmas lane",
				"ironman101@gmail.com",9999, user);
		c3 = new Customer(999,"Edward","555-555-5555","1234 Christmas lane",
				"ironman101@gmail.com",9999, user);
		
	}

	/**
	 * Tests if valid Customer is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		assertTrue("c1 validates",c1.validate());
		assertTrue("c2 validates", c2.validate());
		System.out.println("CustomerTest: testValidate PASSED");
	}
	/**
	 * Test default Customer constructor
	 */
	@Test
	public final void testCustomer() {
		//No argument constructor should not be null
		assertNotNull("should not be null", c1);
		System.out.println("CustomerTest: testCustomer() PASSED");
	}

	/**
	 * Tests whether two Customers are equal
	 */
	@Test
	public void testEqualsCustomer() {
		System.out.println("Starting testEqualsCustomer()");
		assertTrue("c1 equals c3",c2.equals(c3));
		System.out.println("CustomerTest: testEqualsCustomer PASSED");
	}

}
