package com.flightreservationsystem.model.services;
import com.flightreservationsystem.model.domain.User;

/**
 * Service interface for a User
 * @author ALYSHA
 *
 */

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
	public User checkLogin(String Email, String Password) throws VerifyUserException;
    
}
