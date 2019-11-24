package com.flightreservationsystem.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for Service layer components
 * @author alysha_velasquez
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ FlightServiceImplTest.class, SaveExceptionTest.class, ServiceFactoryTest.class,
		ServiceLoadExceptionTest.class })
public class AllServicesTests {

}
