package com.flightreservationsystem.model.services.factory;

import com.flightreservationsystem.model.services.loginservice.ILoginSvc;
import com.flightreservationsystem.model.services.loginservice.LoginSvcImpl;
import com.flightreservationsystem.model.services.registerservice.IRegisterSvc;
import com.flightreservationsystem.model.services.registerservice.RegisterSvcImpl;

public class ServiceFactory {
	
	public ILoginSvc getLoginSvc() {
		return new LoginSvcImpl();
	}
	
	public IRegisterSvc getRegisterSvc() {
		return new RegisterSvcImpl();
	}
	

}
