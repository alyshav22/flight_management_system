package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Flight;

/**
 * Flight Service Implementation Test
 * @author ALYSHA
 */

public class FlightServiceImplTest {

	// Declare Instance variables
	private ServiceFactory testServiceFactory;
	private Flight flight, searchFlightResults;
	private IFlightService saveFlightService, findFlightService;

	/**
	 * Configures test environment and instantiates required object for all test
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		// initialize instance variables
		testServiceFactory = ServiceFactory.getInstance();
		flight = new Flight();
		String fileLocation = System.getProperty("prop_location");
		PropertyManager.loadProperties(fileLocation);
	}

	/**
	 * Asserts true if you can save a flight using services
	 */
	@Test
	public final void testSaveFlight() {
		System.out.println("Starting testSaveFlight() ");
		try {
			saveFlightService = (IFlightService) testServiceFactory.getService(IFlightService.NAME);
			assertTrue(saveFlightService.saveFlight(flight));
			assertNotNull("should not be null", FlightServiceImpl.getFlightHashtable());
			assertEquals("failure - flight objects are not equal",
					FlightServiceImpl.getFlightHashtable().get(flight.getFlightID()), flight);
			System.out.println("FlightServiceImplTest: testSaveFlight() PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (FlightSaveException e) {
			e.printStackTrace();
			fail("FlightSaveException");
		}
	}
	
	/**
	 * Asserts if you can find find a flight using services
	 */
	@Test
	public final void testFindFlight() {
		
		System.out.println("Starting testFindFlight() ");
		
		try {
			findFlightService = (IFlightService) testServiceFactory.getService(IFlightService.NAME);
			assertNotNull("should not be null", FlightServiceImpl.getFlightHashtable());
			searchFlightResults = findFlightService.findFlight(123456);
			assertNotNull("should not be null",searchFlightResults);
			System.out.println(searchFlightResults.toString());
			System.out.println("FlightServiceImplTest: testFindFlight() PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (FlightFindException e) {
			e.printStackTrace();
			fail("FlightFindException");
		}
		
	}

}
