package com.flightreservationsystem.model.services;

/**
 * Custom exception for verifying User
 * @author ALYSHA
 *
 */
public class VerifyUserException extends Exception{
    private static final long serialVersionUID = 1L;
	
	/**
	 * Custom Verify User Exception for services
	 * @param inMessage
	 * @param inNestedException
	 */
	public VerifyUserException(final String inMessage, final Throwable inNestedException) {
            super(inMessage, inNestedException);

	}
    
}
