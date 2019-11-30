package com.flightreservationsystem.model.services;


import org.junit.Before;
import org.junit.Test;

public class ServiceLoadExceptionTest {
	
	//Declare Instance variables
	private ServiceFactory testServiceFactory;
	
	@SuppressWarnings("unused")
	private IFlightService saveFlightService;
	
	private final String NAME = "This will make the testServiceFactory.getName(NAME) FAIL";
	
	
	/**
	 * Set up test environment and instantiates required object for all test
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception{
		//initialize instance variables
		testServiceFactory = ServiceFactory.getInstance();
	}
	
	/**
	 * Tests the expected Exception to be thrown from Service Layer Factory getService method
	 * @throws ServiceLoadException
	 */
	@Test(expected = ServiceLoadException.class)
	public void testThrowsServiceLoadException() throws ServiceLoadException{
		System.out.println("Starting testThrowsServiceLoadException()");
		saveFlightService = (IFlightService) testServiceFactory.getService(NAME);
	}

}
