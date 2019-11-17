package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AvailableFlightsTest {

	/**
	 * Tests if two AvailableFlights are equal
	 */
	@Test	
	public void testEqualsAvailableFlights() {
		System.out.println("Starting testEqualsAvailableFlights()");
		AvailableFlights af1 = new AvailableFlights (true, 8.02f);
		AvailableFlights af2 = new AvailableFlights (true, 8.02f);
		assertTrue ("af1 equals af2", af1.equals(af2));
	       System.out.println("AvailableFlightsTest: testEqualsAvailableFlights PASSED");		
	}
	
	/**
	 * Tests with if valid availableFlights is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		AvailableFlights availFlight3 = new AvailableFlights(true, 8.02f);
		/**
		 * Validate method from availFlight3 asserts True, since all variables being passed
		 * to create a new AvailableFlights are all valid.
		 */
		assertTrue("availFlight3 validates", availFlight3.validate());
		System.out.println("AvailableFlightsTest: testValidate PASSED");
	
	}

}
