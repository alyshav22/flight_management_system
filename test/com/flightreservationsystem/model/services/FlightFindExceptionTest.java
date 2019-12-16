package com.flightreservationsystem.model.services;

import org.junit.Test;

public class FlightFindExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation flight find method
	 * @throws FlightFindException
	 */
	@Test
	public void testFlightFindException(){
		System.out.println("Starting testFlightSaveException()");
		try {
			throw new FlightFindException("Testing throwing a Flight Save Exception", null);
		}  catch (FlightFindException e) {
			System.out.println("FlightFindExceptionTest: testFlightFindException() PASSED ");
			System.out.println(e);
		}
	}

}
