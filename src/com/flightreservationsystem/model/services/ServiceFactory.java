package com.flightreservationsystem.model.services;

/**
 * Implementation of Service Factory
 * @author ALYSHA
 */

public class ServiceFactory {

	/**
	 * Default constructor
	 */
	private ServiceFactory() {}
	
	// Singleton pattern to ensure only one Service factory object

	/**
	 * Static reference to a singleton factory object
	 */
	private static ServiceFactory serviceFactory = new ServiceFactory();

	/**
	 * Getter for a Factory object
	 * @return serviceFactory - Static reference to a singleton factory object
	 */
	public static ServiceFactory getInstance() {
		return serviceFactory;
	}

	/**
	 * Abstract Factory to return any service
	 * @param name
	 * @return
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
	 * @param name - Name of the IService
	 * @return Name - fully qualified package name
	 * @throws Exception
	 */
	private String getImplementation(String serviceName) throws Exception {

		return PropertyManager.getPropertyValue(serviceName);

	}

} //End class ServiceFactory
