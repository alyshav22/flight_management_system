package com.flightreservationsystem.model.services;


/**
 * Custom Exception for finding User objects
 * @author Alysha 
 */

public class VerifyUserException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom User Find Exception for services
	 * @param inMessage
	 * @param inNestedException
	 */
	public VerifyUserException(final String inMessage, final Throwable inNestedException) {
            super(inMessage, inNestedException);

	}

}
