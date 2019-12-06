package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservationsystem.model.business.FlightMgr;
import com.flightreservationsystem.model.domain.Flight;

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
	 * @param addFlightJFrameView
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
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("Inside AddFlightJFrameController::actionPerformed");
		// Listens and checks the value of each action and performs the correct logic
		// based on action
		if (event.getSource().equals(addFlightJFrameView.getFlightFileCloseItem())) {
			System.out.println("Add Flight File menu exit button clicked !!");
			flightFileCloseItem_actionPerformed(event);
		} else if (event.getSource().equals(addFlightJFrameView.getCancelFlightButton())) {
			System.out.println("Flight cancel button clicked !!");
			flightCancelButton_actionPerformed(event);
		} else if (event.getSource().equals(addFlightJFrameView.getSaveFlightButton())) {
			System.out.println("Flight save button clicked !!");
		

		// Validate User Input before flightSaveButton_actionPerfomed()
		if ((addFlightJFrameView.getFlightIDField().getText().isEmpty())
				|| (addFlightJFrameView.getFlightIDField().getText().equals("123456"))) {
			System.out.println("Flight Id cannot be empty !!");
			addFlightJFrameView.setFlightIDError("Error: Flight ID must be entered!");
		} else if ((addFlightJFrameView.getAirlineNameField().getText().isEmpty())
				|| (addFlightJFrameView.getAirlineNameField().getText().equals("Airline Name"))) {
			System.out.println("Airline Name cannot be empty !!");
			addFlightJFrameView.setAirlineNameError("Error: Airline Name must be entered!");
		} else {
			flightSaveButton_actionPerformed(event);
		}
		}
	}

	public void flightSaveButton_actionPerformed(ActionEvent event) {
		// Creates a Flight object based on user input view
		Flight flight = addFlightJFrameView.getFlightData();

		// Get an instance of the Exhibit Business Layer facade via the manager
		FlightMgr flightMgr = FlightMgr.getFlightMgr();

		if (flightMgr != null) {
			// Test creates a flight using manager and if passes or true alerts the correct
			// messages
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
	 * 
	 * @param event
	 */
	private void flightCancelButton_actionPerformed(ActionEvent event) {
		// TODO: Refactor to do something else
		System.out.println("quitting application ");
		System.exit(1);

	}

	/**
	 * Close window component and exit application
	 * 
	 * @param event
	 */
	private void flightFileCloseItem_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(1);

	};

}// End
