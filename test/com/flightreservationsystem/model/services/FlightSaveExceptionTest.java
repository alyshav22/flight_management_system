package com.flightreservationsystem.model.services;

import org.junit.Test;

public class FlightSaveExceptionTest {

	/**
	 * Testing throwing a Save Exception 
	 * 
	 *@throws FlightSaveException
	 */

	@Test
	public void testSaveException(){
		System.out.println("Starting testSaveException()");
		try {
			throw new FlightSaveException("Testing throwing a Save Exception", null);
		}  catch (FlightSaveException e) {
			System.out.println("FlightSaveExceptionTest: testSaveException() PASSED ");
			System.out.println(e);
		}
	}

}
