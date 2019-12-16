package com.flightreservationsystem.model.services;


import org.junit.Test;

public class AirplaneFindExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation airplane find method
	 *@throws AirplaneFindException
	 */
	@Test
	public void testAirplaneFindException(){
		System.out.println("Starting testAirplaneFindException()");
		try {
			throw new AirplaneFindException("Testing throwing a Airplane Find Exception", null);
		}  catch (AirplaneFindException e) {
			System.out.println("AirplaneFindExceptionTest: testAirplaneFindException() PASSED ");
			System.out.println(e);
		}
	}

}
