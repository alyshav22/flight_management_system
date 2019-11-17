package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReserveFlightTest {

	// Declare Instance variables
	private Customer customer;
	private Flight flight;
	private AvailableFlights availableFlights;
	private ReserveFlight reserveFlight;

	/**
	 * Instantiate required object for all tests and configure testing environment
	 * 
	 */
	@Before
	public void reserveFlightSetUp() throws Exception {
		customer = new Customer("9999", "Alysha Velasquez", "555-555-5555", "1234 Madison ave", "billy@gmail.com",
				"password", 122344564);
		flight = new Flight(999, "AAA", "Delta", "DEN", "SFO", "Nov 10, 2019 @ 5:30AM", "Nov 10, 2019 @ 7:00AM", 90.0f,
				30, 100.89);
		availableFlights = new AvailableFlights(true, 8.02f);
		reserveFlight = new ReserveFlight(customer, flight, availableFlights);
	}

	/**
	 * Tests if a valid ReserveFlight is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		assertTrue("flightComposite validates", reserveFlight.validate());
		System.out.println("ReserveFlightTest: testValidate PASSED");
	}

	/**
	 * Tests default ReserveFlight constructor
	 */
	@Test
	public final void testNotNull() {
		assertNotNull("should not be null", reserveFlight);
		System.out.println("ReserveFlightTest: testNotNull PASSED");

	}

}
