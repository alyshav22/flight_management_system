package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.services.ServiceFactory;
import com.flightreservationsystem.model.services.ServiceLoadException;

import com.flightreservationsystem.model.services.FlightServiceImpl;
import com.flightreservationsystem.model.services.IFlightService;

/**
 * 
 * Service Factory test for services
 *
 */

public class ServiceFactoryTest {

	// Declare Instance variables
	private ServiceFactory testServiceFactory;
	private IFlightService flightService;
	private IUserService userService;

	/**
	 * Configures test environment and instantiates required object for all test
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// initialize instance variables
		testServiceFactory = ServiceFactory.getInstance();
		String fileLocation = System.getProperty("prop_location");
		PropertyManager.loadProperties(fileLocation);
	}

	/**
	 * Test Factory to return the Flight Service 
	 * and check that it is a instance of FlightServiceImpl
	 */
	@Test
	public final void testGetFlightService() {
		System.out.println("Starting testGetFlightService()");
		try {
			flightService = (IFlightService) testServiceFactory.getService(IFlightService.NAME);
			assertTrue(flightService instanceof FlightServiceImpl);
			System.out.println("ServiceFactoryTest: testGetFlightService() PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	/**
	 * Test Factory to return the User Service 
	 * and check that it is a instance of UserServiceImpl
	 */
	@Test
	public final void testGetUserService() {
		System.out.println("Starting testGetUserService()");
		try {
			userService = (IUserService) testServiceFactory.getService(IUserService.NAME);
			assertTrue(userService instanceof UserServiceImpl);
			System.out.println("ServiceFactoryTest: testGetUserService() PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}

}
