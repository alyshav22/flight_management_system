package com.flightreservationsystem.model.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Domain Flight class holds flightID, airlineCode, 
 * departureLocation, arrivalLocation, departureTime,
 * arrivalTime, businessFare, economyFare
 * 
 * @author Alysha
 */


public class Flight implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1345193417183314726L;

	/**
	 * holds flight ID
	 */
	private Integer flightID;
	
	/**
	 * holds airline code
	 */
	private String airlineCode;
	
	/**
	 * holds departure location
	 */
	private String departureLocation;
	
	/**
	 * holds destination location
	 */
	private String destinationLocation;
	
	/**
	 * holds departure date
	 */
	private LocalDate departureDate;
	
	/**
	 * holds departure time
	 */
	private String departureTime;
	
	/**
	 * holds arrival date
	 */
	private LocalDate arrivalDate;
	
	/**
	 * holds arrival time
	 */
	private String arrivalTime;
	
	/**
	 * holds business fare cost
	 */
	private Double businessFare;
	
	/**
	 * holds economy fare cost
	 */
	private Double economyFare;
	
	/**
	 * Holds a list of airplane scheduled for flight
	 */
	private ArrayList<Airplane> flightAirplanes;
	
	/*
	 * Default constructor
	 */
	public Flight() {
		this(9999, "airlineCode","departureLocation","destinationLocation",LocalDate.now(),
				"departureTime", LocalDate.now(),"arrivalTime",200.50,100.50);
	}

	/**
	 * Overloaded constructor for Flight
	 * 
	 * @param flightID
	 * @param airlineCode
	 * @param departureLocation
	 * @param destinationLocation
	 * @param departureDate
	 * @param departureTime
	 * @param arrivalDate
	 * @param arrivalTime
	 * @param businessFare
	 * @param economyFare
	 */
	public Flight(Integer flightID, String airlineName, String origin, String destination, LocalDate departureDate,
			String departureTime, LocalDate arrivalDate, String arrivalTime, Double businessFare, Double economyFare) {
		this.flightID = flightID;
		this.airlineCode = airlineName;
		this.departureLocation = origin;
		this.destinationLocation = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.businessFare = businessFare;
		this.economyFare = economyFare;
		this.flightAirplanes = new ArrayList<>(1);
	}

	/**
	 * @return the flightID
	 */
	public Integer getFlightID() {
		return flightID;
	}

	/**
	 * @param flightID the flightID to set
	 */
	public void setFlightID(Integer flightID) {
		this.flightID = flightID;
	}

	/**
	 * @return the airlineCode
	 */
	public String getAirlineCode() {
		return airlineCode;
	}

	/**
	 * @param airlineCode the airlineCode to set
	 */
	public void setAirlineCode(String airlineName) {
		this.airlineCode = airlineName;
	}

	/**
	 * @return the departureLocation
	 */
	public String getDepartureLocation() {
		return departureLocation;
	}

	/**
	 * @param departureLocation the departureLocation to set
	 */
	public void setDepartureLocation(String origin) {
		this.departureLocation = origin;
	}

	/**
	 * @return the destinationLocation
	 */
	public String getDestinationLocation() {
		return destinationLocation;
	}

	/**
	 * @param destinationLocation the destinationLocation to set
	 */
	public void setDestinationLocation(String destination) {
		this.destinationLocation = destination;
	}

	/**
	 * @return the departureDate
	 */
	public LocalDate getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the arrivalDate
	 */
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the businessFare
	 */
	public Double getBusinessFare() {
		return businessFare;
	}

	/**
	 * @param businessFare the businessFare to set
	 */
	public void setBusinessFare(Double businessFare) {
		this.businessFare = businessFare;
	}

	/**
	 * @return the economyFare
	 */
	public Double getEconomyFare() {
		return economyFare;
	}

	/**
	 * @param economyFare the economyFare to set
	 */
	public void setEconomyFare(Double economyFare) {
		this.economyFare = economyFare;
	}

	/**
	 * @return the flightAirplanes
	 */
	public ArrayList<Airplane> getFlightAirplanes() {
		return flightAirplanes;
	}

	/**
	 * Add a flight to List of airplane scheduled for flight
	 * @param flightAirplanes the flightAirplanes to set
	 */
	public void setFlightAirplanes(Airplane flightAirplanes) {
		this.flightAirplanes.add(flightAirplanes);
	}
	
	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate() {
		
		if( this.flightID == null ) return false;
		if( this.airlineCode == null ) return false;
		if( this.departureLocation == null ) return false;
		if( this.destinationLocation == null ) return false;
		if( this.departureDate == null ) return false;
		if( this.departureTime == null ) return false;
		if( this.arrivalDate == null ) return false;
		if( this.arrivalTime == null ) return false;
		if( this.businessFare == null ) return false;
		if( this.economyFare == null ) return false;
		if( this.flightAirplanes== null ) return false;
		
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
		result = prime * result + ((airlineCode == null) ? 0 : airlineCode.hashCode());
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((businessFare == null) ? 0 : businessFare.hashCode());
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationLocation == null) ? 0 : destinationLocation.hashCode());
		result = prime * result + ((economyFare == null) ? 0 : economyFare.hashCode());
		result = prime * result + ((flightAirplanes == null) ? 0 : flightAirplanes.hashCode());
		result = prime * result + ((flightID == null) ? 0 : flightID.hashCode());
		result = prime * result + ((departureLocation == null) ? 0 : departureLocation.hashCode());
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
		Flight other = (Flight) obj;
		if (airlineCode == null) {
			if (other.airlineCode != null)
				return false;
		} else if (!airlineCode.equals(other.airlineCode))
			return false;
		if (arrivalDate == null) {
			if (other.arrivalDate != null)
				return false;
		} else if (!arrivalDate.equals(other.arrivalDate))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (businessFare == null) {
			if (other.businessFare != null)
				return false;
		} else if (!businessFare.equals(other.businessFare))
			return false;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationLocation == null) {
			if (other.destinationLocation != null)
				return false;
		} else if (!destinationLocation.equals(other.destinationLocation))
			return false;
		if (economyFare == null) {
			if (other.economyFare != null)
				return false;
		} else if (!economyFare.equals(other.economyFare))
			return false;
		if (flightAirplanes == null) {
			if (other.flightAirplanes != null)
				return false;
		} else if (!flightAirplanes.equals(other.flightAirplanes))
			return false;
		if (flightID == null) {
			if (other.flightID != null)
				return false;
		} else if (!flightID.equals(other.flightID))
			return false;
		if (departureLocation == null) {
			if (other.departureLocation != null)
				return false;
		} else if (!departureLocation.equals(other.departureLocation))
			return false;
		return true;
	}
	/**
	 * @return Flight information in string format
	 */
	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", airlineCode=" + airlineCode + ", departureLocation=" + departureLocation + ", destinationLocation="
				+ destinationLocation + ", departureDate=" + departureDate + ", departureTime=" + departureTime
				+ ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime + ", businessFare=" + businessFare
				+ ", economyFare=" + economyFare + ", flightAirplanes=" + flightAirplanes + "]";
	}
		
} 
		
	
	
	
	
	
	
	


