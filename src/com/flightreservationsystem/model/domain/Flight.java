package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain Flight class holds flightNumber, airlineCode, 
 * airlineName,fromLocation, toLocation departureTime,
 * arrivalTime,duration, seatTotal, fareCost
 * 
 * @author alysha_velasquez
 *
 */
public class Flight implements Serializable{
	
	/** 
	 * facilitates versioning of serialized data.
	 */
	private static final long serialVersionUID = 6293159108851298310L;
	
	
	/** 
	 * holds unique flight number
	 */
	private int flightNumber;
	/** 
	 * holds unique two letter airline code
	 */
	private String airlineCode;
	/** 
	 * holds the name of the airline
	 */
	private String airlineName;
	/** 
	 * holds 3 letter airport code for departure airport location
	 */
	private String fromLocation;
	/** 
	 * holds 3 letter airport code for destination airport location
	 */
	private String toLocation;
	/** 
	 * holds departure time and date
	 */
	private String departureTime;
	/** 
	 * holds arrival time and date
	 */
	private String arrivalTime;
	/** 
	 * holds duration in minutes
	 */
	private float duration;
	/**
	 * holds total seats in a flight
	 */
	private int seatTotal;
	/**
	 * holds cost of flight fare
	 */
	private double fareCost;
	
	
	/** 
	 * default constructor for Flight
	 */
	public Flight() {}
	
	/**
	 * Override default constructor to create Flight object
	 *  
	 * @param flightNumber
	 * @param airlineCode
	 * @param airlineName
	 * @param fromLocation
	 * @param toLocation
	 * @param departureTime
	 * @param arrivalTime
	 * @param duration
	 * @param seatTotal
	 * @param fareCost
	 */
	public Flight(int flightId, String airlineId, String airlineName, String fromLocation, String toLocation,
			String departureTime, String arrivalTime, float duration, int seatTotal, double fareCost) {
		this.flightNumber = flightId;
		this.airlineCode = airlineId;
		this.airlineName = airlineName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.seatTotal = seatTotal;
		this.fareCost = fareCost;
	}

	
	/**
	 * Get flight number
	 * @return the flightNumber
	 */
	public int getFlightNumber() {
		return flightNumber;
	}
	/**
	 * Set flight number
	 * @param flightNumber to set flightNumber
	 */
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * Get airline code
	 * @return the airlineCode
	 */
	public String getAirlineCode() {
		return airlineCode;
	}
	/**
	 * Set airline code
	 * @param airlineCode to set airlineCode
	 */
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	/**
	 * Get name of airline
	 * @return the airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * Set name of airline
	 * @param airlineName the airlineName to set
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	/**
	 * Get flight origin location
	 * @return the fromLocation
	 */
	public String getFromLocation() {
		return fromLocation;
	}

	/**
	 * Set flight origin location
	 * @param fromLocation to set fromLocation
	 */
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	/**
	 * Get destination location
	 * @return the toLocation
	 */
	public String getToLocation() {
		return toLocation;
	}

	/**
	 * Set destination location
	 * @param toLocation to set toLocation
	 */
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	/**
	 * Get departure time
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * Set departure time
	 * @param departureTime to set departureTime 
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * Get arrival time
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * Set arrival time
	 * @param arrivalTime to set arrivalTime 
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * Get flight trip duration time
	 * @return the duration
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * Set flight trip duration time
	 * @param duration to set duration
	 */
	public void setDuration(float duration) {
		this.duration = duration;
	}

	/**
	 * Get flight seat total
	 * @return the seatTotal
	 */
	public int getSeatTotal() {
		return seatTotal;
	}

	/**
	 * Set flight seat total
	 * @param seatTotal to set seatTotal
	 */
	public void setSeatTotal(int seatTotal) {
		this.seatTotal = seatTotal;
	}

	/**
	 * Get the cost of flight
	 * @return the fareCost
	 */
	public double getFareCost() {
		return fareCost;
	}

	/**
	 * Set the cost of flight
	 * @param fareCost the fareCost to set
	 */
	public void setFareCost(double fareCost) {
		this.fareCost = fareCost;
	}

	/**
	 * Override HashCode when overriding equals method
	 * @return result is the hash value
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineCode == null) ? 0 : airlineCode.hashCode());
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + Float.floatToIntBits(duration);
		long temp;
		temp = Double.doubleToLongBits(fareCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + flightNumber;
		result = prime * result + ((fromLocation == null) ? 0 : fromLocation.hashCode());
		result = prime * result + seatTotal;
		result = prime * result + ((toLocation == null) ? 0 : toLocation.hashCode());
		return result;
	}
	
	/**
     * Overriding default equals method from Object Class
     * @param obj is inherited from Object
     * @return boolean - False if any of the test fail equality default return
     * true
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (airlineCode == null) {
			if (other.airlineCode != null)
				return false;
		} else if (!airlineCode.equals(other.airlineCode))
			return false;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (Float.floatToIntBits(duration) != Float.floatToIntBits(other.duration))
			return false;
		if (Double.doubleToLongBits(fareCost) != Double.doubleToLongBits(other.fareCost))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (fromLocation == null) {
			if (other.fromLocation != null)
				return false;
		} else if (!fromLocation.equals(other.fromLocation))
			return false;
		if (seatTotal != other.seatTotal)
			return false;
		if (toLocation == null) {
			if (other.toLocation != null)
				return false;
		} else if (!toLocation.equals(other.toLocation))
			return false;
		return true;
	}

	/**
     * Validate if the instance variables are valid
     * @return boolean - true if instance variables are valid, else false
     */
    public boolean validate() {

        if (this.flightNumber == 0) {
            return false;
        }
        if (this.airlineCode == null) {
            return false;
        }
        if (this.airlineName == null) {
            return false;
        }
        if (this.fromLocation == null) {
            return false;
        }
        if (this.toLocation == null) {
            return false;
        }
        if (this.departureTime == null) {
            return false;
        }
        if (this.arrivalTime == null) {
            return false;
        }
        if (this.duration == 0f) {
            return false;
        }
        if (this.seatTotal == 0) {
            return false;
        }
        if (this.fareCost == 0) {
            return false;
        }

        return true;
    }
    
    /**
     * 
     * @return Flight information in string format
     */

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flight [flightNumber=");
		builder.append(flightNumber);
		builder.append(", airlineCode=");
		builder.append(airlineCode);
		builder.append(", airlineName=");
		builder.append(airlineName);
		builder.append(", fromLocation=");
		builder.append(fromLocation);
		builder.append(", toLocation=");
		builder.append(toLocation);
		builder.append(", departureTime=");
		builder.append(departureTime);
		builder.append(", arrivalTime=");
		builder.append(arrivalTime);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", seatTotal=");
		builder.append(seatTotal);
		builder.append(", fareCost=");
		builder.append(fareCost);
		builder.append("]");
		return builder.toString();
	}
		
} 
		
	
	
	
	
	
	
	


