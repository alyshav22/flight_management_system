package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservationsystem.model.business.AirplaneMgr;
import com.flightreservationsystem.model.domain.Airplane;



public class SearchAirplaneJFrameController implements ActionListener{
	
	private SearchAirplaneJFrameView searchAirplaneJFrameView;
	
	/**
	 * Default Constructor 
	 */
	public SearchAirplaneJFrameController() {
		
	}
	
	/**
	 * Overloaded Constructor
	 */
	public SearchAirplaneJFrameController(SearchAirplaneJFrameView searchAirplaneJFrameView) {
		this.searchAirplaneJFrameView = searchAirplaneJFrameView;
		searchAirplaneJFrameView.getSearchAirplaneButton().addActionListener(this);
	}
	
	/**
	 * Overrides ActionListener
	 */
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println ("SearchAirplaneJFrameController::actionPerformed");
		if(event.getSource().equals(searchAirplaneJFrameView.getSearchAirplaneButton())) {
			System.out.println("Airplane Search button clicked !!");
			if((searchAirplaneJFrameView.getAirplaneIDField().getText().isEmpty()) || (searchAirplaneJFrameView.getAirplaneIDField().getText().equals("0000000000"))){
				System.out.println("Exhbit Id cannot be empty !!");
				searchAirplaneJFrameView.setAirplaneIDError("0000000000");
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Invalid Search", "Valid ID: Numerical 0-9 ");
			 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
			}else {
				airplaneSearchButton_actionPerformed(event);
			}
		}
	}

	/**
	 * Pass data to the business layer
	 * @param event
	 */
	@SuppressWarnings("unused")
	private void airplaneSearchButton_actionPerformed(ActionEvent event) {
		System.out.println ("Searching........");
		// Get an instance of the Airplane Business layer facade via the manager
		AirplaneMgr airplaneMgr = AirplaneMgr.getAirplaneMgr();
		if(airplaneMgr != null) {
			Airplane airplane = airplaneMgr.queryAirplanes(searchAirplaneJFrameView.getSearchAirplaneData());
			if (airplane == null) {
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Search Error", "Airplane not found.");
			 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
				System.out.println("Search error no Airplane found!!!");
			}else {
			 System.out.println("AirplaneFound!!!");
			 System.out.println(airplane.toString());
			 SearchAirplaneResultsJFrameView searchAirplaneResultsJFrameView = new SearchAirplaneResultsJFrameView(airplane);
		 }
			
		}else {
			 AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("System Error", "Operation Error.");
		 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
			 System.out.println(" Error-Exhibit Manager Business Facade instance is null ");
		 }

		
	};

	



	
	
}
