package com.flightreservationsystem.model.business;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Airplane;



public class AirplaneMgrTest {
	
	// Declare instance variables
		private Airplane airplane, foundAirplane;
		private AirplaneMgr airplaneMgr;
		
		/**
		 * Instantiates required object for all test, and configures test environment
		 * @throws Exception
		 */
		@Before
		public void setUp() throws Exception {
			
			airplane = new Airplane(55555, "Boeing", 10, 5, "description");
			airplaneMgr = AirplaneMgr.getAirplaneMgr();

		}
		/**
		 * Test to make sure singleton AirplaneMgr is not null. 
		 */
		@Test
		public void testGetAirplaneMgr() {
			System.out.println("Starting testGetMuseumMgr() ");
			assertNotNull("FlightMgr Should not be null", airplaneMgr);
			System.out.println("FlightMgrTest: testGetMuseumMgr() PASSED");
		}

		/**
		 * Test for creating and persisting a Flight. 
		 * Create method throws service load or save exception if there are errors
		 */
		@Test
		public void testCreate() {
			System.out.println("Starting testCreate()");
			assertTrue(airplaneMgr.create(airplane));
			System.out.println("FlightMgrTest: testCreate() PASSED");
		}
		
		/**
		 * Test querying list of exhibits to find flight. 
		 * Throws service load exception if there are errors. 
		 */
		@Test
		public void testQueryAirplanes() {
			System.out.println("Starting testQueryFlights()");
			foundAirplane = airplaneMgr.queryAirplanes(123456);
			assertNotNull("found Flight Should not be null", foundAirplane);
			assertTrue(foundAirplane instanceof Airplane);
			System.out.println("FlightMgrTest: testFlightExhibits() PASSED");
		}

}
