package com.flightreservationsystem.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * PropertyManager is responsible for loading the property file into memory
 * @author Alysha 
 */


public class PropertyManager {
	
	private static Properties properties;
	 
	/**
	 * Loads property file to make data available in application state 	
	 * 
	 * @param FileLocation
	 * @throws FileNotFoundException
	 */
	public static void loadProperties(String FileLocation) throws FileNotFoundException {
		    properties = new Properties();
		    FileInputStream input = null;
		    try {
		      input = new FileInputStream(FileLocation);
		      properties.load(input);
		      System.out.println("Property file loaded from location: " + FileLocation);
		    } catch (FileNotFoundException e) {
			    	System.out.println("file cannot be found.");
			    throw new FileNotFoundException();
			 }
		    catch (IOException e) {
		    		System.out.println("IOException while loading Properties file.");
			    throw new FileNotFoundException();
		    } catch (Exception e) 
		    {
		    	System.out.println("Exception while loading Properties file.");
			    throw new FileNotFoundException();
		    } finally {
				if (input != null) {	
				      try {
	 			            input.close();
				   } catch (IOException e) {
					e.printStackTrace();
				   }
			    }	
			}   
		} 

		
		/**
		 * Method gets the the property value 
		 * @param value
		 * @return
		 */
	    static public String getPropertyValue (String value)
	    {
	    	return properties.getProperty(value);
	    }

}//End class propertyManager
