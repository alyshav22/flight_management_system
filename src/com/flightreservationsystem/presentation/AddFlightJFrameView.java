package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.flightreservationsystem.model.domain.Flight;

public class AddFlightJFrameView {

	private JFrame flightMainFrame;
	private JPanel flightPanel;
	private JMenuBar flightMenuBar;
	private JMenu flightMenu;
	private JMenuItem flightFileCloseItem;
	private JLabel flightIDLabel, airlineNameLabel, flightOriginLabel, flightDestinationLabel, departureDateLabel,
			flightDepartureTimeLabel, flightArrivalDateLabel, flightArrivalTimeLabel, flightBusinessFareLabel,
			flightEconomyFareLabel;
	private JTextField flightIDField, airlineNameField, flightOriginField, flightDestinationField,
			flightDepartureDateField, flightDepartureTimeField, flightArrivalDateField, flightArrivalTimeField,
			flightBusinessFareField, flightEconomyFareField;
	private JButton saveFlightButton, cancelFlightButton;
	private Box flightBoxLayout;
	private LocalDate departureDate, arrivalDate;

	public AddFlightJFrameView() {

		createGUIComponents();
		flightMainFrame.setSize(1366, 868);
		flightMainFrame.setVisible(true);
		flightMainFrame.setResizable(true);
	}

