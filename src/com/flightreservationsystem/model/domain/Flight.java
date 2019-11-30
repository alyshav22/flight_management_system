package com.flightreservationsystem.model.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * Domain Flight class holds flightID, airlineCode, 
 * airlineName,fromLocation, toLocation departureTime,
 * arrivalTime,duration, seatTotal, fareCost
 * 
 * @author alysha_velasquez
 *
 */
public class Flight implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7608672016413181978L;
	
	/**
	 * holds flight ID
	 */
	private Integer flightID;
	
	/**
	 * holds airline name
	 */
	private String airlineName;
	
	private String origin;
	
	private String destination;
	
	private LocalDate departureDate;
	
	private String departureTime;
	
	private LocalDate arrivalDate;
	
	private String arrivalTime;
	
	private Double businessFare;
	
	private Double economyFare;
	
	/**
	 * Holds a list of airplane scheduled for flight
	 */
	private ArrayList<Airplane> flightAirplanes;
	
	/*
	 * Default constructor
	 */
	public Flight() {
		this(9999, "airlineName","origin","destination",LocalDate.now(),
				"departureTime", LocalDate.now(),"arrivalTime",200.50,100.50);
	}

	/**
	 * @param flightID
	 * @param airlineName
	 * @param origin
	 * @param destination
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
		this.airlineName = airlineName;
		this.origin = origin;
		this.destination = destination;
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
	 * @return the airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * @param airlineName the airlineName to set
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
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
		if( this.airlineName == null ) return false;
		if( this.origin == null ) return false;
		if( this.destination == null ) return false;
		if( this.departureDate == null ) return false;
		if( this.departureTime == null ) return false;
		if( this.arrivalDate == null ) return false;
		if( this.arrivalTime == null ) return false;
		if( this.businessFare == null ) return false;
		if( this.economyFare == null ) return false;
		if( this.flightAirplanes== null ) return false;
		
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((businessFare == null) ? 0 : businessFare.hashCode());
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((economyFare == null) ? 0 : economyFare.hashCode());
		result = prime * result + ((flightAirplanes == null) ? 0 : flightAirplanes.hashCode());
		result = prime * result + ((flightID == null) ? 0 : flightID.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
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
		Flight other = (Flight) obj;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
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
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
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
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", airlineName=" + airlineName + ", origin=" + origin + ", destination="
				+ destination + ", departureDate=" + departureDate + ", departureTime=" + departureTime
				+ ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime + ", businessFare=" + businessFare
				+ ", economyFare=" + economyFare + ", flightAirplanes=" + flightAirplanes + "]";
	}
	
	
	
	
	
	
		
} 
		
	
	
	
	
	
	
	


