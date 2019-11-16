package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain Manager class holds managerId, managerName, workPhone, workEmail, and
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
	private int managerId;

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
	 * holds manager password
	 */
	private String managerPassword;

	/**
	 * default constructor
	 */
	public Manager() {
	}

	/**
	 * Override default constructor
	 * 
	 * @param managerId
	 * @param managerName
	 * @param workPhone
	 * @param workEmail
	 * @param managerPassword
	 */
	public Manager(int managerId, String managerName, String workPhone, String workEmail, String managerPassword) {
		this.managerId = managerId;
		this.managerName = managerName;
		this.workPhone = workPhone;
		this.workEmail = workEmail;
		this.managerPassword = managerPassword;
	}

	/**
	 * Get manager id
	 * 
	 * @return the managerId
	 */
	public int getManagerId() {
		return managerId;
	}

	/**
	 * Set manager id
	 * 
	 * @param managerId set managerId
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	/**
	 * Get the full name of manager
	 * 
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * Set manager name
	 * 
	 * @param managerName to set managerName
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * Get manager work phone number
	 * 
	 * @return the workPhone
	 */
	public String getWorkPhone() {
		return workPhone;
	}

	/**
	 * Set manager work phone number
	 * 
	 * @param workPhone to set set workPhone
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	/**
	 * Get manager work email
	 * 
	 * @return the workEmail
	 */
	public String getWorkEmail() {
		return workEmail;
	}

	/**
	 * Set manager work email
	 * 
	 * @param workEmail to set workEmail
	 */
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}

	/**
	 * Get manager password
	 * 
	 * @return the managerPassword
	 */
	public String getManagerPassword() {
		return managerPassword;
	}

	/**
	 * Set manager password
	 * 
	 * @param managerPassword to set managerPassword
	 */
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	
	

	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate() {

		if (this.managerId == 0) {
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
		if (this.managerPassword == null) {
			return false;
		}
		return true;
	}

	/**
	 * Override HashCode when overriding equals method
	 * 
	 * @return result - the hash value
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + managerId;
		result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
		result = prime * result + ((managerPassword == null) ? 0 : managerPassword.hashCode());
		result = prime * result + ((workEmail == null) ? 0 : workEmail.hashCode());
		result = prime * result + ((workPhone == null) ? 0 : workPhone.hashCode());
		return result;
	}

	/**
	 * Overriding default equals method from Object Class
	 * 
	 * @param obj - Inherited from Object
	 * @return boolean - False if any of the test fail equality default returns true
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (managerId != other.managerId)
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
			return false;
		if (managerPassword == null) {
			if (other.managerPassword != null)
				return false;
		} else if (!managerPassword.equals(other.managerPassword))
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
	 * 
	 * @return Manager information in string format
	 */
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", workPhone=" + workPhone
				+ ", workEmail=" + workEmail + ", managerPassword=" + managerPassword + "]";
	}

}
