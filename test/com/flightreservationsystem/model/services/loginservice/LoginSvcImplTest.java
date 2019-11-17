package com.flightreservationsystem.model.services.loginservice;

import org.junit.Assert;
import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

public class LoginSvcImplTest extends TestCase {

	private ServiceFactory serviceFactory;
	private Customer customer;

	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = new ServiceFactory();

		customer = new Customer("9999", "Billy Bob", "555-555-5555", "1234 Madison ave", "billy@gmail.com", "password",
				122344564);
	}

	public final void testAuthenticateCustomer() {
		ILoginSvc loginSvc = (ILoginSvc) serviceFactory.getLoginSvc();
		Assert.assertTrue(loginSvc.authenticateCustomer(customer));
		System.out.println("testAuthenticateCustomer PASSED");
	}
}
