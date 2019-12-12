/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightreservationsystem.model.services;


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

