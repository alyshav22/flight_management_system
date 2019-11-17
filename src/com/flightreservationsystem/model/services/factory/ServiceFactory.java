package com.flightreservationsystem.model.services.factory;

import com.flightreservationsystem.model.services.loginservice.ILoginSvc;
import com.flightreservationsystem.model.services.loginservice.LoginSvcImpl;
import com.flightreservationsystem.model.services.registerservice.IRegisterSvc;
import com.flightreservationsystem.model.services.registerservice.RegisterSvcImpl;

/**
 * Implementation of Service Factory
 * @author alysha_velasquez
 *
 */

public class ServiceFactory {
	
	/**
	 * Getter for a factory object
	 * @return LoginSvcImpl
	 */
	
	public ILoginSvc getLoginSvc() {
		return new LoginSvcImpl();
	}
	
	/**
	 * Getter for a factory object
	 * @return RegisterSvcImpl
	 */
	public IRegisterSvc getRegisterSvc() {
		return new RegisterSvcImpl();
	}
	

}
