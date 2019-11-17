package com.flightreservationsystem.model.services.registerservice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

public class RegisterSvcImplTest extends TestCase{

	private ServiceFactory serviceFactory;
	private Customer customer;
	
	protected void setUp() throws Exception {
		
		serviceFactory = new ServiceFactory();

		customer = new Customer("9999", "Billy Bob", "555-555-5555", "1234 Madison ave", "billy@gmail.com", "password",
				122344564);
	}

	@Test
	public final void testRegisterCustomer() {
		IRegisterSvc registerSvc = (IRegisterSvc)serviceFactory.getRegisterSvc();
		Assert.assertTrue(registerSvc.registerCustomer(customer));
		System.out.println("testRegisterCustomer PASSED");
		
	}

}
