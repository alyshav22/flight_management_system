package com.flightreservationsystem.model.business;

import com.flightreservationsystem.model.domain.Flight;
import com.flightreservationsystem.model.services.IFlightService;
import com.flightreservationsystem.model.services.FlightSaveException;
import com.flightreservationsystem.model.services.ServiceLoadException;

public class FlightManager extends ManagerSuperType{

	private FlightManager() {
		
	}
	
	private static FlightManager flightManager = new FlightManager();
	
	public static FlightManager getFlightManager () {
		return flightManager;
	}
	
	public void create(Flight flight) throws ServiceLoadException, FlightSaveException{
		IFlightService flightService = (IFlightService) super.getService(IFlightService.NAME);
		flightService.saveFlight(flight);
	}
}
