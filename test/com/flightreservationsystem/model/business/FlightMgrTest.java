package com.flightreservationsystem.model.business;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Flight;
import com.flightreservationsystem.model.services.FlightSaveException;
import com.flightreservationsystem.model.services.ServiceLoadException;

public class FlightMgrTest {

	// Declare instance variables
	private Flight flight;
	private LocalDate departureDate, arrivalDate;
	private FlightMgr flightMgr;

	@Before
	public void setUp() throws Exception {
		departureDate = LocalDate.of(2019, Month.NOVEMBER, 30);
		arrivalDate = LocalDate.of(2019, Month.NOVEMBER, 30);
		flight = new Flight(9999, "American", "DEN", "SJC", departureDate, "7:30AM", arrivalDate, "9:30AM", 250.00,
				100.00);
		flightMgr = FlightMgr.getFlightMgr();

	}

	@Test
	public void testGetFlightManager() {
		System.out.println("Starting testGetMuseumMgr() ");
		assertNotNull("FlightMgr Should not be null", flightMgr);
		System.out.println("FlightMgrTest: testGetMuseumMgr() PASSED");
	}

	/**
	 * Test for creating and persisting a Flight.
	 * 
	 */
	@Test
	public void testCreate() {
		System.out.println("Starting testCreate()");
		try {
			flightMgr.create(flight);
			System.out.println("FlightMgrTest: testCreate() PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (FlightSaveException e) {
			e.printStackTrace();
			fail("FlightSaveException");
		}
	}

}
