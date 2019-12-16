package com.flightreservationsystem.model.business;

import com.flightreservationsystem.model.domain.Airplane;
import com.flightreservationsystem.model.services.AirplaneFindException;
import com.flightreservationsystem.model.services.AirplaneSaveException;
import com.flightreservationsystem.model.services.IAirplaneService;
import com.flightreservationsystem.model.services.ServiceLoadException;

public class AirplaneMgr extends ManagerSuperType{
	
	/**
	 * Default constructor
	 */
	private AirplaneMgr() {

	}
	
	//Singleton pattern to ensure only one AirplaneMgr object

	/**
	 * Static reference to a singleton AirplaneMgr object
	 */
	private static AirplaneMgr airplaneMgr = new AirplaneMgr();

	
	/**
	 * Getter AirplaneMgr object
	 * @return airplaneMgr - Static reference to a singleton FlightMgr object
	 */
	public static AirplaneMgr getAirplaneMgr() {
		return airplaneMgr;
	}

	/**
	 * Creates the Airplane object based upon input values and persist objects via Airplane Service
	 * 
	 * @param flight to be created and persisted
	 * @throws ServiceLoadException
	 * @throws AirplaneSaveException
	 */
	public boolean create(Airplane airplane) {

		try {
			IAirplaneService airplaneService = (IAirplaneService) super.getService(IAirplaneService.NAME);
			airplaneService.saveAirplane(airplane);
			return true;
		} catch (ServiceLoadException e) {
			return false;
		} catch (AirplaneSaveException e) {
			return false;
		}

	}
	
	/**
	 * Query list of Airplane
	 * @param AirplaneId
	 * @return Airplane - found Airplane object, if error occurs return null
	 */
	public Airplane queryAirplanes(int airplaneId) {
		try {
			IAirplaneService airplaneService = (IAirplaneService) super.getService(IAirplaneService.NAME);
			return airplaneService.findAirplane(airplaneId);
		}catch (ServiceLoadException e) { 
			return null;
		} catch (AirplaneFindException e) {
			return null;
		} 
	}

}
