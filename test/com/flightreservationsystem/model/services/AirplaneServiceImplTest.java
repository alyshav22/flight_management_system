package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Airplane;


public class AirplaneServiceImplTest {

	// Declare Instance variables
		private ServiceFactory testServiceFactory;
		private Airplane airplane, searchAirplaneResults;
		private IAirplaneService saveAirplaneService, findAirplaneService;

		/**
		 * Configures test environment and instantiates required object for all test
		 * 
		 * @throws java.lang.Exception
		 */
		@Before
		public void setUp() throws Exception {

			// initialize instance variables
			testServiceFactory = ServiceFactory.getInstance();
			airplane = new Airplane();
			String fileLocation = System.getProperty("prop_location");
			PropertyManager.loadProperties(fileLocation);
		}

		/**
		 * Asserts true if you can save a flight using services
		 */
		@Test
		public final void testSaveAirplane() {
			System.out.println("Starting testSaveAirplane() ");
			try {
				saveAirplaneService = (IAirplaneService) testServiceFactory.getService(IAirplaneService.NAME);
				assertTrue(saveAirplaneService.saveAirplane(airplane));
				assertNotNull("should not be null", AirplaneServiceImpl.getAirplaneHashtable());
				assertEquals("failure - Airplane objects are not equal",
						AirplaneServiceImpl.getAirplaneHashtable().get(airplane.getAirplaneID()), airplane);
				System.out.println("AirplaneServiceImplTest: testSaveFlight() PASSED");
			} catch (ServiceLoadException e) {
				e.printStackTrace();
				fail("ServiceLoadException");
			} catch (AirplaneSaveException e) {
				e.printStackTrace();
				fail("AirplaneSaveException");
			}
		}
		
		/**
		 * Asserts if you can find find a Airplane using services
		 */
		@Test
		public final void testFindAirplane() {
			
			System.out.println("Starting testFindAirplane() ");
			
			try {
				findAirplaneService = (IAirplaneService) testServiceFactory.getService(IAirplaneService.NAME);
				assertNotNull("should not be null", AirplaneServiceImpl.getAirplaneHashtable());
				searchAirplaneResults = findAirplaneService.findAirplane(123456);
				assertNotNull("should not be null",searchAirplaneResults);
				System.out.println(searchAirplaneResults.toString());
				System.out.println("AirplaneServiceImplTest: testFindAirplane() PASSED");
			} catch (ServiceLoadException e) {
				e.printStackTrace();
				fail("ServiceLoadException");
			} catch (AirplaneFindException e) {
				e.printStackTrace();
				fail("AirplaneFindException");
			}
			
		}

}
