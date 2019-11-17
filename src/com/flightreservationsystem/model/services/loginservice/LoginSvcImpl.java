package com.flightreservationsystem.model.services.loginservice;

import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.domain.Manager;

/**
 * 
 * @author alysha_velasquez
 *
 */


public class LoginSvcImpl implements ILoginSvc {

	
	public boolean authenticateCustomer(Customer customer) {
		System.out.println("Entering method LoginSvcImpl::authenticateCustomer");
		return true;
	}


	public boolean authenticateManager(Manager manager) {
		System.out.println("Entering method LoginSvcImpl::authenticateManager");
		return true;
	}

	

}
