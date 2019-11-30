package com.flightreservationsystem.model.services;

/**
 * Exception for saving objects
 * 
 * @author alysha_velasquez
 *
 */

public class FlightSaveException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Save Exception for Services
	 * @param inMessage
	 * @param inNestedException
	 */
	public FlightSaveException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

}