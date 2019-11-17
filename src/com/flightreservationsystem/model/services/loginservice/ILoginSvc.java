package com.flightreservationsystem.model.services.loginservice;

import com.flightreservationsystem.model.domain.Customer;
import com.flightreservationsystem.model.domain.Manager;

public interface ILoginSvc {
	
	public boolean authenticateCustomer(Customer customer);
	
	public boolean authenticateManager(Manager manager);

}
