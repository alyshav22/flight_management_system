package com.flightreservationsystem.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Service class test suite that test all Service classes and 
 * defined Test methods in each of the Service Class
 * @author ALYSHA
 */

@RunWith(Suite.class)
@SuiteClasses({ FlightSaveExceptionTest.class, FlightServiceImplTest.class, ServiceFactoryTest.class,
		ServiceLoadExceptionTest.class, UserServiceImplTest.class, UserRegisterExceptionTest.class,
		AirplaneSaveExceptionTest.class, AirplaneServiceImplTest.class, AirplaneFindExceptionTest.class, 
		FlightFindExceptionTest.class, VerifyUserExceptionTest.class})

/**
 * JUnit Test Suite for aggregating Services Layer test(s)
 * 
 *
 */
public class AllServiceTests {
	
	/**
	 * the class remains empty,
	 * used only as a holder for the above annotations
	 * 
	 */

}
