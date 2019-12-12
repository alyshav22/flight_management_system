package com.flightreservationsystem.model.services;


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
			throw new UserRegisterException("Testing throwing a User Register Exception", null);
		}  catch (UserRegisterException e) {
			System.out.println("UserRegisterExceptionTest: testUserRegisterException() PASSED ");
			System.out.println(e);
		}
	}

}
