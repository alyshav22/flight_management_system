package com.flightreservationsystem.model.domain;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class FlightTest extends TestCase{

	/**
	 * Tests if a valid Flight is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		Flight f1 = new Flight(999, "AAA", "Delta", "DEN", "SFO", 
				"Nov 10, 2019 @ 5:30AM", "Nov 10, 2019 @ 7:00AM",
				90.0f, 30, 100.89);
		/**
		 * Validate method from f1 assert to True, since all variables
		 * being passed to create a new Flight are all valid.
		 */
		assertTrue("f1 validates", f1.validate());
		System.out.println("FlightTest: testValidate PASSED");
	}

	/**
	 * Tests if two Flights are equal
	 */
	@Test
	public void testEqualsFlight() {
		System.out.println("Starting testEqualsFlight()");
		Flight f1 = new Flight(999, "AAA", "Delta", "DEN", "SFO", 
				"Nov 10,2019 @ 5:30AM", "Nov 10, 2019 @ 7:00AM",
				90.0f, 30, 100.89);
		Flight f2 = new Flight(999, "AAA", "Delta", "DEN", "SFO", 
				"Nov 10,2019 @ 5:30AM", "Nov 10, 2019 @ 7:00AM",
				90.0f, 30, 100.89);
		assertTrue("f1 equals f2", f1.equals(f2));
		System.out.println("FlightTest: testEqualsFlight PASSED");
	}

}
