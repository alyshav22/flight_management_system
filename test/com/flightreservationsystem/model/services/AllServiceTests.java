package com.flightreservationsystem.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FlightSaveExceptionTest.class, FlightServiceImplTest.class, ServiceFactoryTest.class,
		ServiceLoadExceptionTest.class })
public class AllServiceTests {

}
