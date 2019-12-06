package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.flightreservationsystem.model.domain.Flight;

public class SearchFlightResultsJFrameView extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Flight flight;
	private JFrame flightResultsFrame;
	private JPanel flightResultsPanel;
	private JLabel flightIDResultsLabel, airlineNameLabel, flightOriginLabel, flightDestinationLabel,
			departureDateLabel, flightDepartureTimeLabel, flightArrivalDateLabel, flightArrivalTimeLabel,
			flightBusinessFareLabel, flightEconomyFareLabel;

	/**
	 * Default constructor that calls method to create GUI components and render to
	 * screen
	 */
	public SearchFlightResultsJFrameView(Flight flight) {
		this.flight = flight;
		createGUIComponents();
		flightResultsFrame.setSize(1366, 868);
		flightResultsFrame.setVisible(true);
	}
	
	/**
	 * Create all the required components of the Search Flight page
	 */
	private void createGUIComponents() {
		flightResultsFrame = new JFrame("Flight Search Results");
		FlowLayout layout = new FlowLayout();
		flightResultsPanel = new JPanel(layout);
		
		flightResultsPanel.setBackground(new java.awt.Color(48, 48, 48));
		flightResultsPanel.setFont(new java.awt.Font("Arial", 1, 11));
		flightResultsPanel.setLayout(null);
		
		flightIDResultsLabel = new JLabel();
		flightIDResultsLabel.setText("Flight ID: "+ Integer.toString(flight.getFlightID()));
		flightIDResultsLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightIDResultsLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightIDResultsLabel.setBounds(40, 80, 360, 17);
		flightResultsPanel.add(flightIDResultsLabel);
		
		airlineNameLabel = new JLabel();
		airlineNameLabel.setText("Flight Name: "+ flight.getAirlineName());
		airlineNameLabel.setFont(new java.awt.Font("Arial", 1, 14));
		airlineNameLabel.setForeground(new java.awt.Color(255, 255, 255));
		airlineNameLabel.setBounds(40, 160, 360, 17);
		flightResultsPanel.add(airlineNameLabel);
		
		flightOriginLabel = new JLabel();
		flightOriginLabel.setText("Flight Origin: "+ flight.getOrigin());
		flightOriginLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightOriginLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightOriginLabel.setBounds(40, 160, 360, 17);
		flightResultsPanel.add(flightOriginLabel);
		
		flightDestinationLabel = new JLabel();
		flightDestinationLabel.setText("Flight Destination: "+ flight.getDestination());
		flightDestinationLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightDestinationLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightDestinationLabel.setBounds(40, 240, 360, 17);
		flightResultsPanel.add(flightDestinationLabel);
		
		LocalDate localDate = flight.getDepartureDate();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedString = localDate.format(formatter);
		
		departureDateLabel = new JLabel();
		departureDateLabel.setText("Departure Date:" + formattedString);
		departureDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureDateLabel.setBounds(40, 320, 360, 17);
		flightResultsPanel.add(departureDateLabel);
		
		flightDepartureTimeLabel = new JLabel();
		flightDepartureTimeLabel.setText("Flight Departure Time: "+ flight.getDepartureTime());
		flightDepartureTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightDepartureTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightDepartureTimeLabel.setBounds(40, 400, 360, 17);
		flightResultsPanel.add(flightDepartureTimeLabel);
		
		LocalDate localDateArrival = flight.getArrivalDate();
		DateTimeFormatter formatterArrival = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedStringArrival = localDateArrival.format(formatterArrival);
		
		flightArrivalDateLabel = new JLabel();
		flightArrivalDateLabel.setText("Arrival Date:" + formattedStringArrival);
		flightArrivalDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightArrivalDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightArrivalDateLabel.setBounds(40, 480, 360, 17);
		flightResultsPanel.add(flightArrivalDateLabel);
		
		flightArrivalTimeLabel = new JLabel();
		flightArrivalTimeLabel.setText("Flight Arrival Time: "+ flight.getArrivalTime());
		flightArrivalTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightArrivalTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightArrivalTimeLabel.setBounds(40, 560, 360, 17);
		flightResultsPanel.add(flightArrivalTimeLabel);
		
		flightBusinessFareLabel = new JLabel();
		flightBusinessFareLabel.setText("Business Fare: " + Double.toString(flight.getBusinessFare()));
		flightBusinessFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightBusinessFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightBusinessFareLabel.setBounds(40, 640, 360, 17);
		flightResultsPanel.add(flightBusinessFareLabel);
		
		flightEconomyFareLabel = new JLabel();
		flightEconomyFareLabel.setText("Economy Fare: " + Double.toString(flight.getEconomyFare()));
		flightEconomyFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightEconomyFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightEconomyFareLabel.setBounds(40, 640, 360, 17);
		flightResultsPanel.add(flightEconomyFareLabel);
		
		flightResultsFrame.getContentPane().add(flightResultsPanel);
	}

}
