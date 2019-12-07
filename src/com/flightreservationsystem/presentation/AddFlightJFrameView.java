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

/**
 * AddFlightJFrameView UI to load flight page and capture Admin inventory action
 * @author alysha_velasquez
 *
 */
public class AddFlightJFrameView {

	private JFrame flightMainFrame;
	private JPanel flightPanel;
	private JMenuBar flightMenuBar;
	private JMenu flightMenu;
	private JMenuItem flightFileCloseItem;
	private JLabel flightIDLabel, airlineCodeLabel, departureLocationLabel, arrivalLocationLabel, departureDateLabel,
			departureTimeLabel, arrivalDateLabel, arrivalTimeLabel, businessFareLabel,
			economyFareLabel;
	private JTextField flightIDField, airlineCodeField, departureLocationField, destinationLocationField,
			departureDateField, departureTimeField, arrivalDateField, arrivalTimeField,
			businessFareField, economyFareField;
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
		flightBoxLayout.setBounds(600, 450, 200, 50);
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
		flightIDField.setBounds(180, 80, 240, 20);
		flightPanel.add(flightIDField);

		airlineCodeLabel = new JLabel();
		airlineCodeLabel.setText("Airline Code:");
		airlineCodeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		airlineCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
		airlineCodeLabel.setBounds(40, 160, 120, 17);
		flightPanel.add(airlineCodeLabel);

		airlineCodeField = new JTextField("Airline Code", 40);
		airlineCodeField.setBounds(180, 160, 240, 20);
		flightPanel.add(airlineCodeField);

		departureLocationLabel = new JLabel();
		departureLocationLabel.setText("Departure Location:");
		departureLocationLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureLocationLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureLocationLabel.setBounds(40, 240, 150, 17);
		flightPanel.add(departureLocationLabel);

		departureLocationField = new JTextField("Departure Location", 40);
		departureLocationField.setBounds(180, 240, 240, 20);
		flightPanel.add(departureLocationField);

		arrivalLocationLabel = new JLabel();
		arrivalLocationLabel.setText("Arrival Location:");
		arrivalLocationLabel.setFont(new java.awt.Font("Arial", 1, 14));
		arrivalLocationLabel.setForeground(new java.awt.Color(255, 255, 255));
		arrivalLocationLabel.setBounds(40, 320, 150, 17);
		flightPanel.add(arrivalLocationLabel);

		destinationLocationField = new JTextField("Arrival Location", 40);
		destinationLocationField.setBounds(180, 320, 240, 20);
		flightPanel.add(destinationLocationField);

		departureDateLabel = new JLabel();
		departureDateLabel.setText("Departure Date:");
		departureDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureDateLabel.setBounds(40, 400, 120, 17);
		flightPanel.add(departureDateLabel);

		departureDateField = new JTextField("MM/dd/yyyy", 40);
		departureDateField.setBounds(180, 400, 240, 20);
		flightPanel.add(departureDateField);
		
		
		departureTimeLabel = new JLabel();
		departureTimeLabel.setText("Departure Time:");
		departureTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		departureTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		departureTimeLabel.setBounds(438, 80, 120, 17);
		flightPanel.add(departureTimeLabel);

		departureTimeField = new JTextField("Departure Time", 40);
		departureTimeField.setBounds(560, 80, 240, 20);
		flightPanel.add(departureTimeField);

		arrivalDateLabel = new JLabel();
		arrivalDateLabel.setText("Arrival Date:");
		arrivalDateLabel.setFont(new java.awt.Font("Arial", 1, 14));
		arrivalDateLabel.setForeground(new java.awt.Color(255, 255, 255));
		arrivalDateLabel.setBounds(438, 160, 120, 17);
		flightPanel.add(arrivalDateLabel);

		arrivalDateField = new JTextField("MM/dd/yyyy", 40);
		arrivalDateField.setBounds(560, 160, 240, 20);
		flightPanel.add(arrivalDateField);

		arrivalTimeLabel = new JLabel();
		arrivalTimeLabel.setText("Arrival Time:");
		arrivalTimeLabel.setFont(new java.awt.Font("Arial", 1, 14));
		arrivalTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
		arrivalTimeLabel.setBounds(438, 240, 120, 17);
		flightPanel.add(arrivalTimeLabel);

		arrivalTimeField = new JTextField("Arrival Time", 40);
		arrivalTimeField.setBounds(560, 240, 240, 20);
		flightPanel.add(arrivalTimeField);

		businessFareLabel = new JLabel();
		businessFareLabel.setText("Business Fare:");
		businessFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		businessFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		businessFareLabel.setBounds(438, 320, 120, 17);
		flightPanel.add(businessFareLabel);

		businessFareField = new JTextField("0.00", 40);
		businessFareField.setBounds(560, 320, 240, 20);
		flightPanel.add(businessFareField);

