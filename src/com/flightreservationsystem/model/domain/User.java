package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain User class holds name, email, password
 * @author ALYSHA
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 6090091675974840036L;

	/**
	 * holds name location
	 */
	private String FullName;

	/**
	 * holds email location
	 */
	private String EmailAddress;

	/**
	 * hold password location
	 */
	private String Password;

	public User() {
		this("Admin", "admin@admin.com", "123456");
	}

	/**
	 * Overloaded constructor for User
	 * 
	 * @param name
	 * @param email
	 * @param password
	 */
	public User(String name, String email, String password) {
		this.FullName = name;
		this.EmailAddress = email;
		this.Password = password;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String FullName) {
		this.FullName = FullName;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	@Override
	public String toString() {
		return "User [Name=" + FullName + ", Email=" + EmailAddress;

	}
	
	/**
	 * Validate if the instance variables are valid
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate() {

		if (this.FullName == null)
			return false;
		if (this.EmailAddress == null)
			return false;
		if (this.Password == null)
			return false;

		return true;
	}
	
	/**
	 * Always Override HashCode when overriding equals method
	 * @return result - the hash value
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmailAddress == null) ? 0 : EmailAddress.hashCode());
		result = prime * result + ((FullName == null) ? 0 : FullName.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		return result;
	}
	/**
	 * Overriding default equals method from Object Class
	 * @param obj - Inherited from Object
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
		if (EmailAddress == null) {
			if (other.EmailAddress != null)
				return false;
		} else if (!EmailAddress.equals(other.EmailAddress))
			return false;
		if (FullName == null) {
			if (other.FullName != null)
				return false;
		} else if (!FullName.equals(other.FullName))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		return true;
	}
	
	
	
	

}
