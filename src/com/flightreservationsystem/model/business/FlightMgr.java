package com.flightreservationsystem.model.business;

import com.flightreservationsystem.model.domain.Flight;
import com.flightreservationsystem.model.services.IFlightService;
import com.flightreservationsystem.model.services.FlightFindException;
import com.flightreservationsystem.model.services.FlightSaveException;
import com.flightreservationsystem.model.services.ServiceLoadException;


/**
 * Business layer facade that aggregate a cohesive set of use cases for a Flight
 * 
 * @author Alysha 
 */


public class FlightMgr extends ManagerSuperType {

	/**
	 * Default constructor
	 */
	private FlightMgr() {

	}
	
	//Singleton pattern to ensure only one FlightMgr object

	/**
	 * Static reference to a singleton FlightMgr object
	 */
	private static FlightMgr flightMgr = new FlightMgr();

	
	/**
	 * Getter FlightMgr object
	 * @return flightMgr - Static reference to a singleton FlightMgr object
	 */
	public static FlightMgr getFlightMgr() {
		return flightMgr;
	}

	/**
	 * Creates the Flight object based upon input values and persist objects via Flight Service
	 * 
	 * @param flight to be created and persisted
	 * @throws ServiceLoadException
	 * @throws FlightSaveException
	 */
	public boolean create(Flight flight) {

		try {
			IFlightService flightService = (IFlightService) super.getService(IFlightService.NAME);
			flightService.saveFlight(flight);
			return true;
		} catch (ServiceLoadException e) {
			return false;
		} catch (FlightSaveException e) {
			return false;
		}

	}
	
	/**
	 * Query list of Flight
	 * @param flightId
	 * @return Flight - found flight object, if error occurs return null
	 */
	public Flight queryFlights(int flightId) {
		try {
			IFlightService flightService = (IFlightService) super.getService(IFlightService.NAME);
			return flightService.findFlight(flightId);
		}catch (ServiceLoadException e) { 
			return null;
		} catch (FlightFindException e) {
			return null;
		} 
	}

}
