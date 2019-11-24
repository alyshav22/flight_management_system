package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * 
 * Domain FlightTest layer tests equal and validate methods for the Domain
 * Flight class.
 * 
 * @author alysha_velasquez
 *
 */

public class FlightTest extends TestCase {

	// Declare instance variables
	private Flight f1, f2, f3;

	/**
	 * Instantiates required object for all test, and configures test environment.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// initialize instance variables
		f1 = new Flight();
		f2 = new Flight(999, "AAA", "Delta", "DEN", "SFO", "Nov 10, 2019 @ 5:30AM", "Nov 10, 2019 @ 7:00AM", 90.0f, 20,
				10, 100.89);
		f3 = new Flight(999, "code", "name", "orgin", "destination", "time1", "time2", 1.30f, 20, 10, 100.00);
	}

	/**
	 * Tests if valid Flight is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		assertTrue("f2 validates", f2.validate());
		// assertTrue("f2 validates", f2.validate());
		System.out.println("FlightTest: testValidate PASSED");
	}

	/**
	 * Test constructor
	 *
	 */
	public void testFlight() {
		assertNotNull("should not be null", f1);
		System.out.println("Flight Test: testFlight() PASSED");
	}

	/**
	 * Tests whether two Flight are equal
	 */
	@Test
	public void testNotEqualsFlight() {
		System.out.println("Starting testEqualsFlight()");
		assertFalse("f2 equals f3", f2.equals(f3));
		System.out.println("FlightTest: testEqualsFlight PASSED");
	}

}
