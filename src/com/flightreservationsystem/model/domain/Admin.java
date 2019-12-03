package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain Admin class holds adminID, adminName, workPhone, workEmail, and
 * managerPassword
 * 
 * @author alysha_velasquez
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
	private int adminID;

	/**
	 * holds full name of admin
	 */
	private String adminName;

	/**
	 * holds work phone number of manager
	 */
	private String workPhone;

	/**
	 * holds work email of manager
	 */
	private String workEmail;

	/**
	 * holds login information
	 */
	private User user;

	/**
	 * default constructor for Admin that calls overloaded constructor with
	 * default values
	 */
	public Admin() {
		this(999, "name", "phone", "email", new User());
	}

	/**
	 * Override default constructor to create Admin object
	 * 
	 * @param adminID
	 * @param adminName
	 * @param workPhone
	 * @param workEmail
	 * @param user
	 */
	public Admin(int adminId, String adminName, String workPhone, String workEmail, User user) {
		this.adminID = adminId;
		this.adminName = adminName;
		this.workPhone = workPhone;
		this.workEmail = workEmail;
		this.user = user;
	}

	/**
	 * @return the adminID
	 */
	public int getAdminID() {
		return adminID;
	}

	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(int managerId) {
		this.adminID = managerId;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String managerName) {
		this.adminName = managerName;
	}

	/**
	 * @return the workPhone
	 */
	public String getWorkPhone() {
		return workPhone;
	}

	/**
	 * @param workPhone the workPhone to set
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	/**
	 * @return the workEmail
	 */
	public String getWorkEmail() {
		return workEmail;
	}

	/**
	 * @param workEmail the workEmail to set
	 */
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
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
	 * Override HashCode when overriding equals method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminID;
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((workEmail == null) ? 0 : workEmail.hashCode());
		result = prime * result + ((workPhone == null) ? 0 : workPhone.hashCode());
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
		Admin other = (Admin) obj;
		if (adminID != other.adminID)
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (workEmail == null) {
			if (other.workEmail != null)
				return false;
		} else if (!workEmail.equals(other.workEmail))
			return false;
		if (workPhone == null) {
			if (other.workPhone != null)
				return false;
		} else if (!workPhone.equals(other.workPhone))
			return false;
		return true;
	}

	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate() {

		if (this.adminID == 0) {
			return false;
		}
		if (this.adminName == null) {
			return false;
		}

		if (this.workPhone == null) {
			return false;
		}
		if (this.workEmail == null) {
			return false;
		}
		if (this.user == null) {
			return false;
		}
		return true;
	}

	/**
	 * @return Admin information in string format
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Admin [adminID=");
		builder.append(adminID);
		builder.append(", adminName=");
		builder.append(adminName);
		builder.append(", workPhone=");
		builder.append(workPhone);
		builder.append(", workEmail=");
		builder.append(workEmail);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}

}
