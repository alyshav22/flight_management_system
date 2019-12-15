package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Controller
 * Listens and handles actions generated from MainGUIJFrameView
 * 
 * @author ALYSHA
 */

public class MainGUIJFrameController implements ActionListener {
	
	private MainGUIJFrameView mainGUIJFrameView;
	
	/**
	 * Default constructor
	 */
	public MainGUIJFrameController() {}
	
	/**
	 * Overloaded Constructor
	 * @param
	 */
	public MainGUIJFrameController(MainGUIJFrameView mainGUIJFrameView) {
		this.mainGUIJFrameView = mainGUIJFrameView;
		
		//Creating the required action listeners
		mainGUIJFrameView.getRegister().addActionListener(this);
		mainGUIJFrameView.getLogin().addActionListener(this);
		mainGUIJFrameView.getExitApplication().addActionListener(this);
		mainGUIJFrameView.getAddFlight().addActionListener(this);
		mainGUIJFrameView.getAddAirplane().addActionListener(this);
		mainGUIJFrameView.getSearchFlight().addActionListener(this);
		mainGUIJFrameView.getSearchAirplane().addActionListener(this);
		
	};
	/**
	 * Overrides the action listener
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		
		 System.out.println ("Inside MainGUIJFrameController::actionPerformed");
		// Listens and checks the value of each actions and performs the correct logic based on action
		 
		 if(event.getSource().equals(mainGUIJFrameView.getRegister())) {
			 System.out.println("Register Button Pressed!");
			 register_actionPerformed(event);
		 } else if (event.getSource().equals(mainGUIJFrameView.getLogin()))  {
			 System.out.println("Login button Pressed!!");
			 login_actionPerformed(event);
		 }else if (event.getSource().equals(mainGUIJFrameView.getExitApplication())) {
			 System.out.println("Exit Application button Pressed!!");
			 exitApplication_actionPerformed(event);
		 }else if (event.getSource().equals(mainGUIJFrameView.getAddFlight())) {
			 System.out.println("Add Flight button Pressed!!");
			 addFlight_actionPerformed(event);
		 } else if (event.getSource().equals(mainGUIJFrameView.getAddAirplane())) {
			 System.out.println("Add Airplane button Pressed!!");
			 addAirplane_actionPerformed(event);
		 } else if (event.getSource().equals(mainGUIJFrameView.getSearchFlight())) {
			 System.out.println("Search Flight button Pressed!!");
			 searchFlight_actionPerformed(event);
		 } else if (event.getSource().equals(mainGUIJFrameView.getSearchAirplane())) {
			 System.out.println("Search Airplane button Pressed!!");
			 searchAirplane_actionPerformed(event);
		 }
	}

	/**
	 * Search for Flight action to load new search window
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void searchFlight_actionPerformed(ActionEvent event) {
		System.out.println("Opening Flight Search Frame!!");
		SearchFlightJFrameView searchFlightJFrameView = new SearchFlightJFrameView();
		SearchFlightJFrameController searchFlightJFrameController = new SearchFlightJFrameController(searchFlightJFrameView);
		mainGUIJFrameView.addToDesktop(searchFlightJFrameView);
	}
	
	/**
	 * Search for Airplane action to load new search window
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void searchAirplane_actionPerformed(ActionEvent event) {
		SearchAirplaneJFrameView searchAirplaneJFrameView = new SearchAirplaneJFrameView();
		SearchAirplaneJFrameController searchAirplaneJFrameController = new SearchAirplaneJFrameController(searchAirplaneJFrameView);
		mainGUIJFrameView.searchAirplaneToDesktop(searchAirplaneJFrameView);
	}
	
	/**
	 * Add Flight action to load new add window
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void addFlight_actionPerformed(ActionEvent event) {
		System.out.println("Opening Flight Add Frame!!");
		AddFlightJFrameView addFlightJFrameView = new AddFlightJFrameView();
		AddFlightJFrameController addFlightJFrameController = new AddFlightJFrameController(addFlightJFrameView);
		mainGUIJFrameView.addFlightToDesktop(addFlightJFrameView);
	}
	/**
	 * Add Airplane action to load new add window
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void addAirplane_actionPerformed(ActionEvent event) {
		System.out.println("Opening Flight Add Frame!!");
		AddAirplaneJFrameView addAirplaneJFrameView = new AddAirplaneJFrameView();
		AddAirplaneJFrameController addAirplaneJFrameController = new AddAirplaneJFrameController(addAirplaneJFrameView);
		mainGUIJFrameView.addAirplaneToDesktop(addAirplaneJFrameView);
	}
	/**
	 * Exit Application
	 * @param event
	 */
	private void exitApplication_actionPerformed(ActionEvent event) {
		System.out.println("quitting application");
		System.exit(1);
	}
	/**
	 * Login action to load new login window
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void login_actionPerformed(ActionEvent event) {
		System.out.println("Opening Login Frame!!");
		LoginFormJFrameView loginFormJFrameView = new LoginFormJFrameView();
		LoginFormJFrameController loginFormJFrameController = new LoginFormJFrameController(loginFormJFrameView);
		mainGUIJFrameView.addLoginToDesktop(loginFormJFrameView);
		
	}
	/**
	 * Register action to load new register window
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void register_actionPerformed(ActionEvent event) {
		System.out.println("Opening Register Frame!!");
		RegisterUserJFrameView registerUserJFrameView = new RegisterUserJFrameView();
		RegisterUserJFrameController registerUserJFrameController = new RegisterUserJFrameController(registerUserJFrameView);
		mainGUIJFrameView.addRegisterUserToDesktop(registerUserJFrameView);
		
	}
	
	
	
}

