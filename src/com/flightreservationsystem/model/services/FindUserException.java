package com.flightreservationsystem.model.services;


/**
 * Custom Exception for finding User objects
 * @author Alysha 
 */

public class FindUserException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom User Find Exception for services
	 * @param inMessage
	 * @param inNestedException
	 */
	public FindUserException(final String inMessage, final Throwable inNestedException) {
            super(inMessage, inNestedException);

	}

}
