package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservationsystem.model.business.FlightMgr;
import com.flightreservationsystem.model.domain.Flight;

/**
 * AddFlightJFrameController - Listens and handles actions generated from Add FlightJFrameView
 * @author ALYSHA
 */


public class AddFlightJFrameController implements ActionListener {

	private AddFlightJFrameView addFlightJFrameView;

	/**
	 * Default constructor
	 * @param AddFlightJFrameController
	 */
	public AddFlightJFrameController() {

	}
	/**
	 * Overloaded Constructor
	 * 
	 * @param AddFlightJFrameView
	 */
	public AddFlightJFrameController(AddFlightJFrameView addFlightJFrameView) {
		this.addFlightJFrameView = addFlightJFrameView;

		// Creating the required action listeners
		addFlightJFrameView.getFlightFileCloseItem().addActionListener(this);
		addFlightJFrameView.getCancelFlightButton().addActionListener(this);
		addFlightJFrameView.getSaveFlightButton().addActionListener(this);

	}

	/**
	 * Override ActionListener
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		
		System.out.println("Inside AddFlightJFrameController::actionPerformed");
		// Listens and checks the value of each action and performs the correct logic based on action
		if (event.getSource().equals(addFlightJFrameView.getFlightFileCloseItem())) {
			System.out.println("Add Flight File menu exit button clicked !!");
			flightFileCloseItem_actionPerformed(event);
		} else if (event.getSource().equals(addFlightJFrameView.getCancelFlightButton())) {
			System.out.println("Flight cancel button clicked!!");
			flightCancelButton_actionPerformed(event);
		} else if (event.getSource().equals(addFlightJFrameView.getSaveFlightButton())) {
			System.out.println("Flight save button clicked!!");

			// Validate User Input before flightSaveButton_actionPerfomed()
			String datePattern = "MM/dd/yyy";

			if ((addFlightJFrameView.getFlightIDField().getText().isEmpty())
					|| (addFlightJFrameView.getFlightIDField().getText().equals("123456"))) {
				System.out.println("Flight Id cannot be empty !!");
				addFlightJFrameView.setFlightIDError("Error: Flight ID must be entered!");
			} else if (addFlightJFrameView.getAirlineCodeField().getText().isEmpty()) {
				System.out.println("Airline Name cannot be empty !!");
				addFlightJFrameView.setAirlineCodeError("Error: Airline Name must be entered!");
			} else if (addFlightJFrameView.getDepartureLocationField().getText().isEmpty()) {
				System.out.println("Flight Origin cannot be empty !!");
				addFlightJFrameView.setDepartureLocationError("Error: Airline Name must be entered!");
			} else if (addFlightJFrameView.getDestinationLocationField().getText().isEmpty()) {
				System.out.println("Flight Destination cannot be empty !!");
				addFlightJFrameView.setDestinationLocationError("Error: Airline Name must be entered!");
			} else if (addFlightJFrameView.getDepartureDateField().getText().equals(datePattern)) {
				System.out.println("Departure date must be the following pattern MM/dd/yyyy!!");
				addFlightJFrameView.setDepartureDateError();
			} else if (addFlightJFrameView.getDepartureDateField().getText().isEmpty()) {
				System.out.println("Departure date must be the following pattern MM/dd/yyyy!!");
				addFlightJFrameView.setDepartureDateError("MM/dd/yyyy");
			} else if (addFlightJFrameView.getDepartureTimeField().getText().isEmpty()) {
				System.out.println("Flight Departure Time cannot be empty !!");
				addFlightJFrameView.setDepartureTimeError("Error: Flight Time must be entered!");
			} else if (addFlightJFrameView.getArrivalDateField().getText().equals(datePattern)) {
				System.out.println("Departure date must be the following pattern MM/dd/yyyy!!");
				addFlightJFrameView.setArrivalDateError();
			} else if (addFlightJFrameView.getArrivalDateField().getText().isEmpty()) {
				System.out.println("Arrival date must be the following pattern MM/dd/yyyy!!");
				addFlightJFrameView.setArrivalDateError("MM/dd/yyyy");
			} else if (addFlightJFrameView.getArrivalTimeField().getText().isEmpty()) {
				System.out.println("Flight Arrival Time cannot be empty !!");
				addFlightJFrameView.setArrivalTimeError("Error: Flight Time must be entered!");
			} else if (addFlightJFrameView.getBusinessFareField().getText().isEmpty()) {
				addFlightJFrameView.setBusinessFareError("0.00");
			} else if (addFlightJFrameView.getEconomyFareField().getText().isEmpty()) {
				addFlightJFrameView.setEconomyFareError("0.00");
			} else {
				flightSaveButton_actionPerformed(event);
			}
		}
	}

	@SuppressWarnings("unused")
	public void flightSaveButton_actionPerformed(ActionEvent event) {
		
		// Creates a Flight object based on user input view
		Flight flight = addFlightJFrameView.getFlightData();
		// Get an instance of the Flight Business Layer facade via the manager
		FlightMgr flightMgr = FlightMgr.getFlightMgr();

		if (flightMgr != null) {
			// Test creates a flight using manager and if passes or true alerts the correct messages
			if (flightMgr.create(flight)) {

				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Save Confirmation",
						"Flight was created successfully");
				AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
						alertMessageJFrameView);
				System.out.println(" Create Flight Success!!!");
			} else {
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Save Error",
						"Museum was not save.");
				AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
						alertMessageJFrameView);
				System.out.println("Create Flight Failed!!!");
			}
		} else {
			AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("System Error",
					"Operation Error.");
			AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
					alertMessageJFrameView);
			System.out.println(" Error-Flight Manager Business Facade instance is null ");
		}
	}

	/**
	 * Close window component and exit application
	 * @param event
	 */
	private void flightCancelButton_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(1);
	}

	/**
	 * Close window component and exit application
	 * @param event
	 */
	private void flightFileCloseItem_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(1);

	};

}// End
