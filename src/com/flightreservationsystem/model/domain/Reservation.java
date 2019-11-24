package com.flightreservationsystem.model.domain;

import java.io.Serializable;

public class Reservation implements Serializable{
	
	/**
	 * facilitates versioning of serialized data.
	 */
	private static final long serialVersionUID = -1802374658501105064L;

	private Customer customer;
	private Flight flight;

	
	/**
	 * Default constructor
	 */
	public Reservation() {
		this(new Customer(), new Flight());
	}
	
	/**
	 * Override default constructor to create FlightComposite object
	 * 
	 * @param customer
	 * @param flight
	 * @param availableFlights
	 */
	public Reservation(Customer customer, Flight flight) {
		this.customer = customer;
		this.flight = flight;
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
		return true;
	}
	
	/**
	 * 
	 * @return Reservation information in string format
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [customer=");
		builder.append(customer);
		builder.append(", flight=");
		builder.append(flight);
		builder.append("]");
		return builder.toString();
	}
	

}
