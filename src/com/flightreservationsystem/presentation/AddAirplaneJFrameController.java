package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservationsystem.model.business.AirplaneMgr;
import com.flightreservationsystem.model.domain.Airplane;

public class AddAirplaneJFrameController implements ActionListener {

	private AddAirplaneJFrameView addAirplaneJFrameView;

	/**
	 * Default constructor
	 */
	public AddAirplaneJFrameController() {

	}

	/**
	 * Overloaded Constructor
	 */
	public AddAirplaneJFrameController(AddAirplaneJFrameView addAirplaneJFrameView) {

		this.addAirplaneJFrameView = addAirplaneJFrameView;

		// Creating the required action listeners
		addAirplaneJFrameView.getAirplaneFileCloseItem().addActionListener(this);
		addAirplaneJFrameView.getCancelAirplaneButton().addActionListener(this);
		addAirplaneJFrameView.getSaveAirplaneButton().addActionListener(this);
	};

	/**
	 * Overrides ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("Inside AddAirplaneJFrameController::actionPerformed");
		// Listens and checks the value of each actions and performs the correct logic
		// based on action
		if (event.getSource().equals(addAirplaneJFrameView.getAirplaneFileCloseItem())) {
			System.out.println("Add Airplane File menu exit button clicked !!");
			airplaneFileCloseItem_actionPerformed(event);
		} else if (event.getSource().equals(addAirplaneJFrameView.getCancelAirplaneButton())) {
			System.out.println("Airplane cancel button clicked !!");
			AirplaneCancelButton_actionPerformed(event);
		} else if (event.getSource().equals(addAirplaneJFrameView.getSaveAirplaneButton())) {
			System.out.println("Airplane save button clicked !!");

			// Validate User Input before exhibitSaveButton_actionPerfomed()
			if ((addAirplaneJFrameView.getAirplaneIDField().getText().isEmpty())
					|| (addAirplaneJFrameView.getAirplaneIDField().getText().equals("123456"))) {
				System.out.println("Airplane Id cannot be empty !!");
				addAirplaneJFrameView.setAirplaneIDError("Error: Exhibit ID must be entered!");
			} else if ((addAirplaneJFrameView.getAirplaneModelField().getText().isEmpty())
					|| (addAirplaneJFrameView.getAirplaneModelField().getText().equals("Airplane Model"))) {
				System.out.println("Airplane Model cannot be empty !!");
				addAirplaneJFrameView.setAirplaneModelError("Error: Exhibit Name must be entered!");
			} else if ((addAirplaneJFrameView.getEconomyQuantityField().getText().isEmpty())) {
				System.out.println("Economy Quantity cannot be empty !!");
				addAirplaneJFrameView.setAirplaneEconomyQuantityError("Error: Economy Quantity must be entered!");
			} else if ((addAirplaneJFrameView.getBusinessQuantityField().getText().isEmpty())) {
				System.out.println("Business Quantity cannot be empty !!");
				addAirplaneJFrameView.setAirplaneBusinessQuantityError("Error: Economy Quantity must be entered!");
			} else {
				airplaneSaveButton_actionPerfomed(event);
			}

		}
	}

	@SuppressWarnings("unused")
	private void airplaneSaveButton_actionPerfomed(ActionEvent event) {

		// Creates a Airplane object based on user input from view
		Airplane airplane = addAirplaneJFrameView.getAirplaneData();

		// Get an instance of the Airplane Business layer facade via the manager
		AirplaneMgr airplaneMgr = AirplaneMgr.getAirplaneMgr();

		if (airplaneMgr != null) {
			// Test creates a artwork using manager and if passes or true alerts the correct
			// messages
			if (airplaneMgr.create(airplane)) {

				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Save Confirmation",
						"Airplane was created successfully");
				AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
						alertMessageJFrameView);
				System.out.println(" Create Airplane Success!!!");
			} else {
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Save Error",
						"Airplane was not save.");
				AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
						alertMessageJFrameView);
				System.out.println("Create Airplane Failed!!!");
			}
		} else {
			AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("System Error",
					"Operation Error.");
			AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
					alertMessageJFrameView);
			System.out.println(" Error-Exhibit Manager Business Facade instance is null ");
		}

	}

	private void AirplaneCancelButton_actionPerformed(ActionEvent event) {
		System.out.println("quiting appliction ");
		System.exit(1);

	}

	private void airplaneFileCloseItem_actionPerformed(ActionEvent event) {
		System.out.println("quiting appliction ");
		System.exit(1);

	}

}
