package com.flightreservationsystem.presentation;

import javax.swing.UIManager;


public class MainDriver {
	
	/**
	 * Creates The first object of the application and Instantiates the Main  view
	 */
	public MainDriver() {
		
		 try {
	         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	       }
	       catch (Exception e) {
	         e.printStackTrace();
	       }
		 
		 
		 /**
		  * Create view class 
		  */
		 HomeJFrameView homeJFrameView = new HomeJFrameView();
		 
		 
		 /**
		  * Create controller and the view 
		  */
		 @SuppressWarnings("unused")
		HomeJFrameController homeJFrameController = new HomeJFrameController(homeJFrameView);
		
	}
	
	
	/**
	 * The main method which is the starting point of entire application 
	 * @param args
	 */
	public static void main(String[] args) {
		   new MainDriver();
		 }

}
