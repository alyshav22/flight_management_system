package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller - Listens and handles actions generated from
 * AdminFunctionsJFrameView
 * 
 * @author Alysha 
 */

public class HomeJFrameController implements ActionListener {

	private HomeJFrameView homeJFrameView;

	/**
	 * Default Constructor
	 */
	public HomeJFrameController() {

	}

	/**
	 * Overloaded Constructor
	 * 
	 * @param homeJFrameView
	 */
	public HomeJFrameController(HomeJFrameView homeJFrameView) {
		this.homeJFrameView = homeJFrameView;

		// Creating the required action listeners
		homeJFrameView.getAddButton().addActionListener(this);
		homeJFrameView.getSearchButton().addActionListener(this);
		homeJFrameView.getRegisterButton().addActionListener(this);
		homeJFrameView.getLoginButton().addActionListener(this);
		homeJFrameView.getFileCloseItem().addActionListener(this);

	}

	/**
	 * Overrides ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		System.out.println("Inside HomeJFrameController::actionPerformed");
		/**
		 * Listens and checks the value of each actions and performs the correct logic
		 * based on action
		 */
		if (event.getSource().equals(homeJFrameView.getAddButton())) {
			System.out.println("Add Flight Button pressed");
			addFlight_actionPerformed(event);
		} else if (event.getSource().equals(homeJFrameView.getSearchButton())) {
			System.out.println("SearchFlight Button Pressed!!");
			searchFlight_actionPerformed(event);
		} else if (event.getSource().equals(homeJFrameView.getRegisterButton())) {
			System.out.println("Register User Button pressed");
			registerUser_actionPerformed(event);
		} else if (event.getSource().equals(homeJFrameView.getLoginButton())) {
			System.out.println("Login  Button pressed");
			login_actionPerformed(event);
		}

		else if (event.getSource().equals(homeJFrameView.getFileCloseItem())) {
			System.out.println("File menu exit button clicked !!");
			fileCloseItem_actionPerformed(event);
		}
	}

	/**
	 * Create View and Controller class for addFlightJFrame &
	 * addFlightJFrameController
	 * 
	 * @param event
	 */
	private void addFlight_actionPerformed(ActionEvent event) {
		/**
		 * Create view class
		 */
		AddFlightJFrameView addFlightJFrameView = new AddFlightJFrameView();

		/**
		 * Create controller and the view
		 */
		@SuppressWarnings("unused")
		AddFlightJFrameController addFlightJFrameController = new AddFlightJFrameController(addFlightJFrameView);

	}

	/**
	 * Create View and Controller class for searchFlightJFrame &
	 * searchFlightJFrameController
	 * 
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void searchFlight_actionPerformed(ActionEvent event) {
		/**
		 * Create view class
		 */
		SearchFlightJFrameView searchFlightJFrameView = new SearchFlightJFrameView();
		/**
		 * Create controller and the view
		 */
		SearchFlightJFrameController searchFlightJFrameController = new SearchFlightJFrameController(
				searchFlightJFrameView);

	}

	/**
	 * Create View and Controller class for RegisterUser & RegisterUser controller
	 * 
	 * @param event
	 */
	private void registerUser_actionPerformed(ActionEvent event) {
		RegisterUserJFrameView registerUserJFrameView = new RegisterUserJFrameView();

		@SuppressWarnings("unused")
		RegisterUserJFrameController registerUserJFrameController = new RegisterUserJFrameController(
				registerUserJFrameView);

	}

	/**
	 * Create View and Controller class for Login & Login controller
	 * 
	 * @param event
	 */
	private void login_actionPerformed(ActionEvent event) {
		LoginFormJFrameView loginFormJFrameView = new LoginFormJFrameView();

		@SuppressWarnings("unused")
		LoginFormJFrameController loginFormJFrameController = new LoginFormJFrameController(loginFormJFrameView);
	}

	/**
	 * Close window component and exit application
	 * 
	 * @param event
	 */
	private void fileCloseItem_actionPerformed(ActionEvent event) {
		System.out.println("quiting appliction ");
		System.exit(0);
	}

}
