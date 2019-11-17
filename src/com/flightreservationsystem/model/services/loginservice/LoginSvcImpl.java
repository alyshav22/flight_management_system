package com.flightreservationsystem.model.services.loginservice;

import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.domain.Manager;

/**
 * Login Service Implementation
 * @author alysha_velasquez
 *
 */


public class LoginSvcImpl implements ILoginSvc {

	/**
	 * Implements verifyCustomer from interface
	 */
	public boolean verifyCustomer(Customer customer) {
		System.out.println("Starting method LoginSvcImpl: verifyCustomer");
		return true;
	}
	
	/**
	 * Implements verifyManager from interface
	 */
	public boolean verifyManager(Manager manager) {
		System.out.println("Starting method LoginSvcImpl: verifyManager");
		return true;
	}

	

}
