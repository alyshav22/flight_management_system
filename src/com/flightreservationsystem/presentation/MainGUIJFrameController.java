package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainGUIJFrameController implements ActionListener {
	
	private MainGUIJFrameView mainGUIJFrameView;
	
	/**
	 * Default constructor
	 */
	public MainGUIJFrameController() {}

	/**
	 * Overload Constructor 
	 * @param mainGUIFrameView
	 */
	public MainGUIJFrameController(MainGUIJFrameView mainGUIFrameView) {
		this.mainGUIJFrameView = mainGUIFrameView;
		
		//Creating the required action listeners
		mainGUIJFrameView.getAdminFunctionsItem().addActionListener(this);
		mainGUIJFrameView.getExitApplication().addActionListener(this);
	};
	
	/**
	 * Overrides ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("Inside MainGUIJFrameController::actionPerformed");
		/**
		 * Listens and checks the value of each actions and 
		 * performs the correct logic based on action
		 */
		if(event.getSource().equals(mainGUIJFrameView.getAdminFunctionsItem())) {
			System.out.println("Admin Functions pressed");
			adminFunctions_actionPerformed(event);
		}else if (event.getSource().equals(mainGUIJFrameView.getExitApplication()))  {
			 System.out.println("Exit Application button Pressed!!");
			 exitApplication_actionPerformed(event);
		 }
	}
	
	/**
	 * Admin Functions to view 
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void adminFunctions_actionPerformed(ActionEvent event) {
		AdminFunctionsJFrameView adminFunctionsJFrameView = new AdminFunctionsJFrameView();
		 AdminFunctionsJFrameController adminFunctionsJFrameController = new AdminFunctionsJFrameController(adminFunctionsJFrameView);
		 mainGUIJFrameView.adminFunctionsToDesktop(adminFunctionsJFrameView);
		
	}
	
	/**
	 * Exit Application 
	 * @param event
	 */
	private void exitApplication_actionPerformed(ActionEvent event) {
	System.out.println("quiting appliction ");
	System.exit(1);
		
	}
	
}

