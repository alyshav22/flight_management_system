package com.flightreservationsystem.model.services;

import org.junit.Test;

public class VerifyUserExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation airplane find method
	 * @throws AirplaneFindException
	 */
	@Test
	public void testVerifyUserExceptionTest(){
		System.out.println("Starting testVerifyUserExceptionTest()");
		try {
			throw new VerifyUserException("Testing throwing a Verify User Exception", null);
		}  catch (VerifyUserException e) {
			System.out.println("VerifyUserExceptionTest: testVerifyUserExceptionTest() PASSED ");
			System.out.println(e);
		}
	}
}
