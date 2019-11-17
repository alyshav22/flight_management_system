package com.flightreservationsystem.model.services.registerservice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.domain.FlightComposite;
import com.flightreservationsystem.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

/**
 *
 * Register Service for implementation test
 * 
 * @author alysha_velasquez
 *
 */

public class RegisterSvcImplTest extends TestCase{

	//Declare instance variables
	private ServiceFactory serviceFactory;
	private FlightComposite flightComposite;
	private Customer customer;
	
	
	/**
	 * Instantiates needed object for all test and configure test environment
	 */
	protected void setUp() throws Exception {
		
		serviceFactory = new ServiceFactory();
		flightComposite = new FlightComposite();
		
		flightComposite.setCustomer(customer);
	}
	
	/**
	 * Asserts if you can store customer using services
	 */
	@Test
	public final void testStoreCustomer() {
		customer = new Customer("9999", "Billy Bob", "555-555-5555", "1234 Madison ave", 
				"billy@gmail.com", "password", 122344564);
		IRegisterSvc registerSvc = (IRegisterSvc)serviceFactory.getRegisterSvc();
		Assert.assertTrue(registerSvc.storeCustomer(flightComposite));
		System.out.println("testStoreCustomer PASSED");
	}
	
	
	
	

	

}
