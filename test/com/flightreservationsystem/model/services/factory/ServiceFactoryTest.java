package com.flightreservationsystem.model.services.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import com.flightreservationsystem.model.services.loginservice.ILoginSvc;
import com.flightreservationsystem.model.services.loginservice.LoginSvcImpl;
import com.flightreservationsystem.model.services.registerservice.IRegisterSvc;
import com.flightreservationsystem.model.services.registerservice.RegisterSvcImpl;

/**
 * 
 * Service Factory test for services
 * 
 * @author alysha_velasquez
 *
 */


public class ServiceFactoryTest {
	
	ServiceFactory serviceFactory;
	
	/**
	 * Instantiates required object for tests and configures test environment
	 * 
	 * @throws Exception
	 */

	@Before
	public void setup() throws Exception{
		serviceFactory = new ServiceFactory();
	}
	
	/**
	 * Test will try to get Login Service and check 
	 * if its an instance of LoginSvcImpl
	 */

	public void testGetLoginSvc() {
		ILoginSvc loginSvc = (ILoginSvc)serviceFactory.getLoginSvc();
		assertTrue(loginSvc instanceof LoginSvcImpl);
	}
	
	/**
	 * Test will try to get Register Service 
	 * and check if its an instance of RegisterSvcImpl
	 */
	public void testGetRegisterSvc() {
		IRegisterSvc RegisterSvc = (IRegisterSvc)serviceFactory.getRegisterSvc();
		assertTrue(RegisterSvc instanceof RegisterSvcImpl);
	}

}
