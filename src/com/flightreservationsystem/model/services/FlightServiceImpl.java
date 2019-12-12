package com.flightreservationsystem.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import com.flightreservationsystem.model.domain.Flight;

/**
 * Flight Service Interface Implementation
 *
 */

public class FlightServiceImpl implements IFlightService {

	/**
	 * Persisting all Flight objects by unique ID in a Hashtable
	 */
	private static Hashtable<Integer, Flight> flightHashtable = new Hashtable<Integer, Flight>();
	/**
	 * Reference variable for data stream
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
	 * Implements saveFlight from the interface
	 * 
	 * @param flight - contains flight information to save
	 * @throws FlightSaveException - If the flight cannot be saved because of null reference or other exceptions
	 * @return boolean - true
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean saveFlight(Flight flight) throws FlightSaveException {
		try {
			System.out.println("Entering method FlightServiceImpl:: saveFlight");
			try {
				input = new ObjectInputStream(new FileInputStream("saveFlight.ser"));
				flightHashtable = (Hashtable<Integer, Flight>) input.readObject();
			} catch (FileNotFoundException e) {
				System.out.println("savedFlight.ser doesn't exist for input. Will be created for output");
			}
			flightHashtable.put(flight.getFlightID(), flight);
			output = new ObjectOutputStream(new FileOutputStream("saveFlight.ser"));
			output.writeObject(flightHashtable);
			return true;

		} catch (FileNotFoundException e) {
			System.out.println("File containing saved Flight not found!");
			throw new FlightSaveException("File containing saved Flight not found", e);
		} catch (IOException e) {
			System.out.println("IOException while accessing file containing saved flight");
			throw new FlightSaveException("IOException while accesssing file contianing saved flight", e);
		} catch (ClassNotFoundException e) {
			throw new FlightSaveException("ClassNotFoundException while reading file containing saved flight", e);
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					// If any exceptions occur here, print stack trace
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Implements findFlight from Interface
	 * @param flight to find
	 * @return Flight if successful
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Flight findFlight(int flightId) throws FlightFindException {
		
		System.out.println("Entering method FlightServiceImpl:: findFlight");
		try {
				try {
					input = new ObjectInputStream(new FileInputStream("saveFlight.ser"));
					flightHashtable = (Hashtable<Integer, Flight>) input.readObject();
				}catch (FileNotFoundException e) {
					System.out.println("saveFlight.ser does not exist for input, but will be created for output");
					}
				
			Flight flight = flightHashtable.get(flightId);
			return flight;
			
		}catch (FileNotFoundException e) {
			System.out.println("File containing saved Flight not found!");
			throw new FlightFindException( "File containing saved Flight not found!", e);
		} catch (ClassNotFoundException e) {
			
			System.out.println("IOException while accessing file containing saved Flight!");
			throw new FlightFindException("IOException while accessing file containing saved Flight!",e);
		} catch (IOException e) {
			throw new FlightFindException("ClassNotFoundException while reading file containing saved Flight",e);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// If an error occurs trying to close out stream print stack trace
					e.printStackTrace();
			
				}
			}
		}
	}

}
