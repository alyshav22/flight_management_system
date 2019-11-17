package com.flightreservationsystem.model.domain;

import java.io.Serializable;

/**
 * Domain FlightComposite class is composed of Customer, Flight, 
 * and AvailableFlights objects
 * 
 * @author alysha_velasquez
 *
 */

public class FlightComposite implements Serializable{

	
	/** 
	 * facilitates versioning of serialized data.
	 */
	private static final long serialVersionUID = 1595252257103460869L;
	private Customer customer;
	private Flight flight;
	private AvailableFlights availableFlights;
	
	/**
	 * Default constructor
	 */
	public FlightComposite() {
		
	}
	/**
	 * Override default constructor to create FlightComposite object
	 * 
	 * @param customer
	 * @param flight
	 * @param availableFlights
	 */
	public FlightComposite(Customer customer, Flight flight, AvailableFlights availableFlights) {
		this.customer = customer;
		this.flight = flight;
		this.availableFlights = availableFlights;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}
	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	/**
	 * @return the availableFlights
	 */
	public AvailableFlights getAvailableFlights() {
		return availableFlights;
	}
	/**
	 * @param availableFlights the availableFlights to set
	 */
	public void setAvailableFlights(AvailableFlights availableFlights) {
		this.availableFlights = availableFlights;
	}
	
	/**
	 * 
	 * @return FlightComposite information in string format
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlightComposite [customer=");
		builder.append(customer);
		builder.append(", flight=");
		builder.append(flight);
		builder.append(", availableFlights=");
		builder.append(availableFlights);
		builder.append("]");
		return builder.toString();
	}
	
	/**
     * Validate if the instance variables are valid
     * @return boolean - true if instance variables are valid, else false
     */
	public boolean validate() {
		if(this.customer == null) {
			return false;
		}
		if(this.flight == null) {
			return false;
		}
		if(this.availableFlights == null) {
			return false;
		}
		return true;
	}
	
	
	

	
	
	
}
