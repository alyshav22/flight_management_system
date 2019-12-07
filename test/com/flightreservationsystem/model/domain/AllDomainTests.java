package com.flightreservationsystem.model.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Test Suite for domain layer components
 * 
 * 
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ FlightTest.class, 
	AdminTest.class, AirplaneTest.class })
public class AllDomainTests {
	
	/**
	 * the class remains empty. Acts as a holder for above annotations.
	 */

}
