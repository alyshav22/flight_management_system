package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservationsystem.model.business.FlightMgr;
import com.flightreservationsystem.model.domain.Flight;

public class SearchFlightJFrameController implements ActionListener{
	
private SearchFlightJFrameView searchFlightJFrameView;
	
	/**
	 * Default constructor
	 */
	public SearchFlightJFrameController() {
		
	}

	/**
	 * Overloaded Constructor
	 * @param 
	 */
	public SearchFlightJFrameController(SearchFlightJFrameView searchFlightJFrameView) {
		this.searchFlightJFrameView = searchFlightJFrameView;
		//Creating the required action listeners
		searchFlightJFrameView.getSearchFlightButton().addActionListener(this);
	}

	/**
	 * Overrides ActionListener
	 */
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println ("SearchFlightJFrameController:: actionPerformed");
		
		if(event.getSource().equals(searchFlightJFrameView.getSearchFlightButton())) {
			System.out.println("Flight Search button clicked");
			if((searchFlightJFrameView.getFlightIDField().getText().isEmpty()) || (searchFlightJFrameView.getFlightIDField().getText().equals("0000000000"))){
				System.out.println("Flight Id cannot be empty !!");
				searchFlightJFrameView.setFlightIDError("0000000000");
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Invalid Search", "Valid ID: Numerical 0-9 ");
			 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
			}else {
				flightSearchButton_actionPerformed(event);
			}
		}
		
	}
	
	
	/**
	 * Pass search data to the business layer
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void flightSearchButton_actionPerformed(ActionEvent event) {
		System.out.println ("Searching........");
		
		// Get an instance of the Flight Business layer facade via the manager
		FlightMgr flightMgr = FlightMgr.getFlightMgr();
		
		if(flightMgr != null) {
			Flight flight = flightMgr.queryFlights(searchFlightJFrameView.getSearchFlightData());
			if (flight == null) {
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Search Error", "Flight not found.");
			 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
				System.out.println("Search error no Flight found!!!");
			}else {
			 System.out.println("FlightFound!!!");
			 System.out.println(flight.toString());
			 SearchFlightResultsJFrameView searchFlightResultsJFrameView = new SearchFlightResultsJFrameView(flight);
		 }
			
		}else {
			 AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("System Error", "Operation Error.");
		 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
			 System.out.println(" Error-Exhibit Manager Business Facade instance is null ");
		 }
	
		};

}
