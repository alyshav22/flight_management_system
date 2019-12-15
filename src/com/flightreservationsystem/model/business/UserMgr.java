/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightreservationsystem.model.business;

import com.flightreservationsystem.model.domain.User;
import com.flightreservationsystem.model.services.VerifyUserException;
import com.flightreservationsystem.model.services.IUserService;
import com.flightreservationsystem.model.services.ServiceLoadException;
import com.flightreservationsystem.model.services.UserRegisterException;


public class UserMgr extends ManagerSuperType{
    
    private UserMgr(){
    
    }
    
    private static UserMgr userMgr = new UserMgr();
    
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
		}catch(UserRegisterException e){
                    return false;
                }

	}
    
    public User queryUser(String userEmail){
		try {
			IUserService userService = (IUserService) super.getService(IUserService.NAME);
			return userService.checkLogin(userEmail);
		}catch (ServiceLoadException e) { 
			return null;
		} catch(VerifyUserException e){
                        return null;
                        }
	}

    
}
