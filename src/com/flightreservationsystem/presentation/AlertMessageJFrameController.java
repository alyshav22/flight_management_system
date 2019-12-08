package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * AlertMessageJFrameController
 * Listens and handles actions generated from AlertMessageJFrameController
 * 
 * @author Alysha 
 */

public class AlertMessageJFrameController implements ActionListener{
	
	private AlertMessageJFrameView alertMessageJFrameView;
	
	/**
	 * Default Constructor
	 */
	public  AlertMessageJFrameController() {}
	
	

	/**
	 * Overloaded Constructor Constructor
	 */
	public  AlertMessageJFrameController(AlertMessageJFrameView alertMessageJFrameView ) {
		this.alertMessageJFrameView = alertMessageJFrameView;
		
		// Creating the required action listeners
		alertMessageJFrameView.getConfirmButton().addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent event) {
		 System.out.println ("Inside AlertMessageJFrameController::actionPerformed");
		// Listens and checks the value of each actions and performs the correct logic based on action
		 if (event.getSource().equals(alertMessageJFrameView.getConfirmButton())) {
			 System.out.println("quiting appliction ");
			System.exit(1);
			
			
		 }
		
	}


}
