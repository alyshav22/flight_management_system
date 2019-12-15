package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.flightreservationsystem.model.domain.Flight;

/**
 * This view displays the results returned by searching for a Flight
 * @author ALYSHA
 */

public class SearchFlightResultsJFrameView extends JInternalFrame {

	
	private static final long serialVersionUID = 1L;
	
	private Flight flight;
	private JFrame flightResultsFrame;
	private JPanel flightResultsPanel;
	private JLabel flightIDResultsLabel, airlineNameLabel, departureLocationLabel, arrivalLocationLabel,
			departureDateLabel, departureTimeLabel, arrivalDateLabel, arrivalTimeLabel,
			businessFareLabel, economyFareLabel;

	/**
	 * Default constructor that calls method to create GUI components and render to screen
	 */
	public SearchFlightResultsJFrameView(Flight flight) {
		this.flight = flight;
		createGUIComponents();
		flightResultsFrame.setSize(1366, 868);
		flightResultsFrame.setVisible(true);
		flightResultsFrame.setResizable(true);
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
		flightIDResultsLabel.setText("Flight ID: " + Integer.toString(flight.getFlightID()));
		flightIDResultsLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightIDResultsLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightIDResultsLabel.setBounds(40, 80, 360, 17);
		flightResultsPanel.add(flightIDResultsLabel);
		
		airlineNameLabel = new JLabel();
		airlineNameLabel.setText("Airline Code: " + flight.getAirlineCode());
		airlineNameLabel.setFont(new java.awt.Font("Arial", 1, 14));
		airlineNameLabel.setForeground(new java.awt.Color(255, 255, 255));
		airlineNameLabel.setBounds(40, 160, 360, 17);
		flightResultsPanel.add(airlineNameLabel);
		
		departureLocationLabel = new JLabel();
		departureLocationLabel.setText("Arrival Location: "+ flight.getDepartureLocation());
		departureLocationLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureLocationLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureLocationLabel.setBounds(40, 240, 360, 17);
		flightResultsPanel.add(departureLocationLabel);
		
		arrivalLocationLabel = new JLabel();
		arrivalLocationLabel.setText("Destination Location: "+ flight.getDestinationLocation());
		arrivalLocationLabel.setFont(new java.awt.Font("Arial", 1, 14));
		arrivalLocationLabel.setForeground(new java.awt.Color(255, 255, 255));
		arrivalLocationLabel.setBounds(40, 320, 360, 17);
		flightResultsPanel.add(arrivalLocationLabel);
		
		LocalDate localDate = flight.getDepartureDate();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedString = localDate.format(formatter);
		
		departureDateLabel = new JLabel();
		departureDateLabel.setText("Departure Date: " + formattedString);
		departureDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureDateLabel.setBounds(40, 400, 360, 17);
		flightResultsPanel.add(departureDateLabel);
		
		departureTimeLabel = new JLabel();
		departureTimeLabel.setText("Departure Time: "+ flight.getDepartureTime());
		departureTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureTimeLabel.setBounds(438, 80, 360, 17);
		flightResultsPanel.add(departureTimeLabel);
		
		LocalDate localDateArrival = flight.getArrivalDate();
		DateTimeFormatter formatterArrival = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedStringArrival = localDateArrival.format(formatterArrival);
		
		arrivalDateLabel = new JLabel();
		arrivalDateLabel.setText("Arrival Date: " + formattedStringArrival);
		arrivalDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		arrivalDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		arrivalDateLabel.setBounds(438, 160, 360, 17);
		flightResultsPanel.add(arrivalDateLabel);
		
		arrivalTimeLabel = new JLabel();
		arrivalTimeLabel.setText("Arrival Time: "+ flight.getArrivalTime());
		arrivalTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		arrivalTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		arrivalTimeLabel.setBounds(438, 240, 360, 17);
		flightResultsPanel.add(arrivalTimeLabel);
		
		businessFareLabel = new JLabel();
		businessFareLabel.setText("Business Fare: " + Double.toString(flight.getBusinessFare()));
		businessFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		businessFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		businessFareLabel.setBounds(438, 320, 360, 17);
		flightResultsPanel.add(businessFareLabel);
		
		economyFareLabel = new JLabel();
		economyFareLabel.setText("Economy Fare: " + Double.toString(flight.getEconomyFare()));
		economyFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		economyFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		economyFareLabel.setBounds(438, 400, 360, 17);
		flightResultsPanel.add(economyFareLabel);
		
		flightResultsFrame.getContentPane().add(flightResultsPanel);
	}

}
