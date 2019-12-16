package com.flightreservationsystem.model.business;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Business class test all Business classes and defined test methods in each of the business class
 * 
 * @author ALYSHA
 */

@RunWith(Suite.class)
@SuiteClasses({ FlightMgrTest.class, UserMgrTest.class, AirplaneMgrTest.class })
public class AllBusinessTests {
	
	/**
	 * Class remains empty, used as a holder for the above annotations
	 */

}
