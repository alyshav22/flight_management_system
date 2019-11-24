package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain Manager class holds managerID, managerName, workPhone, workEmail, and
 * managerPassword
 * 
 * @author alysha_velasquez
 *
 */
public class Manager implements Serializable {
	/**
	 * facilitates versioning of serialized data for Domain Manager class
	 */
	private static final long serialVersionUID = 8574182862248453883L;

	/**
	 * holds manager id
	 */
	private int managerID;

	/**
	 * holds full name of manager
	 */
	private String managerName;

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
	 * default constructor for Manager that calls overloaded constructor with default values
	 */
	public Manager() {
		this(999,"name","phone","email",new User());
	}


	/**
	 * @param managerID
	 * @param managerName
	 * @param workPhone
	 * @param workEmail
	 * @param user
	 */
	public Manager(int managerId, String managerName, String workPhone, String workEmail, User user) {
		this.managerID = managerId;
		this.managerName = managerName;
		this.workPhone = workPhone;
		this.workEmail = workEmail;
		this.user = user;
	}

	/**
	 * @return the managerID
	 */
	public int getManagerID() {
		return managerID;
	}


	/**
	 * @param managerID the managerID to set
	 */
	public void setManagerID(int managerId) {
		this.managerID = managerId;
	}


	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}


	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + managerID;
		result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((workEmail == null) ? 0 : workEmail.hashCode());
		result = prime * result + ((workPhone == null) ? 0 : workPhone.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (managerID != other.managerID)
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
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

		if (this.managerID == 0) {
			return false;
		}
		if (this.managerName == null) {
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


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [managerID=");
		builder.append(managerID);
		builder.append(", managerName=");
		builder.append(managerName);
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
