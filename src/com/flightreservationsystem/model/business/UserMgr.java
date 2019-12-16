package com.flightreservationsystem.model.business;

import com.flightreservationsystem.model.domain.User;
import com.flightreservationsystem.model.services.VerifyUserException;
import com.flightreservationsystem.model.services.IUserService;
import com.flightreservationsystem.model.services.ServiceLoadException;
import com.flightreservationsystem.model.services.UserRegisterException;

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

	/**
	 * Getter UserMgr object
	 * 
	 * @return UserMgr - Static reference to a singleton UserMgr object
	 */
	public static UserMgr getUserMgr() {
		return userMgr;
	}

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

	public User queryUser(String userEmail, String userPassword) {
		try {
			IUserService userService = (IUserService) super.getService(IUserService.NAME);
			return userService.checkLogin(userEmail, userPassword);
		} catch (ServiceLoadException e) {
			return null;
		} catch (VerifyUserException e) {
			return null;
		}
	}

}
