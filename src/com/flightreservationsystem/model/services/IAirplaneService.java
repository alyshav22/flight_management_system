package com.flightreservationsystem.model.services;

import com.flightreservationsystem.model.domain.Airplane;

/**
 * Service Interface for a Airplane
 * @author ALYSHA
 *
 */
public interface IAirplaneService extends IService {
	
	 public final String NAME = "IAirplaneService";
		
		/**
		 * Stub to save a airplane
		 * @param airplane - contains airplane information to be save
		 * @return boolean - true if saved
		 * @throws AirplaneSaveException 
		 */
		public boolean saveAirplane(Airplane airplane) throws AirplaneSaveException;
		
		/**
		 * Stub to find a airplane
		 * 
		 * @return airplane
		 */
		public Airplane findAirplane(int airplaneId) throws AirplaneFindException;

		
	    

}
