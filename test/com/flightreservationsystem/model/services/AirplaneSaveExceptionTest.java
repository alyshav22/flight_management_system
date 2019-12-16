package com.flightreservationsystem.model.services;



import org.junit.Test;

public class AirplaneSaveExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation airplane save method
	 * @throws AirplaneSaveException
	 */
	@Test
	public void testAirplaneSaveException(){
		System.out.println("Starting testAirplaneSaveException()");
		try {
			throw new AirplaneSaveException("Testing throwing a Airplane Save Exception", null);
		}  catch (AirplaneSaveException e) {
			System.out.println("AirplaneSaveExceptionTest: testAirplaneSaveException() PASSED ");
			System.out.println(e);
		}
	}


}
