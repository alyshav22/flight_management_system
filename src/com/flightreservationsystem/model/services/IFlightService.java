package com.flightreservationsystem.model.services;

import com.flightreservationsystem.model.domain.Flight;
import com.flightreservationsystem.model.services.IService;
import com.flightreservationsystem.model.services.FlightSaveException;

/**
 * Service interface for a Flight
 *
 */

public interface IFlightService extends IService{
	
	public final String NAME = "IFlightService";
	
	/**
	 * Stub to save a flight
	 * @param flight - contains flight information to be save
	 * @return boolean - true if saved
	 * @throws FlightSaveException 
	 */
	public boolean saveFlight(Flight flight) throws FlightSaveException;
	
	/**
	 * Stub to find a flight
	 * @param flightID
	 * @return flight if successful
	 */
	public Flight findFlight(int flightId) throws FlightFindException;

}
