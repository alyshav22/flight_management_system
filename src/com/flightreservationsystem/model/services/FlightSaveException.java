package com.flightreservationsystem.model.services;

/**
 * Custom Exception for saving objects
 *
 */

public class FlightSaveException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Flight Save Exception for Services
	 * @param inMessage
	 * @param inNestedException
	 */
	public FlightSaveException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

}
