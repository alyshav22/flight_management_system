package com.flightreservationsystem.model.services;

/**
 * Customer Exception for saving User objects
 * @author Alysha 
 *
 */

public class UserRegisterException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom User Register Exception for Services
	 * @param inMessage
	 * @param inNestedException
	 */
	public UserRegisterException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}
	
	

}