package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * View for search for flight objects
 *
 *
 */

public class SearchFlightJFrameView extends JInternalFrame{

	
	private static final long serialVersionUID = 1L;
	
	private JFrame flightFrame;
	private JPanel flightPanel;
	private JLabel flightLabel;
	private JTextField flightIDField;
	private JButton searchFlightButton;
	
	/**
	 * Creates the view for search for flight
	 */
	public SearchFlightJFrameView() {
		createGUIComponents();
		flightFrame.setSize(600, 175);
		flightFrame.setVisible(true);
		flightFrame.setResizable(true);
	}
	/**
	 * Create all the required components of the Flight
	 */
	private void createGUIComponents() {
		flightFrame = new JFrame("Search for Flights");
		FlowLayout layout = new FlowLayout();
		flightPanel = new JPanel(layout);
		
		flightLabel = new JLabel();
		flightLabel.setFont(new java.awt.Font("Arial", 1, 16));
		flightLabel.setText("Enter Flight ID:");
		flightLabel.setForeground(new java.awt.Color(255, 255, 255));
		flightPanel.add(flightLabel);
		
		flightIDField = new JTextField("", 40);
		flightPanel.add(flightIDField);
		
		searchFlightButton  = new JButton("Search");
		searchFlightButton.setFont(new java.awt.Font("Arial", 1, 14));
		flightPanel.add(searchFlightButton);
		
		flightPanel.setBackground(new java.awt.Color(48, 48, 48));
		flightPanel.setFont(new java.awt.Font("Arial", 1, 11));
		flightFrame.getContentPane().add(flightPanel);
		
	}
	
	/**
	 * UI Error handle for Flight ID via controller
	 * @param error
	 */
	public void setFlightIDError(String error) {
		flightIDField.setText(error);
		flightIDField.setForeground(new java.awt.Color(255, 0, 0));
	}
	/**
	 * @return the flightIDField
	 */
	public JTextField getFlightIDField() {
		return flightIDField;
	}
	/**
	 * @return the searchFlightButton
	 */
	public JButton getSearchFlightButton() {
		return searchFlightButton;
	}
	/**
	 * Method gets user input data and returns integer part for id
	 * @return
	 */
	public int getSearchFlightData() {
		return Integer.parseInt(flightIDField.getText());
	}

}
