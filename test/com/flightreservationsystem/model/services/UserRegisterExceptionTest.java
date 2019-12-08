package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegisterExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation flight save method
	 *@throws FlightSaveException
	 */
	@Test
	public void testUserRegisterException(){
		System.out.println("Starting testUserRegisterException()");
		try {
			throw new UserRegisterException("Testing throwing a Flight Save Exception", null);
		}  catch (UserRegisterException e) {
			System.out.println("SaveExceptionTest: testFlightSaveException() PASSED ");
			System.out.println(e);
		}
	}

}
