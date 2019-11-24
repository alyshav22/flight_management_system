package com.flightreservationsystem.model.services;

import com.flightreservationsystem.model.domain.Flight;
import com.flightreservationsystem.model.services.IService;
import com.flightreservationsystem.model.services.SaveException;

/**
 * Service interface for a Flight
 * @author alysha_velasquez
 *
 */

public interface IFlightService extends IService{
	
	public final String NAME = "IFlightService";
	
	/**
	 * Stub to save a flight
	 * 
	 * @param flight - contains flight information to be save
	 * @return boolean - true if saved
	 * @throws SaveException 
	 */
	
	public boolean saveFlight(Flight flight) throws SaveException;

}
