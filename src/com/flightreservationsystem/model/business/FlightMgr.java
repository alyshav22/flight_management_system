package com.flightreservationsystem.model.business;

import com.flightreservationsystem.model.domain.Flight;
import com.flightreservationsystem.model.services.IFlightService;
import com.flightreservationsystem.model.services.FlightSaveException;
import com.flightreservationsystem.model.services.ServiceLoadException;

public class FlightMgr extends ManagerSuperType {
	
	/**
	 * Default constructor
	 */
	private FlightMgr() {
		
	}
	
	/**
	 * Static reference to a singleton FlightManager object
	 */
	private static FlightMgr flightMgr = new FlightMgr();
	
	/**
	 * Getter FlightMgr object
	 * 
	 * @return flightMgr - Static reference to a singleton FlightMgr object
	 */
	public static FlightMgr getFlightMgr() {
		return flightMgr;
	}
	
	/**
	 * Creates the Flight object based upon input values 
	 * and persist objects through Flight Service 
	 * 
	 * @param flight to be created and persisted
	 * @throws ServiceLoadException
	 * @throws FlightSaveException
	 */
	public void create(Flight flight) throws ServiceLoadException, FlightSaveException{
		IFlightService flightService = (IFlightService) super.getService(IFlightService.NAME);
		flightService.saveFlight(flight);
	}
	
	

}
