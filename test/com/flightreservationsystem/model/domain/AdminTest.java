package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Domain AdminTest class that test methods in the Domain Admin
 * 
 *
 */

public class AdminTest {
	
	//Declare instance variables
	private Admin m1,m2,m3;
	
	/**
	 * Instantiates required object for all test and configures test environment
	 * @throws java.lang.Exception
	 */
	@Before
	public void setup() throws Exception{
		//Initialize instance variables
		m1 = new Admin();
		m2 = new Admin(5555,"Michael","Jordan","555-555-5555","jordan007@gmail.com",
				"jordan007","password");
		m3 = new Admin(5555,"Michael","Jordan","555-555-5555","jordan007@gmail.com",
				"jordan007","password");
	}
	
	/**
	 * Test with valid Admin passed in
	 */
	@Test
	public final void testValidate() {
		System.out.println("Starting testValidate()");
		assertTrue("m1 validates",m1.validate());
		assertTrue("m2 validates",m2.validate());
		System.out.println("AdminTest: testValidate PASSED");
	}
	
	/**
	 * Test default constructor
	 */
	@Test
	public final void testAdmin() {
		System.out.println("Starting testAdmin()");
		//No argument constructor should be null
		assertNotNull("should not be null",m1);
		System.out.println("AdminTest: testAdmin() PASSED");
	}
	
	/**
	 * Test if two Admin are equal
	 */
	@Test
	public final void testEqualsAdmin() {
		System.out.println("Starting testEqualsAdmin()");
		//assert should be equal
		assertTrue("m2 equals m3", m2.equals(m3));
		System.out.println("AdminTest: testEqualsAdmin PASSED");
	}
	
	/**
	 * Test if two Admin are not equal
	 */
	@Test
	public final void testNotEqualsFlight() {
		System.out.println("Starting testNotEqualsFlight()");
		// assert should be false
		assertFalse("m1 does not equal m3 ", m1.equals(m3));
		System.out.println("AdminTest: testNotEqualsFlight() PASSED");
	}

}
