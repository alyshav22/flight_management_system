package com.flightreservationsystem.model.services;

import org.junit.Test;

public class SaveExceptionTest {

	/**
	 * Testing throwing a Save Exception 
	 * 
	 *@throws SaveException
	 */

	@Test
	public void testSaveException(){
		System.out.println("Starting testSaveException()");
		try {
			throw new SaveException("Testing throwing a Save Exception", null);
		}  catch (SaveException e) {
			System.out.println("SaveExceptionTest: testSaveException() PASSED ");
			System.out.println(e);
		}
	}

}
