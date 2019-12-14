package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class AirplaneSaveExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation flight save method
	 *@throws AirplaneSaveException
	 */
	@Test
	public void testAirplaneSaveException(){
		System.out.println("Starting testFlightSaveException()");
		try {
			throw new AirplaneSaveException("Testing throwing a Airplane Save Exception", null);
		}  catch (AirplaneSaveException e) {
			System.out.println("SaveExceptionTest: testAirplaneSaveException() PASSED ");
			System.out.println(e);
		}
	}


}
