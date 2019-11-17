package com.flightreservationsystem.model.services.registerservice;


import com.flightreservationsystem.model.domain.ReserveFlight;

/**
 * Register Service Implementation
 * @author alysha_velasquez
 *
 */

public class RegisterSvcImpl implements IRegisterSvc {

	/**
	 * implements storeCustomer from interface
	 */
	public boolean storeCustomer(ReserveFlight reserveFlight) {
		System.out.println("Entering method RegisterSvcImpl::storeCustomer");
		return true;
	}
	
	

}