	private void createGUIComponents() {
		
		flightMainFrame = new JFrame("Add Flight");
		FlowLayout layout = new FlowLayout();
		flightPanel = new JPanel(layout);
		flightBoxLayout = Box.createHorizontalBox();

		saveFlightButton = new JButton("Save");
		saveFlightButton.setFont(new java.awt.Font("Arial", 1, 14));

		cancelFlightButton = new JButton("Cancel");
		cancelFlightButton.setFont(new java.awt.Font("Arial", 1, 14));

		flightBoxLayout.add(cancelFlightButton);
		flightBoxLayout.add(saveFlightButton);
		flightBoxLayout.setBounds(885, 740, 200, 50);
		flightPanel.add(flightBoxLayout);

		flightMenuBar = new JMenuBar();
		flightMenu = new JMenu();
		flightFileCloseItem = new JMenuItem();

		flightMenu.setText("File");
		flightMenu.setFont(new java.awt.Font("Arial", 1, 11));

		flightFileCloseItem.setText("Exit");
		flightFileCloseItem.setFont(new java.awt.Font("Arial", 1, 11));

		flightMenu.add(flightFileCloseItem);
		flightMenuBar.add(flightMenu);
		flightMainFrame.setJMenuBar(flightMenuBar);

		flightPanel.setBackground(new java.awt.Color(48, 48, 48));
		flightPanel.setFont(new java.awt.Font("Arial", 1, 11));
		flightPanel.setLayout(null);

		flightIDLabel = new JLabel();
		flightIDLabel.setText("Flight ID:");
		flightIDLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightIDLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightIDLabel.setBounds(40, 80, 120, 17);
		flightPanel.add(flightIDLabel);

		flightIDField = new JTextField("123456", 40);
		flightIDField.setBounds(160, 80, 240, 20);
		flightPanel.add(flightIDField);

		airlineNameLabel = new JLabel();
		airlineNameLabel.setText("Airline Name:");
		airlineNameLabel.setFont(new java.awt.Font("Arial", 1, 14));
		airlineNameLabel.setForeground(new java.awt.Color(255, 255, 255));
		airlineNameLabel.setBounds(40, 160, 120, 17);
		flightPanel.add(airlineNameLabel);

		airlineNameField = new JTextField("Airline Name", 40);
		airlineNameField.setBounds(160, 160, 240, 20);
		flightPanel.add(airlineNameField);

		flightOriginLabel = new JLabel();
		flightOriginLabel.setText("Flight Origin:");
		flightOriginLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightOriginLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightOriginLabel.setBounds(40, 240, 120, 17);
		flightPanel.add(flightOriginLabel);

		flightOriginField = new JTextField("Flight Origin", 40);
		flightOriginField.setBounds(160, 240, 240, 20);
		flightPanel.add(flightOriginField);

		flightDestinationLabel = new JLabel();
		flightDestinationLabel.setText("Flight Destination:");
		flightDestinationLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightDestinationLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightDestinationLabel.setBounds(40, 320, 150, 17);
		flightPanel.add(flightDestinationLabel);

		flightDestinationField = new JTextField("Flight Destination", 40);
		flightDestinationField.setBounds(180, 320, 240, 20);
		flightPanel.add(flightDestinationField);

		departureDateLabel = new JLabel();
		departureDateLabel.setText("Flight Departure Date:");
		departureDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureDateLabel.setBounds(40, 400, 120, 17);
		flightPanel.add(departureDateLabel);

		flightDepartureDateField = new JTextField("MM/dd/yyyy", 40);
		flightDepartureDateField.setBounds(160, 400, 240, 20);
		flightPanel.add(flightDepartureDateField);

		flightDepartureTimeLabel = new JLabel();
		flightDepartureTimeLabel.setText("Flight Departure Time:");
		flightDepartureTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightDepartureTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightDepartureTimeLabel.setBounds(40, 480, 120, 17);
		flightPanel.add(flightDepartureTimeLabel);

		flightDepartureTimeField = new JTextField("Departure Time", 40);
		flightDepartureTimeField.setBounds(160, 480, 240, 20);
		flightPanel.add(flightDepartureTimeField);

		flightArrivalDateLabel = new JLabel();
		flightArrivalDateLabel.setText("Flight Arrival Date:");
		flightArrivalDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightArrivalDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightArrivalDateLabel.setBounds(40, 560, 120, 17);
		flightPanel.add(flightArrivalDateLabel);

		flightArrivalDateField = new JTextField("MM/dd/yyyy", 40);
		flightArrivalDateField.setBounds(160, 560, 240, 20);
		flightPanel.add(flightArrivalDateField);

		flightArrivalTimeLabel = new JLabel();
		flightArrivalTimeLabel.setText("Flight Arrival Time:");
		flightArrivalTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightArrivalTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightArrivalTimeLabel.setBounds(40, 640, 120, 17);
		flightPanel.add(flightArrivalTimeLabel);

		flightArrivalTimeField = new JTextField("Arrival Time", 40);
		flightArrivalTimeField.setBounds(160, 640, 240, 20);
		flightPanel.add(flightArrivalTimeField);

		flightBusinessFareLabel = new JLabel();
		flightBusinessFareLabel.setText("Business Fare:");
		flightBusinessFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightBusinessFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightBusinessFareLabel.setBounds(438, 80, 120, 17);
		flightPanel.add(flightBusinessFareLabel);

		flightBusinessFareField = new JTextField("Business Fare", 40);
		flightBusinessFareField.setBounds(538, 80, 240, 20);
		flightPanel.add(flightBusinessFareField);

		flightEconomyFareLabel = new JLabel();
		flightEconomyFareLabel.setText("Economy Fare:");
		flightEconomyFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		flightEconomyFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightEconomyFareLabel.setBounds(438, 160, 120, 17);
		flightPanel.add(flightEconomyFareLabel);

		flightEconomyFareField = new JTextField("Economy Fare", 40);
		flightEconomyFareField.setBounds(585, 160, 240, 20);
		flightPanel.add(flightEconomyFareField);

		flightMainFrame.getContentPane().add(flightPanel);
	}

	/**
	 * @return the flightFileCloseItem
	 */
	public JMenuItem getFlightFileCloseItem() {
		return flightFileCloseItem;
	}

	/**
	 * @return the saveFlightButton
	 */
	public JButton getSaveFlightButton() {
		return saveFlightButton;
	}

	/**
	 * @return the cancelFlightButton
	 */
	public JButton getCancelFlightButton() {
		return cancelFlightButton;
	}

	/**
	 * @return the flightIDField
	 */
	public JTextField getFlightIDField() {
		return flightIDField;
	}

	/**
	 * @return the airlineNameField
	 */
	public JTextField getAirlineNameField() {
		return airlineNameField;
	}

	/**
	 * @return the flightOriginField
	 */
	public JTextField getFlightOriginField() {
		return flightOriginField;
	}

