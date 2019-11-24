package com.flightreservationsystem.model.services;

/**
 * Custom Exception for loading factory objects
 * @author alysha_velasquez
 *
 */

public class ServiceLoadException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Service load exception for communication between business layer and service layer
	 * @param inMessage
	 * @param inNestedException
	 */
	public ServiceLoadException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

}
