package com.flightreservationsystem.model.services;

/**
 * Custom Exception for loading factory objects
 *
 */

public class ServiceLoadException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Service Load Exception for communicating between business and service layer
	 * @param inMessage
	 * @param inNestedException
	 */
	public ServiceLoadException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}
	
} //end class ServiceLoadException
