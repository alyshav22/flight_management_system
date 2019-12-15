package com.flightreservationsystem.model.services;

/**
 * Custom Exception for Register USer
 * @author ALYSHA
 *
 */
public class UserRegisterException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Flight Save Exception for Services
	 * @param inMessage
	 * @param inNestedException
	 */
	public UserRegisterException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

}

