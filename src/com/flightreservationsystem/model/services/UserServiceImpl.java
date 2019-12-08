package com.flightreservationsystem.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import com.flightreservationsystem.model.domain.User;

/**
 * User Service Interface Implementation
 * @author Alysha 
 *
 */

public class UserServiceImpl implements IUserService {

	private static Hashtable<String, User> userHashTable = new Hashtable<String, User>();
	
	/**
	 * Reference variable for data stream
	 */
	ObjectOutputStream output;
	ObjectInputStream input;

	public static Hashtable<String, User> getUserHashtable() {
		return userHashTable;
	}
	
	/**
	 * Implements saveUser from the interface
	 * 
	 * @param user - contains user information to save
	 * @throws UserRegisterException - If the flight cannot be saved because of null reference or other exceptions
	 * @return boolean - true
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean saveUser(User user) throws UserRegisterException {
		try {
			System.out.println("Entering method UserServiceImpl:: saveUser");
			try {
				input = new ObjectInputStream(new FileInputStream("saveUser.ser"));
				userHashTable = (Hashtable<String, User>) input.readObject();
			} catch (FileNotFoundException e) {
				System.out.println("savedUser.ser doesn't exist for input. Will be created for output");
			}
			userHashTable.put(user.getEmailAddress(), user);
			output = new ObjectOutputStream(new FileOutputStream("saveUser.ser"));
			output.writeObject(userHashTable);
			return true;

		} catch (FileNotFoundException e) {
			System.out.println("File containing saved User not found!");
			throw new UserRegisterException("File containing saved User not found", e);
		} catch (IOException e) {
			System.out.println("IOException while accessing file containing saved user");
			throw new UserRegisterException("IOException while accesssing file contianing saved user", e);
		} catch (ClassNotFoundException e) {
			throw new UserRegisterException("ClassNotFoundException while reading file containing saved user", e);
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

	@SuppressWarnings("unchecked")
	@Override
	public User checkLogin(String Email) throws FindUserException {
		System.out.println("Entering method UserServiceImpl:: checkLogin");
		try {
			try {
				input = new ObjectInputStream(new FileInputStream("saveUser.ser"));
				userHashTable = (Hashtable<String, User>) input.readObject();
			} catch (FileNotFoundException e) {
				System.out.println("saveUser.ser does not exist for input, but will be created for output");
			}

			User user = userHashTable.get(Email);
			return user;

		} catch (FileNotFoundException e) {
			System.out.println("File containing saved user not found!");
			throw new FindUserException("File containing saved user not found!", e);
		} catch (ClassNotFoundException e) {

			System.out.println("IOException while accessing file containing saved user!");
			throw new FindUserException("IOException while accessing file containing saved user!", e);
		} catch (IOException e) {
			throw new FindUserException("ClassNotFoundException while reading file containing saved user", e);
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
