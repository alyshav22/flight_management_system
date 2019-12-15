package com.flightreservationsystem.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import com.flightreservationsystem.model.domain.Airplane;

/**
 * Flight Service Interface Implementation
 * 
 * @author ALYSHA
 *
 */
public class AirplaneServiceImpl implements IAirplaneService {

	/**
	 * Persisting all Airplane objects by unique ID in a Hashtable
	 */
	private static Hashtable<Integer, Airplane> airplaneHashtable = new Hashtable<Integer, Airplane>();
	/**
	 * Reference variable for data stream
	 */
	ObjectOutputStream output;
	ObjectInputStream input;

	/**
	 * Get airplaneHashtable
	 * 
	 * @return airplaneHashtable for all saved airplane by ID
	 */
	public static Hashtable<Integer, Airplane> getAirplaneHashtable() {
		return airplaneHashtable;
	}

	/**
	 * Implements saveAirplane from the interface
	 * 
	 * @param airplane - contains airplane information to save
	 * @throws AirplaneSaveException - If the airplane cannot be saved because of
	 *                               null reference or other exceptions
	 * @return boolean - true
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean saveAirplane(Airplane airplane) throws AirplaneSaveException {
		try {
			System.out.println("Entering method AirplaneServiceImpl:: saveAirplane");
			try {
				input = new ObjectInputStream(new FileInputStream("saveAirplane.ser"));
				airplaneHashtable = (Hashtable<Integer, Airplane>) input.readObject();
			} catch (FileNotFoundException e) {
				System.out.println("savedAirplane.ser doesn't exist for input. Will be created for output");
			}
			airplaneHashtable.put(airplane.getAirplaneID(), airplane);
			output = new ObjectOutputStream(new FileOutputStream("saveAirplane.ser"));
			output.writeObject(airplaneHashtable);
			return true;

		} catch (FileNotFoundException e) {
			System.out.println("File containing saved Airplane not found!");
			throw new AirplaneSaveException("File containing saved Airplane not found", e);
		} catch (IOException e) {
			System.out.println("IOException while accessing file containing saved Airplane");
			throw new AirplaneSaveException("IOException while accesssing file contianing saved Airplane", e);
		} catch (ClassNotFoundException e) {
			throw new AirplaneSaveException("ClassNotFoundException while reading file containing saved Airplane", e);
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
	 * Implements find Airplane from Interface
	 * 
	 * @param airplane to find
	 * @return Airplane if successful
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Airplane findAirplane(int airplaneId) throws AirplaneFindException {

		System.out.println("Entering method AirplaneServiceImpl:: findAirplane");
		try {
			try {
				input = new ObjectInputStream(new FileInputStream("saveAirplane.ser"));
				airplaneHashtable = (Hashtable<Integer, Airplane>) input.readObject();
			} catch (FileNotFoundException e) {
				System.out.println("saveAirplane.ser does not exist for input, but will be created for output");
			}

			Airplane airplane = airplaneHashtable.get(airplaneId);
			return airplane;

		} catch (FileNotFoundException e) {
			System.out.println("File containing saved Airplane not found!");
			throw new AirplaneFindException("File containing saved Airplane not found!", e);
		} catch (ClassNotFoundException e) {
			System.out.println("IOException while accessing file containing saved Airplane!");
			throw new AirplaneFindException("IOException while accessing file containing saved Airplane!", e);
		} catch (IOException e) {
			throw new AirplaneFindException("ClassNotFoundException while reading file containing saved Airplane", e);
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
