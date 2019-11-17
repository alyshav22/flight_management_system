package com.flightreservationsystem.model.services.registerservice;

import com.flightreservationsystem.model.domain.Customer;

public interface IRegisterSvc {
	
	/**
	 * Register customer into our application
	 * @return 
	 */
	
	public boolean registerCustomer(Customer customer);

}
