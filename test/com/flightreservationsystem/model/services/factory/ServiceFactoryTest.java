package com.flightreservationsystem.model.services.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import com.flightreservationsystem.model.services.loginservice.ILoginSvc;
import com.flightreservationsystem.model.services.loginservice.LoginSvcImpl;

public class ServiceFactoryTest {
	
	ServiceFactory serviceFactory;

	@Before
	public void setup() throws Exception{
		serviceFactory = new ServiceFactory();
	}
	
	
	public void testGetLoginSvc() {
		ILoginSvc loginSvc = (ILoginSvc)serviceFactory.getLoginSvc();
		assertTrue(loginSvc instanceof LoginSvcImpl);
	}

}
