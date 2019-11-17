package com.flightreservationsystem.model.services.registerservice;


import com.flightreservationsystem.model.domain.FlightComposite;

/**
 * Service Interface for Register
 * 
 * @author alysha_velasquez
 *
 */

public interface IRegisterSvc {
	
	/**
	 * Stub to store customer into our application
	 * @return 
	 */
	
	public boolean storeCustomer(FlightComposite flightComposite);
	
}
