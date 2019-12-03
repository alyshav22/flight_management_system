package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Flight;

public class FlightServiceImplTest {

	// Declare Instance variables
	private ServiceFactory testServiceFactory;
	private Flight flight;
	private IFlightService saveFlightService;

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

}
