package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain User class holds username and password
 * 
 * @author alysha_velasquez
 *
 */

public class User implements Serializable {

	private static final long serialVersionUID = 6090091675974840036L;

	/**
	 * holds username
	 */
	private String username;
	/**
	 * holds user password
	 */
	private String password;

	/**
	 * Default constructor
	 */
	public User() {
		this("username", "password");
	}

	/**
	 * Override default constructor to create User object
	 * 
	 * @param username
	 * @param password
	 */
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Override HashCode when overriding equals method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	/**
	 * Overriding default equals method from Object Class
	 * 
	 * @param obj is inherited from Object
	 * @return boolean - False if any of the test fail equality default return true
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false.
	 */
	public boolean validate() {

		if (this.username == null) {
			return false;
		}
		if (this.password == null) {
			return false;
		}
		return true;
	}

	/**
	 * @return User information in string format
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
