package com.flightreservationsystem.model.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

public class FlightTest {

	// Declare instance variables
	//private Airplane airplane1, airplane2;
	private Flight flight, flight2, flight3;
	private LocalDate departureDate, arrivalDate;

	/**
	 * Instantiates required object for all test, and configures test environment.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		departureDate = LocalDate.of(2019, Month.NOVEMBER, 27);
		arrivalDate = LocalDate.of(2019, Month.NOVEMBER, 27);

		//airplane1 = new Airplane();
		//airplane2 = new Airplane(999, "Boeing 750", 10, 20);

		flight2 = new Flight();

		flight = new Flight(9999, "Frontier", "DEN", "SJC", departureDate, "7:30AM", arrivalDate, "9:30AM", 200.00,
				100.00);
		//flight.setFlightAirplanes(airplane1);
		//flight.setFlightAirplanes(airplane2);

		flight3 = new Flight(9999, "Frontier", "DEN", "SJC", departureDate, "7:30AM", arrivalDate, "9:30AM", 200.00,
				100.00);
		//flight3.setFlightAirplanes(airplane1);
		//flight3.setFlightAirplanes(airplane2);

	}
	/**
	 * Test with valid Flight passed in
	 */
	@Test
	public void testValidate() {
		assertTrue("flight2 validates", flight2.validate());
		assertTrue("flight1 validates", flight.validate());

		System.out.println("FlightTest: testValidate PASSED");
	}

	/**
	 * Test default Flight constructor
	 */
	@Test
	public final void testFlight() {
		System.out.println("starting testFlight()");
		// No argument constructor should not be null
		assertNotNull("should not be null", flight2);
		System.out.println("FlightTest: testExhibit() PASSED");
	}

	/**
	 * Test if two Flight are equal
	 */
	@Test
	public final void testEqualsFlight() {
		System.out.println("starting testEqualsFlight()");
		// assert should be true
		assertTrue("flight eqauls flight3", flight.equals(flight3));
		System.out.println("FlightTest:  testEqualsFlight() PASSED");

	}

	/**
	 * Test if two Flight are equal
	 */
	@Test
	public final void testNotEqualsFlight() {
		System.out.println("starting testEqualsFlight()");
		// assert should be true
		assertFalse("flight eqauls flight3", flight2.equals(flight3));
		System.out.println("FlightTest:  testEqualsFlight() PASSED");

	}

}
