package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlightCompositeTest {

	// Declare Instance variables
	private Customer customer;
	private Flight flight;
	private AvailableFlights availableFlights;
	private FlightComposite flightComposite;

	/**
	 * Instantiate required object for all tests and configure testing environment
	 * 
	 */
	@Before
	public void flightCompositeSetUp() throws Exception {
		customer = new Customer("9999", "Alysha Velasquez", "555-555-5555", "1234 Madison ave", "billy@gmail.com",
				"password", 122344564);
		flight = new Flight(999, "AAA", "Delta", "DEN", "SFO", "Nov 10, 2019 @ 5:30AM", "Nov 10, 2019 @ 7:00AM", 90.0f,
				30, 100.89);
		availableFlights = new AvailableFlights(true, 8.02f);
		flightComposite = new FlightComposite(customer, flight, availableFlights);
	}

	/**
	 * Tests if a valid FlightComposite is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		assertTrue("flightComposite validates", flightComposite.validate());
		System.out.println("FlighCompositetTest: testValidate PASSED");
	}

	/**
	 * Tests default FlightComposite constructor
	 */
	@Test
	public final void testNotNull() {
		assertNotNull("should not be null", flightComposite);
		System.out.println("FlighCompositetTest: testNotNull PASSED");

	}

}
