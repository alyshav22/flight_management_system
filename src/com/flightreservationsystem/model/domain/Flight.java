package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain Flight class holds flightID, airlineCode, 
 * airlineName,fromLocation, toLocation departureTime,
 * arrivalTime,duration, economySeats, businessSeats, fareCost
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
	private int flightID;
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
	 * holds total economy seats in a flight
	 */
	private int economySeats;
	
	/**
	 * holds total business seats in a fight
	 */
	private int businessSeats;
	
	/**
	 * holds cost of flight fare
	 */
	private double fareCost;
	
	
	/** 
	 * default constructor for Flight
	 */
	public Flight() {
		this(999, "Code","Name","Origin","Location","time1","time2",0.00f,10,20,0.00);
	}
	
	/**
	 * @param flightID
	 * @param airlineCode
	 * @param airlineName
	 * @param fromLocation
	 * @param toLocation
	 * @param departureTime
	 * @param arrivalTime
	 * @param duration
	 * @param economySeats
	 * @param businessSeats
	 * @param fareCost
	 */
	public Flight(int flightID, String airlineCode, String airlineName, String fromLocation, String toLocation,
			String departureTime, String arrivalTime, float duration, int economySeats, int businessSeats,
			double fareCost) {
		this.flightID = flightID;
		this.airlineCode = airlineCode;
		this.airlineName = airlineName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.economySeats = economySeats;
		this.businessSeats = businessSeats;
		this.fareCost = fareCost;
	}
	/**
	 * Get flight number
	 * @return the flightID
	 */
	public int getFlightID() {
		return flightID;
	}
	/**
	 * Set flight number
	 * @param flightID to set flightID
	 */
	public void setFlightID(int flightNumber) {
		this.flightID = flightNumber;
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
	 * @return the economySeats
	 */
	public int getEconomySeats() {
		return economySeats;
	}

	/**
	 * @param economySeats the economySeats to set
	 */
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}

	/**
	 * @return the businessSeats
	 */
	public int getBusinessSeats() {
		return businessSeats;
	}

	/**
	 * @param businessSeats the businessSeats to set
	 */
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	/**
     * Validate if the instance variables are valid
     * @return boolean - true if instance variables are valid, else false
     */
    public boolean validate() {

        if (this.flightID == 0) {
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
        if (this.economySeats == 0) {
            return false;
        }
        if (this.businessSeats == 0) {
            return false;
        }
        if (this.fareCost == 0) {
            return false;
        }

        return true;
    }
    
   
		
} 
		
	
	
	
	
	
	
	


