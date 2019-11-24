package com.flightreservationsystem.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import com.flightreservationsystem.model.domain.Flight;
import com.flightreservationsystem.model.services.SaveException;

/**
 * Flight Service Interface Implementation
 * 
 * @author alysha_velasquez
 *
 */


public class FlightServiceImpl implements IFlightService {
	
	/**
	 * Hash table for persisting all Flight objects by unique ID
	 */
	private static Hashtable<Integer, Flight> flightHashtable = new Hashtable<Integer, Flight>();
	
	/**
	 * Reference variable to hold data stream
	 */
	ObjectOutputStream output;
	ObjectInputStream input;
	
	/**
	 * Get flightHashtable
	 * @return flightHashtable for all saved flight by ID
	 */
	public static Hashtable<Integer, Flight> getFlightHashtable() {
		return flightHashtable;
	}
	
	/**
	 * Implements saveFlight from interface
	 * @param flight - the flight to save
	 * @throws SaveException - If the flight cannot be saved due to null reference and other exceptions
	 * @return boolean - true for simplicity purpose
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean saveFlight(Flight flight) throws SaveException {
		try {
			System.out.println("Entering method FlightServiceImpl:: saveFlight");
			try {
				input = new ObjectInputStream(new FileInputStream("savedFlight.ser"));
				flightHashtable = (Hashtable<Integer, Flight>) input.readObject();
			} catch (FileNotFoundException e) {
				System.out.println("savedFlight.ser does not exist for input, but will be created for output");
			}
			flightHashtable.put(flight.getFlightID(), flight);
			output = new ObjectOutputStream (new FileOutputStream ("savedFlight.ser"));
			output.writeObject(flightHashtable);
			return true;
			
		} catch (FileNotFoundException e) {
			System.out.println("File containing saved Flight not found!");
			throw new SaveException("File containing saved Flight not found", e);
		}catch (IOException e) {
			System.out.println("IOException while accessing file containing saved flight");
			throw new SaveException("IOException while accesssing file contianing saved flight", e);
		}catch(ClassNotFoundException e) {
			throw new SaveException("ClassNotFoundException while reading file containing saved flight", e);
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					//If an error occurs trying to close out stream print stack trace
					e.printStackTrace();
				}
			}
		}
	} 
	

}
