package com.flightreservationsystem.model.services;

import com.flightreservationsystem.model.services.IService;
import com.flightreservationsystem.model.services.ServiceLoadException;

/**
 * Implementation of Service Factory
 * 
 * @author alysha_velasquez
 *
 */

public class ServiceFactory {

	/**
	 * Singleton pattern ensures that there is only one Service factory object
	 */
	private ServiceFactory() {

	}

	/**
	 * Static reference to a singleton factory object
	 */
	private static ServiceFactory serviceFactory = new ServiceFactory();

	/**
	 * Getter for a Factory object
	 * 
	 * @return serviceFactory
	 */
	public static ServiceFactory getInstance() {
		return serviceFactory;
	}

	/**
	 * Abstract Factory to return any service
	 * 
	 * @param name
	 * @return
	 * 
	 */
	public IService getService(String name) throws ServiceLoadException {

		try {
			Class<?> serviceClass = Class.forName(getImplementation(name));
			return (IService) serviceClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new ServiceLoadException(name + " Not loaded", e);
		}

	}

	/**
	 * Method to get Names Services in properties
	 * 
	 * @param name - Name of the IService
	 * @return Name - fully qualified package name
	 * @throws Exception
	 */
	private String getImplementation(String name) throws Exception {

		java.util.Properties props = new java.util.Properties();
		String propertyFileLocation = System.getProperty("prop_location");
		System.out.println("Property File Location passed : " + propertyFileLocation);
		java.io.FileInputStream file = new java.io.FileInputStream(propertyFileLocation);
		props.load(file);
		file.close();
		return props.getProperty(name);

	}

} // end class ServiceFactory
