package com.flightreservationsystem.model.services.loginservice;

import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.domain.Manager;

/**
 * Service interface for Login
 * 
 * @author alysha_velasquez
 *
 */

public interface ILoginSvc {
	
	/**
	 * Stub to verify customer
	 * @param customer
	 * @return
	 */
	
	public boolean verifyCustomer(Customer customer);
	
	/**
	 * Stub to verify manager
	 * @param manager
	 * @return
	 */
	
	public boolean verifyManager(Manager manager);

}
