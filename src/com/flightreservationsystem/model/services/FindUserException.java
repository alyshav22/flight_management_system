package com.flightreservationsystem.model.services;

public class FindUserException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Flight Find Exception for services
	 * @param inMessage
	 * @param inNestedException
	 */
	public FindUserException(final String inMessage, final Throwable inNestedException) {
            super(inMessage, inNestedException);

	}

}
