package com.flightreservationsystem.model.services.loginservice;

import org.junit.Assert;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.domain.Manager;
import com.flightreservationsystem.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

/**
 * Login Service Implementation Test
 * 
 * @author alysha_velasquez
 *
 */

public class LoginSvcImplTest extends TestCase {

	//Declare instance variables
	private ServiceFactory serviceFactory;
	private Customer customer;
	private Manager manager;

	
	/**
	 * Instantiates needed object for all test and configure test environment
	 * @throws java.lang.Exception
	 */
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = new ServiceFactory();
		manager = new Manager(9999, "Alysha Velasquez", "555-555-5555", 
				"duff@gmail.com", "password");
		customer = new Customer("9999", "Billy Bob", "555-555-5555", "1234 Madison ave", 
				"billy@gmail.com", "password",
				122344564);
		
	}
	/**
	 * Asserts if you can retrieve manager using services
	 */
	@Test
	public final void testVerifyManager() {
		ILoginSvc loginSvc = (ILoginSvc)serviceFactory.getLoginSvc();
		Assert.assertTrue(loginSvc.verifyManager(manager));
		System.out.println("testVerifyManager: PASSED");
	}
	
	/**
	 * Asserts if you can retrieve customer using services
	 */
	@Test
	public final void testVerifyCustomer() {
		ILoginSvc loginSvc = (ILoginSvc)serviceFactory.getLoginSvc();
		Assert.assertTrue(loginSvc.verifyCustomer(customer));
		System.out.println("testVerifyCustomer PASSED");
	}
	
	
	
}
