/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightreservationsystem.model.services;

import com.flightreservationsystem.model.domain.User;


public interface IUserService extends IService{
    
    public final String NAME = "IUserService";
	
	/**
	 * Stub to save a user
	 * @param user - contains user information to be save
	 * @return boolean - true if saved
	 * @throws UserRegisterException 
	 */
	public boolean saveUser(User user) throws UserRegisterException;
	
	/**
	 * Stub to find a user
	 * @param Email
            * @param Password
	 * @return user if successful
	 */
	public User checkLogin(String Email) throws FindUserException;
    
}
