package com.flightreservationsystem.model.business;

import com.flightreservationsystem.model.domain.User;
import com.flightreservationsystem.model.services.VerifyUserException;
import com.flightreservationsystem.model.services.IUserService;
import com.flightreservationsystem.model.services.ServiceLoadException;
import com.flightreservationsystem.model.services.UserRegisterException;

/**
 * Business layer super type to provide a common definition for user cases for
 * User
 * 
 * @author Alysha 
 *
 */
public class UserMgr extends ManagerSuperType {

	/**
	 * Default constructor
	 */
	private UserMgr() {

	}
	// Singleton pattern to ensure only one UserMgr object

	/**
	 * Static reference to a singleton UserMgr object
	 */
	private static UserMgr userMgr = new UserMgr();

	public static UserMgr getUserMgr() {
		return userMgr;
	}

	/**
	 * Creates the User object based upon input values and persist objects via User
	 * Service
	 * 
	 * @param fuser to be created and persisted
	 * @throws ServiceLoadException
	 * @throws UserRegisterException
	 */
	public boolean create(User user) {

		try {
			IUserService userService = (IUserService) super.getService(IUserService.NAME);
			userService.saveUser(user);
			return true;
		} catch (ServiceLoadException e) {
			return false;
		} catch (UserRegisterException e) {
			return false;
		}

	}

	public User queryUser(String userEmail) {
		try {
			IUserService userService = (IUserService) super.getService(IUserService.NAME);
			return userService.checkLogin(userEmail);
		} catch (ServiceLoadException e) {
			return null;
		} catch (VerifyUserException e) {
			return null;
		}
	}

}
