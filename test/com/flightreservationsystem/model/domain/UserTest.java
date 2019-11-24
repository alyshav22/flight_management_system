package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	//Declare instance variables
	private User u1, u2, u3;
	
	/**
	 * Instantiates required object for all test and config test environment
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception{
		//initialize instance variables
		u1 = new User();
		u2 = new User("username101","password");
		u3 = new User("username101","password");
	}
	/**
	 * Test with valid User passed in
	 */

	@Test
	public final void testValidate() {
		System.out.println("Starting testValidate()");
		assertTrue("user validates", u1.validate());
		assertTrue("user validates", u2.validate());
		System.out.println("UserTest: testValidate PASSED");
	}
	@Test
	public final void testNotNull() {
		assertNotNull("should not be null", u1);
		System.out.println("UserTest: testNotNull PASSED");
	}
	@Test
	public final void testEqualsUser() {
		System.out.println("starting testEqualsUser()");
		assertTrue("u2 equals u3", u2.equals(u3));
		System.out.println("UserTest: testEqualsUser() PASSED");
	}

}
