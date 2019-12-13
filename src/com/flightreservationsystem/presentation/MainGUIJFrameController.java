package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Controller
 * Listens and handles actions generated from MainGUIJFrameView
 * 
 *
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
		mainGUIJFrameView.getSearchFlight().addActionListener(this);	
	};
	/**
	 * Overrides the action listener
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
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
		 } else if (event.getSource().equals(mainGUIJFrameView.getSearchFlight())) {
			 System.out.println("Search Flight button Pressed!!");
			 searchFlight_actionPerformed(event);
		 } 
	}

	/**
	 * Search for Exhibit action to load new search window
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void searchFlight_actionPerformed(ActionEvent event) {
		// TODO Implement Search View and controller
		System.out.println("Opening Flight Search Frame!!");
		SearchFlightJFrameView searchFlightJFrameView = new SearchFlightJFrameView();
		SearchFlightJFrameController searchFlightJFrameController = new SearchFlightJFrameController(searchFlightJFrameView);
		mainGUIJFrameView.addToDesktop(searchFlightJFrameView);
	}

	@SuppressWarnings("unused")
	private void addFlight_actionPerformed(ActionEvent event) {
		System.out.println("Opening Flight Add Frame!!");
		AddFlightJFrameView addFlightJFrameView = new AddFlightJFrameView();
		AddFlightJFrameController addFlightJFrameController = new AddFlightJFrameController(addFlightJFrameView);
		mainGUIJFrameView.addFlightToDesktop(addFlightJFrameView);
	}

	private void exitApplication_actionPerformed(ActionEvent event) {
		System.out.println("quitting application");
		System.exit(1);
	}

	@SuppressWarnings("unused")
	private void login_actionPerformed(ActionEvent event) {
		System.out.println("Opening Login Frame!!");
		LoginFormJFrameView loginFormJFrameView = new LoginFormJFrameView();
		LoginFormJFrameController loginFormJFrameController = new LoginFormJFrameController(loginFormJFrameView);
		mainGUIJFrameView.addLoginToDesktop(loginFormJFrameView);
		
	}

	@SuppressWarnings("unused")
	private void register_actionPerformed(ActionEvent event) {
		System.out.println("Opening Register Frame!!");
		RegisterUserJFrameView registerUserJFrameView = new RegisterUserJFrameView();
		RegisterUserJFrameController registerUserJFrameController = new RegisterUserJFrameController(registerUserJFrameView);
		mainGUIJFrameView.addRegisterUserToDesktop(registerUserJFrameView);
		
	}
	
	
	
}