	/**
	 * @return the flightDestinationField
	 */
	public JTextField getFlightDestinationField() {
		return flightDestinationField;
	}

	/**
	 * @return the flightDepartureDateField
	 */
	public JTextField getFlightDepartureDateField() {
		return flightDepartureDateField;
	}

	/**
	 * @return the flightDepartureTimeField
	 */
	public JTextField getFlightDepartureTimeField() {
		return flightDepartureTimeField;
	}

	/**
	 * @return the flightArrivalDateField
	 */
	public JTextField getFlightArrivalDateField() {
		return flightArrivalDateField;
	}

	/**
	 * @return the flightArrivalTimeField
	 */
	public JTextField getFlightArrivalTimeField() {
		return flightArrivalTimeField;
	}

	/**
	 * @return the flightBusinessFareField
	 */
	public JTextField getFlightBusinessFareField() {
		return flightBusinessFareField;
	}

	/**
	 * @return the flightEconomyFareField
	 */
	public JTextField getFlightEconomyFareField() {
		return flightEconomyFareField;
	}
	
	/**
	 * UI Error Handle for Flight ID VIA controller
	 * @param error
	 */
	public void setFlightIDError(String error) {
		flightIDField.setText(error);
		flightIDField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Airline Name VIA controller
	 * @param error
	 */
	public void setAirlineNameError(String error) {
		flightIDField.setText(error);
		flightIDField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Origin VIA controller
	 * @param error
	 */
	public void setdflightOriginError(String error) {
		airlineNameField.setText(error);
		airlineNameField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Destination VIA controller
	 * @param error
	 */
	public void setflightDestinationError(String error) {
		flightDestinationField.setText(error);
		flightDestinationField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Departure Date VIA controller
	 * @param error
	 */
	public void setflightDepartureDateError(String error) {
		flightDepartureDateField.setText(error);
		flightDepartureDateField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Departure Time VIA controller
	 * @param error
	 */
	public void setflightDepartureTimeError(String error) {
		flightDepartureTimeField.setText(error);
		flightDepartureTimeField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Arrival Date VIA controller
	 * @param error
	 */
	public void setflightArrivalDateError(String error) {
		flightArrivalDateField.setText(error);
		flightArrivalDateField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Arrival Date VIA controller
	 * @param error
	 */
	public void setflightArrivalTimeError(String error) {
		flightArrivalTimeField.setText(error);
		flightArrivalTimeField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight business fare VIA controller
	 * @param error
	 */
	public void setflightBusinessFareError(String error) {
		flightBusinessFareField.setText(error);
		flightBusinessFareField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight economy fare VIA controller
	 * @param error
	 */
	public void setflightEconomyFareError(String error) {
		flightEconomyFareField.setText(error);
		flightEconomyFareField.setForeground(new java.awt.Color(255, 0, 0));
	}

	/**
	 * This method initializes and returns a Flight object
	 * @return flight     
	 */
	public Flight getFlightData() {

		// Format and validate flight departure date entered by user.

		String pattern = "MM/dd/yyyy";
		String date = flightDepartureDateField.getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		if (flightDepartureDateField.getText().equals(pattern)) {
			departureDate = LocalDate.of(1900, Month.JUNE, 05);
		} else {
			departureDate = LocalDate.parse(date, formatter);
		}

		// Format and validate flight arrival date entered by user.
		String pattern2 = "MM/dd/yyyy";
		String date2 = flightArrivalDateField.getText();
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);
		if (flightArrivalDateField.getText().equals(pattern2)) {
			arrivalDate = LocalDate.of(1900, Month.JUNE, 05);
		} else {
			arrivalDate = LocalDate.parse(date2, formatter2);
		}
		
		//Create Flight object based on user input
		Flight flight = new Flight(
				Integer.parseInt(flightIDField.getText()),
				airlineNameField.getText(),
				flightOriginField.getText(),
				flightDestinationField.getText(),
				departureDate,
				flightDepartureTimeField.getText(),
				arrivalDate,
				flightArrivalTimeField.getText(),
				Double.parseDouble(flightBusinessFareField.getText()),
				Double.parseDouble(flightEconomyFareField.getText())
			);
			return flight;	
	}

}
