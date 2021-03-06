package com.flightreservationsystem.model.services;

/**
 * Custom Exception for finding Airplane
 * @author ALYSHA
 */
public class AirplaneFindException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Airplane Find Exception for services
	 * @param inMessage
	 * @param inNestedException
	 */
	public AirplaneFindException(final String inMessage, final Throwable inNestedException) {
        super(inMessage, inNestedException);

	}

}
