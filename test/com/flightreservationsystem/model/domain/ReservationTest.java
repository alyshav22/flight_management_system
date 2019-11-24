package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReservationTest {

	// Declare Instance variables
	private User user;
	private Customer customer;
	private Flight flight;
	private Reservation r1,r2,r3;

	/**
	 * Instantiate required object for all tests and configure testing environment
	 * 
	 */
	@Before
	public void reservationSetUp() throws Exception{
		user = new User("alysha101","password1");
		customer = new Customer(9999, "Alysha", "555-555-5555", "1234 Madison ave", "billy@gmail.com",
				122344564, user);
		flight = new Flight(999, "AAA", "Delta", "DEN", "SFO", "Nov 10, 2019 @ 5:30AM", 
				"Nov 10, 2019 @ 7:00AM", 90.0f,20,10, 100.89);
		r1 = new Reservation();
		r2 = new Reservation(customer, flight);
		
		
		
	}
	/**
	 * Tests if a valid Reservation is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		assertTrue("reservation validates", r1.validate());
		assertTrue("reservation validates", r2.validate());
		System.out.println("ReservationTest: testValidate PASSED");
	}

	/**
	 * Tests default ReserveFlight constructor
	 */
	@Test
	public final void testNotNull() {
		assertNotNull("should not be null", r1);
		System.out.println("ReservationTest: testNotNull PASSED");
	}
	

}
