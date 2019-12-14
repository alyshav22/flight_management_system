package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * View for search Airplane objects
 * @author ALYSHA
 *
 */

public class SearchAirplaneJFrameView extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JFrame airplaneFrame;
	private JPanel airplanePanel;
	private JLabel label;
	private JTextField airplaneIDField;
	private JButton searchAirplaneButton;

	/**
	 * Creates the view for search for airplane
	 */
	public SearchAirplaneJFrameView() {
		createGUIComponents();
		
		airplaneFrame.setSize(600, 175);
		airplaneFrame.setVisible(true);
	}
	
	/**
	 * Creates required components of the Airplane
	 */
	private void createGUIComponents() {
		airplaneFrame = new JFrame("Search for Airplane");
		FlowLayout layout = new FlowLayout();
		airplanePanel = new JPanel(layout);

		label = new JLabel();
		label.setFont(new java.awt.Font("Arial", 1, 16));
		label.setText("Enter Exhibit ID:");
		label.setForeground(new java.awt.Color(255, 255, 255));
		airplanePanel.add(label);

		airplaneIDField = new JTextField("", 40);
		airplanePanel.add(airplaneIDField);

		searchAirplaneButton = new JButton("Search");
		searchAirplaneButton.setFont(new java.awt.Font("Arial", 1, 14));
		airplanePanel.add(searchAirplaneButton);

		airplanePanel.setBackground(new java.awt.Color(48, 48, 48));
		airplanePanel.setFont(new java.awt.Font("Arial", 1, 11));
		airplaneFrame.getContentPane().add(airplanePanel);

	}
	
	/**
	 * UI Error Handle for Airplane ID VIA controller
	 * @param error
	 */
	public void setAirplaneIDError(String error) {
		airplaneIDField.setText(error);
		airplaneIDField.setForeground(new java.awt.Color(255, 0, 0));
	}

	/**
	 * Getter for exhibit ID
	 * @return
	 */
	public JTextField getAirplaneIDField() {
		return airplaneIDField;
	}

	/**
	 * Getter for search button 
	 * @return
	 */
	public JButton getSearchAirplaneButton() {
		return searchAirplaneButton;
	}


	/**
	 * This method gets user input data and returns integer part for id 
	 * @return
	 */
	public int getSearchAirplaneData() {
		return Integer.parseInt(airplaneIDField.getText());
	}

}
