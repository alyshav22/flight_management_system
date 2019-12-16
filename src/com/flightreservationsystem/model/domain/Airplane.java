package com.flightreservationsystem.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Domain airplane class holds airplaneID, airplaneModel, economySeatsQuantity, businessSeatQuantity, and notes
 * @author ALYSHA
 */


public class Airplane implements Serializable{
	
	
	private static final long serialVersionUID = -4800878345040305688L;
	
	/**
	 * holds airplane ID
	 */
	private Integer airplaneID;
	/**
	 * holds airplane model
	 */
	private String airplaneModel;
	/**
	 * holds number of economy seats
	 */
	private Integer economySeatsQuantity;
	/**
	 * holds number of business seats
	 */
	private Integer businessSeatsQuantity;
	
	/**
	 * holds notes for airplane
	 */
	private String notes;
	
	/*
	 * Holds a list of flights for an airplane
	 */
	private ArrayList<Flight> flights;
	
	/**
	 * default constructor for Airplane that calls overloaded constructor with
	 * default values
	 */
	public Airplane() {
		this(99999,"airplaneModel",0,0, "notes");
	}

	
	/**
	 * Override default constructor to create Airplane object
	 * @param airplaneID
	 * @param airplaneModel
	 * @param economySeatsQuantity
	 * @param businessSeatsQuantity
	 * @param notes
	 * @param flights
	 */
	public Airplane(Integer airplaneID, String airplaneModel, Integer economySeatsQuantity,
			Integer businessSeatsQuantity, String description) {
		this.airplaneID = airplaneID;
		this.airplaneModel = airplaneModel;
		this.economySeatsQuantity = economySeatsQuantity;
		this.businessSeatsQuantity = businessSeatsQuantity;
		this.notes = description;
		this.flights = new ArrayList<>(1);
	}

	/**
	 * @return the airplaneID
	 */
	public Integer getAirplaneID() {
		return airplaneID;
	}


	/**
	 * @param airplaneID the airplaneID to set
	 */
	public void setAirplaneID(Integer airplaneID) {
		this.airplaneID = airplaneID;
	}


	/**
	 * @return the airplaneModel
	 */
	public String getAirplaneModel() {
		return airplaneModel;
	}


	/**
	 * @param airplaneModel the airplaneModel to set
	 */
	public void setAirplaneModel(String airplaneModel) {
		this.airplaneModel = airplaneModel;
	}


	/**
	 * @return the economySeatsQuantity
	 */
	public Integer getEconomySeatsQuantity() {
		return economySeatsQuantity;
	}


	/**
	 * @param economySeatsQuantity the economySeatsQuantity to set
	 */
	public void setEconomySeatsQuantity(Integer economySeatsQuantity) {
		this.economySeatsQuantity = economySeatsQuantity;
	}


	/**
	 * @return the businessSeatsQuantity
	 */
	public Integer getBusinessSeatsQuantity() {
		return businessSeatsQuantity;
	}


	/**
	 * @param businessSeatsQuantity the businessSeatsQuantity to set
	 */
	public void setBusinessSeatsQuantity(Integer businessSeatsQuantity) {
		this.businessSeatsQuantity = businessSeatsQuantity;
	}
	
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}


	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String description) {
		this.notes = description;
	}


	/**
	 * Get list of Flights
	 * @return the flights
	 */
	public ArrayList<Flight> getFlights() {
		return flights;
	}

	/**
	 * Add flight to list
	 * @param flights Add object to list
	 */
	public void setFlights(Flight flight) {
		this.flights.add(flight);
	}
	
	/**
	 * Validate if the instance variables are valid
	 * 
	 * @return boolean - true if instance variables are valid, else false
	 */
	public boolean validate() {
		
		if( this.airplaneID == null ) return false;
		if( this.airplaneModel == null ) return false;
		if( this.economySeatsQuantity == null ) return false;
		if( this.businessSeatsQuantity == null ) return false;
		if( this.notes == null ) return false;
		if( this.flights == null ) return false;
		
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneID == null) ? 0 : airplaneID.hashCode());
		result = prime * result + ((airplaneModel == null) ? 0 : airplaneModel.hashCode());
		result = prime * result + ((businessSeatsQuantity == null) ? 0 : businessSeatsQuantity.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((economySeatsQuantity == null) ? 0 : economySeatsQuantity.hashCode());
		result = prime * result + ((flights == null) ? 0 : flights.hashCode());
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
		Airplane other = (Airplane) obj;
		if (airplaneID == null) {
			if (other.airplaneID != null)
				return false;
		} else if (!airplaneID.equals(other.airplaneID))
			return false;
		if (airplaneModel == null) {
			if (other.airplaneModel != null)
				return false;
		} else if (!airplaneModel.equals(other.airplaneModel))
			return false;
		if (businessSeatsQuantity == null) {
			if (other.businessSeatsQuantity != null)
				return false;
		} else if (!businessSeatsQuantity.equals(other.businessSeatsQuantity))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (economySeatsQuantity == null) {
			if (other.economySeatsQuantity != null)
				return false;
		} else if (!economySeatsQuantity.equals(other.economySeatsQuantity))
			return false;
		if (flights == null) {
			if (other.flights != null)
				return false;
		} else if (!flights.equals(other.flights))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Airplane [airplaneID=" + airplaneID + ", airplaneModel=" + airplaneModel + ", economySeatsQuantity="
				+ economySeatsQuantity + ", businessSeatsQuantity=" + businessSeatsQuantity + ", notes="
				+ notes + ", flights=" + flights + "]";
	}

	

}
