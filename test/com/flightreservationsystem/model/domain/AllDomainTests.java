package com.flightreservationsystem.model.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Test Suite for domain layer components
 * 
 * @author alysha_velasquez
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ CustomerTest.class, FlightTest.class, 
	ManagerTest.class, ReservationTest.class, UserTest.class })
public class AllDomainTests {
	
	/**
	 * the class remains empty. Acts as a holder for above annotations.
	 */

}
