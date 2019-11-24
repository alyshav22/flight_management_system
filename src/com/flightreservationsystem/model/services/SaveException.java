package com.flightreservationsystem.model.services;

/**
 * Custom Exception for saving objects
 * 
 * @author alysha_velasquez
 *
 */

public class SaveException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Save Exception for Services
	 * @param inMessage
	 * @param inNestedException
	 */
	public SaveException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

}
