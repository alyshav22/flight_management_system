package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaveExceptionTest {

	/**
	 * Test the expected Exception to be thrown from Service Layer Service Implementation save method 
	 * 
	 *@throws SaveException
	 */

	@Test
	public void testSaveException(){
		System.out.println("Starting testSaveException() ");
		try {
			throw new SaveException("Testing throwing a Save Exception", null);
		}  catch (SaveException e) {
			System.out.println("SaveExceptionTest: testSaveException() PASSED ");
			System.out.println(e);
		}
	}

}
