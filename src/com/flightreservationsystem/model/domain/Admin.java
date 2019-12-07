package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain Admin class holds adminID, firstName, lastName, phone, email, username and
 * password
 * 
 */

public class Admin implements Serializable {
	/**
	 * facilitates versioning of serialized data for Domain Admin class
	 */
	private static final long serialVersionUID = 8574182862248453883L;

	/**
	 * holds admin id
	 */
	private Integer adminID;

	/**
	 * holds first name
	 */
	private String firstName;

	/**
	 * holds first name
	 */
	private String lastName;

	/**
	 * holds phone number
	 */
	private String phone;

	/**
	 * holds email
	 */
	private String email;

	/**
	 * holds username
	 */
	private String username;

	/**
	 * holds password
	 */
	private String password;

	/**
	 * default constructor for Admin that calls overloaded constructor with default
	 * values
	 */
	public Admin() {
		this(9999, "first name", "last name", "phone", "email", "username", "password");
	}

	/**
	 * Overloaded constructor for Admin
	 * 
	 * @param adminID
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param username
	 * @param password
	 */
	public Admin(int adminID, String firstName, String lastName, String phone, String email, String username,
			String password) {
		this.adminID = adminID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	/**
	 * Get the id for an Admin
	 * @return the adminID
	 */
	public int getAdminID() {
		return adminID;
	}

	/**
	 * Set the adminID
	 * @param adminID the adminID to set
	 */
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	/**
	 * Get the first name
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the last name
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the phone number
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Set the phone number
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Get the email
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the email
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the username
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Get the password
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Validate if the instance variables are valid
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate() {

		if (this.adminID == null)
			return false;
		if (this.firstName == null)
			return false;
		if (this.lastName == null)
			return false;
		if (this.phone == null)
			return false;
		if (this.email == null)
			return false;
		if (this.username == null)
			return false;
		if (this.password == null)
			return false;

		return true;
	}

	/**
	 * Always Override Hashcode when overriding equals method
	 * 
	 * @return result - the hash value
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminID == null) ? 0 : adminID.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	/**
	 * Overriding default equals method from Object class
	 * 
	 * @param obj - Inherited from object
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
		Admin other = (Admin) obj;
		if (adminID == null) {
			if (other.adminID != null)
				return false;
		} else if (!adminID.equals(other.adminID))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	/**
	 * toString() method useful for logging
	 */
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}

}
