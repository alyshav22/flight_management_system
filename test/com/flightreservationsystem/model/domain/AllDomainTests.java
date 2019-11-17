package com.flightreservationsystem.model.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AvailableFlightsTest.class, CustomerTest.class, FlightCompositeTest.class, FlightTest.class,
		ManagerTest.class })
public class AllDomainTests {

}
