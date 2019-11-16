package com.flightreservationsystem.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Domain Available class holds availability of flights, state tax, and a list of
 * flights
 *
 * @author alysha_velasquez
 *
 */
public class AvailableFlights implements Serializable {
	/**
	 * facilitates versioning of serialized data 
	 */
	private static final long serialVersionUID = -8874103197709521771L;

	
	/**
	 * holds state if flight is available or not
	 */
	private boolean available;
	/**
	 * state tax associated with this flight
	 */
	private float stateTax;
	/**
	 * holds flight objects
	 */
	private ArrayList<Flight> availableFlightList = new ArrayList<Flight>(1);
	
	
	/**
	 * default constructor
	 */
	public AvailableFlights() {
	}
	/**
	 * Override default constructor for AvailableFlights
	 */
	public AvailableFlights(boolean available, float stateTax) {
		this.available = available;
		this.stateTax = stateTax;
		this.availableFlightList = new ArrayList<Flight>(1);
	}

	
	/**
	 * Get availability status of flight
	 * @return available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * Set availability status of flight
	 * @param available set available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/**
	 * Get state tax
	 * @return stateTax
	 */
	public float getStateTax() {
		return stateTax;
	}
	/**
	 * Set state tax
	 * @param stateTax set stateTax
	 */
	public void setStateTax(float stateTax) {
		this.stateTax = stateTax;
	}
	/**
	 * Get a list of available flight list
	 * @return availableFlightList
	 */
	public ArrayList<Flight> getAvailableFlightList() {
		return availableFlightList;
	}
	/**
	 * Add flight to availableFlightList
	 * @param availableFlightList add object to list
	 */
	public void setAvailableFlightList(Flight availableFlightList) {
		this.availableFlightList.add(availableFlightList);
	}
	
	
	/**
	 * Validate if the instance variables are valid
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate() {

		if (this.available == false) {
			return false;
		}
		if (this.stateTax == 0f) {
			return false;
		}
		if (this.availableFlightList == null) {
			return false;
		}

		return true;
	}
	
	
	/**
	 * Override HashCode when overriding equals method
	 * @return result - the hash value
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((availableFlightList == null) ? 0 : availableFlightList.hashCode());
		result = prime * result + Float.floatToIntBits(stateTax);
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
		AvailableFlights other = (AvailableFlights) obj;
		if (available != other.available)
			return false;
		if (availableFlightList == null) {
			if (other.availableFlightList != null)
				return false;
		} else if (!availableFlightList.equals(other.availableFlightList))
			return false;
		if (Float.floatToIntBits(stateTax) != Float.floatToIntBits(other.stateTax))
			return false;
		return true;
	}
	
	/**
	 * 
	 * @return AvailableFights information in string format
	 */
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();

		if (available) {
			stringBuffer.append("Flight is available");
			stringBuffer.append("\nState Tax: ");
			stringBuffer.append(stateTax);
			stringBuffer.append("\nAvailable Flight List: ");

			for (Flight flight : availableFlightList) {
				stringBuffer.append(flight);
			}

		} else
			stringBuffer.append("No Flight is available");

		return stringBuffer.toString();
	}

}
