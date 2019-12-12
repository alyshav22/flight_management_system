package com.flightreservationsystem.model.services;


/**
 * Custom Exception for finding objects
 *
 */

public class FlightFindException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Flight Find Exception for services
	 * @param inMessage
	 * @param inNestedException
	 */
	public FlightFindException(final String inMessage, final Throwable inNestedException) {
        super(inMessage, inNestedException);

	}

}
