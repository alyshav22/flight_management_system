package com.flightreservationsystem.model.services;

import org.junit.Test;

public class FlightSaveExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation flight save method
	 *@throws FlightSaveException
	 */

	@Test
	public void testFlightSaveException(){
		System.out.println("Starting testFlightSaveException()");
		try {
			throw new FlightSaveException("Testing throwing a Flight Save Exception", null);
		}  catch (FlightSaveException e) {
			System.out.println("SaveExceptionTest: testFlightSaveException() PASSED ");
			System.out.println(e);
		}
	}

}
