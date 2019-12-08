package com.flightreservationsystem.model.business;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Flight;

/**
 * 
 * Business FlightMgrTest class that test methods in the Business layer Flight
 * @author Alysha
 */

public class FlightMgrTest {

	// Declare instance variables
	private Flight flight, foundFlight;
	private LocalDate departureDate, arrivalDate;
	private FlightMgr flightMgr;
	
	/**
	 * Instantiates required object for all test, and configures test environment
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		departureDate = LocalDate.of(2019, Month.NOVEMBER, 30);
		arrivalDate = LocalDate.of(2019, Month.NOVEMBER, 30);
		flight = new Flight(123456, "American", "DEN", "SJC", departureDate, "7:30AM", arrivalDate, "9:30AM", 250.00,
				100.00);
		flightMgr = FlightMgr.getFlightMgr();

	}
	/**
	 * Test to make sure singleton FlightMgr is not null. 
	 */
	@Test
	public void testGetFlightManager() {
		System.out.println("Starting testGetMuseumMgr() ");
		assertNotNull("FlightMgr Should not be null", flightMgr);
		System.out.println("FlightMgrTest: testGetMuseumMgr() PASSED");
	}

	/**
	 * Test for creating and persisting a Flight. 
	 * Create method throws service load or save exception if there are errors
	 */
	@Test
	public void testCreate() {
		System.out.println("Starting testCreate()");
		assertTrue(flightMgr.create(flight));
		System.out.println("FlightMgrTest: testCreate() PASSED");
	}
	
	/**
	 * Test querying list of exhibits to find flight. 
	 * Throws service load exception if there are errors. 
	 */
	@Test
	public void testQueryFlights() {
		System.out.println("Starting testQueryFlights()");
		foundFlight = flightMgr.queryFlights(123456);
		assertNotNull("found Flight Should not be null", foundFlight);
		assertTrue(foundFlight instanceof Flight);
		System.out.println("FlightMgrTest: testFlightExhibits() PASSED");
	}

}
