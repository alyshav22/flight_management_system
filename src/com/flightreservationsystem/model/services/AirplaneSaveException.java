package com.flightreservationsystem.model.services;

public class AirplaneSaveException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Airplane Save Exception for Services
	 * @param inMessage
	 * @param inNestedException
	 */
	public AirplaneSaveException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

}