		economyFareLabel = new JLabel();
		economyFareLabel.setText("Economy Fare:");
		economyFareLabel.setFont(new java.awt.Font("Arial", 1, 14));
		economyFareLabel.setForeground(new java.awt.Color(255, 255, 255));
		economyFareLabel.setBounds(438, 400, 120, 17);
		flightPanel.add(economyFareLabel);

		economyFareField = new JTextField("0.00", 40);
		economyFareField.setBounds(560, 400, 240, 20);
		flightPanel.add(economyFareField);

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
	 * @return the airlineCodeField
	 */
	public JTextField getAirlineCodeField() {
		return airlineCodeField;
	}

	/**
	 * @return the departureLocationField
	 */
	public JTextField getDepartureLocationField() {
		return departureLocationField;
	}

	/**
	 * @return the destinationLocationField
	 */
	public JTextField getDestinationLocationField() {
		return destinationLocationField;
	}

	/**
	 * @return the departureDateField
	 */
	public JTextField getDepartureDateField() {
		return departureDateField;
	}

	/**
	 * @return the departureTimeField
	 */
	public JTextField getDepartureTimeField() {
		return departureTimeField;
	}

	/**
	 * @return the arrivalDateField
	 */
	public JTextField getArrivalDateField() {
		return arrivalDateField;
	}

	/**
	 * @return the arrivalTimeField
	 */
	public JTextField getArrivalTimeField() {
		return arrivalTimeField;
	}

	/**
	 * @return the businessFareField
	 */
	public JTextField getBusinessFareField() {
		return businessFareField;
	}

	/**
	 * @return the economyFareField
	 */
	public JTextField getEconomyFareField() {
		return economyFareField;
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
	public void setFlightOriginError(String error) {
		airlineCodeField.setText(error);
		airlineCodeField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Destination VIA controller
	 * @param error
	 */
	public void setFlightDestinationError(String error) {
		destinationLocationField.setText(error);
		destinationLocationField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Departure Date VIA controller
	 * @param error
	 */
	public void setDepartureDateError() {
		departureDateField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Departure Date VIA controller
	 * @param error
	 */
	public void setDepartureDateError(String error) {
		departureDateField.setForeground(new java.awt.Color(255, 0, 0));
		departureDateField.setText(error);
	}
	
	/**
	 * UI Error Handle for Flight Departure Time VIA controller
	 * @param error
	 */
	public void setFlightDepartureTimeError(String error) {
		departureTimeField.setText(error);
		departureTimeField.setForeground(new java.awt.Color(255, 0, 0));
	}
	/**
	 * UI Error Handle for Flight Arrival Date VIA controller
	 * @param error
	 */
	public void setFlightArrivalDateError() {
		arrivalDateField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Arrival Date VIA controller
	 * @param error
	 */
	public void setFlightArrivalDateError(String error) {
		arrivalDateField.setText(error);
		arrivalDateField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight Arrival Date VIA controller
	 * @param error
	 */
	public void setFlightArrivalTimeError(String error) {
		arrivalTimeField.setText(error);
		arrivalTimeField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight business fare VIA controller
	 * @param error
	 */
	public void setFlightBusinessFareError(String error) {
		businessFareField.setText(error);
		businessFareField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Flight economy fare VIA controller
	 * @param error
	 */
	public void setFlightEconomyFareError(String error) {
		economyFareField.setText(error);
		economyFareField.setForeground(new java.awt.Color(255, 0, 0));
	}

	/**
	 * This method initializes and returns a Flight object
	 * @return flight     
	 */
	public Flight getFlightData() {

		// Format and validate flight departure date entered by user.
		String pattern = "MM/dd/yyyy";
		String date = departureDateField.getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		if (departureDateField.getText().equals(pattern)) {
			departureDate = LocalDate.of(1900, Month.JUNE, 05);
		} else {
			departureDate = LocalDate.parse(date, formatter);
		}

		// Format and validate flight arrival date entered by user.
		
		String pattern2 = "MM/dd/yyyy";
		String date2 = departureDateField.getText();
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);
		if (arrivalDateField.getText().equals(pattern2)) {
			arrivalDate = LocalDate.of(1900, Month.JUNE, 05);
		} else {
			arrivalDate = LocalDate.parse(date2, formatter2);
		}
		
		//Create Flight object based on user input
		Flight flight = new Flight(
				Integer.parseInt(flightIDField.getText()),
				airlineCodeField.getText(),
				departureLocationField.getText(),
				destinationLocationField.getText(),
				departureDate,
				departureTimeField.getText(),
				arrivalDate,
				arrivalTimeField.getText(),
				Double.parseDouble(businessFareField.getText()),
				Double.parseDouble(economyFareField.getText())
			);
			return flight;	
	}

}
