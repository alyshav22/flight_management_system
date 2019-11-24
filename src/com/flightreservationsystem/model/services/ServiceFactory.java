package com.flightreservationsystem.model.services;

import com.flightreservationsystem.model.services.IService;
import com.flightreservationsystem.model.services.ServiceLoadException;

/**
 * Implementation of Service Factory
 * @author alysha_velasquez
 *
 */

public class ServiceFactory {
	
	/**
	 * Default constructor 
	 */
	private ServiceFactory() {}
	
	// Singleton pattern to insure only one Service factory object 
	
	/**
	 * Static reference to a singleton factory object 
	 */
	private static ServiceFactory serviceFactory = new ServiceFactory();

	/**
	 * Getter for a factory object 
	 * @return serviceFactory - Static reference to a singleton factory object 
	 */
	public static ServiceFactory getInstance() {
		return serviceFactory;
	}
	
	
	/**
	 * Abstract Factory to return Any service
	 * @param name
	 * @return
	 * 
	 */
	public IService getService(String name) throws ServiceLoadException {
		
		try {
			Class<?> serviceClass = Class.forName(getImplementation(name));
			return (IService) serviceClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new ServiceLoadException(name + " Not loaded or found", e);
		}
		
	}
	
	
	/**
	 * Method to get Names Services in properties 
	 * @param name - The name of the IService
	 * @return Name - fully qualified package name
	 * @throws Exception
	 */
	private String getImplementation (String name) throws Exception {
		
		java.util.Properties props = new java.util.Properties(); 
		String propertyFileLocation = System.getProperty("prop_location");
		System.out.println("Property File Location passed : " + propertyFileLocation);
		java.io.FileInputStream file = new java.io.FileInputStream(propertyFileLocation);
		props.load(file);
		file.close();
		return props.getProperty(name);
		
		}
	
	
	
	

	
	

}
