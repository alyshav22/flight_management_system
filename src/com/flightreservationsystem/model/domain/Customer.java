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
	 * holds customer ID
	 */
	private int customerID;
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
	 * holds customer credit card number
	 */
	private int creditCard;

	/**
	 * holds login information
	 */
	private User user;

	/**
	 * Default constructor
	 */
	public Customer() {
		this(555, "name", "phone", "address", "email", 111, new User());
	}

	/**
	 * Override default constructor to create Customer object
	 * 
	 * @param customerID
	 * @param customerName
	 * @param phoneNumber
	 * @param address
	 * @param email
	 * @param creditCard
	 * @param user
	 */
	public Customer(int customerID, String customerName, String phoneNumber, String address, String email,
			int creditCard, User user) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.creditCard = creditCard;
		this.user = user;
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the creditCard
	 */
	public int getCreditCard() {
		return creditCard;
	}

	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false.
	 */
	public boolean validate() {

		if (this.customerID == 0) {
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
		if (this.creditCard == 0) {
			return false;
		}
		if (this.user == null) {
			return false;
		}

		return true;
	}

	/**
	 * Override HashCode when overriding equals method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + creditCard;
		result = prime * result + customerID;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (creditCard != other.creditCard)
			return false;
		if (customerID != other.customerID)
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
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/**
	 * @return Customer information in string format
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerID=");
		builder.append(customerID);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", address=");
		builder.append(address);
		builder.append(", email=");
		builder.append(email);
		builder.append(", creditCard=");
		builder.append(creditCard);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}

}
