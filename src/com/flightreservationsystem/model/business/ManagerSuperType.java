package com.flightreservationsystem.model.business;

import java.io.FileNotFoundException;

import com.flightreservationsystem.model.services.IService;
import com.flightreservationsystem.model.services.PropertyManager;
import com.flightreservationsystem.model.services.ServiceFactory;
import com.flightreservationsystem.model.services.ServiceLoadException;

public abstract class ManagerSuperType {

	static {
		try {
			ManagerSuperType.loadProperties();
		} catch (FileNotFoundException e) {
			System.out.println("Properties file failed to be loaded quiting appliction ");
			System.exit(1);
		}
	}

	/**
	 * Gets the reference to the Singleton object for the Service factory
	 */
	private ServiceFactory factory = ServiceFactory.getInstance();

	/**
	 * Get the correct service specified by the business layer use case
	 * 
	 * @param name - The name of the service needed provided by the Service
	 *             Interface
	 * @return - A service provided by the factory
	 * @throws ServiceLoadException
	 */
	protected IService getService(String name) throws ServiceLoadException {
		return factory.getService(name);
	}

	/**
	 * Method to load application properties file
	 * 
	 * @throws FileNotFoundException
	 */
	public static void loadProperties() throws FileNotFoundException {
		String FileLocation = "config//application.properties";
		PropertyManager.loadProperties(FileLocation);
	}

}
