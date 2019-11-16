package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * 
 * Domain Customer class holds the customer id, name, phone number, address,
 * email, password, and credit card number
 * 
 * @author alysha_velasquez
 *
 */
public class Customer implements Serializable {

	/**
	 * facilitates versioning of serialized data 
	 */
	private static final long serialVersionUID = 8818801978078639753L;

	
	/**
	 * holds customer id
	 */
	private String customerId;
	/**
	 * holds customer full name
	 */
	private String customerName;
	/**
	 * holds customer phone number
	 */
	private String phoneNumber;
	/**
	 * holds customer address
	 */
	private String address;
	/**
	 * holds customer email
	 */
	private String email;
	/**
	 * holds customer password
	 */
	private String password;
	/**
	 * holds credit card number
	 */
	private int creditCard;

	
	/**
	 * default constructor
	 */
	public Customer() {
	}

	/**
	 * Override default constructor
	 * 
	 * @param customerId
	 * @param customerName
	 * @param phoneNumber
	 * @param address
	 * @param email
	 * @param password
	 * @param creditCard
	 */
	public Customer(String customerId, String customerName, String phoneNumber, String address, String email,
			String password, int creditCard) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.password = password;
		this.creditCard = creditCard;
	}

	/**
	 * Get customer id
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * Set customer id
	 * @param customerId to set customerId 
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * Get customer name
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * Set customer name
	 * @param customerName to set customerName 
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * Get customer phone number
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * Set customer phone number
	 * @param phoneNumber to set phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * Get customer address
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Set customer address
	 * @param address the to set address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Get customer email
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Set customer email
	 * @param email to set email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Get customer password
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Set customer password
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Get customer credit card
	 * @return the creditCard
	 */
	public int getCreditCard() {
		return creditCard;
	}
	/**
	 * Set customer credit card
	 * @param creditCard to set creditCard
	 */
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	
	/**
	 * Validate if the instance variables are valid
	 * @return boolean - true if instance variables are valid, else false.
	 */
	public boolean validate() {

		if (this.customerId == null) {
			return false;
		}
		if (this.customerName == null) {
			return false;
		}
		if (this.phoneNumber == null) {
			return false;
		}
		if (this.address == null) {
			return false;
		}
		if (this.email == null) {
			return false;
		}
		if (this.password == null) {
			return false;
		}
		if (this.creditCard == 0) {
			return false;
		}

		return true;
	}

	
	/**
	 * Override HashCode when overriding equals method
	 * @return result is the hash value.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + creditCard;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (creditCard != other.creditCard)
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	/**
	 * @return Customer information in string format
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName 
				+ ", phoneNumber=" + phoneNumber + ", address=" 
				+ address + ", email=" + email + ", password=" + password 
				+ ", creditCard=" + creditCard
				+ "]";
	}
}
