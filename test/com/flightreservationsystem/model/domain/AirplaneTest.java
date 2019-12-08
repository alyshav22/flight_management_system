package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Domain AirplaneTest class that test methods in the Domain Airplane
 * 
 * @author Alysha
 */

public class AirplaneTest {

	// Declare instance variables
	private Airplane airplane1, airplane2, airplane3;

	/**
	 * Instantiates required object for all test, and configures test environment.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		airplane1 = new Airplane();
		airplane2 = new Airplane(999, "Boeing700", 5, 25);
		airplane3 = new Airplane(999, "Boeing700", 5, 25);
	}

	/**
	 * Test with valid airplane passed in
	 */
	@Test
	public void testValidate() {
		assertTrue("airplane1 validates", airplane1.validate());
		assertTrue("airplane2 validates", airplane2.validate());
		System.out.println("AirplaneTest: testValidate PASSED");
	}

	/**
	 * Test default Airplane constructor
	 */
	@Test
	public final void testAirplane() {
		// No argument constructor should not be null
		assertNotNull("should not be null", airplane1);
		System.out.println("AirplaneTest: testAirplane() PASSED");
	}

	/**
	 * Test if two Airplane are equal
	 */
	@Test
	public final void testEqualsAirplane() {
		System.out.println("Starting testEqualsAirplane()");
		// assert should be true
		assertTrue("airplane2  eqauls airplane3 ", airplane2.equals(airplane3));
		System.out.println("AirplaneTest: testEqualsAirplane() PASSED");
	}

	/**
	 * Test if two Airplane are not equal
	 */
	@Test
	public final void testNotEqualsAirplane() {
		System.out.println("Starting testEqualsAirplane()");
		// assert should be true
		assertFalse("airplane1 not equal airplane3 ", airplane1.equals(airplane3));
		System.out.println("AirplaneTest: testEqualsAirplane() PASSED");
	}

}
