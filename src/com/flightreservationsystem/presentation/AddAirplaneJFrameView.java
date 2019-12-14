package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


import com.flightreservationsystem.model.domain.Airplane;

public class AddAirplaneJFrameView extends JInternalFrame{

	private static final long serialVersionUID = 1L;
	
	private JFrame airplaneMainFrame;
	private JPanel airplanePanel;
	private JMenuBar airplaneMenuBar;
	private JMenu airplaneMenu;
	private JMenuItem airplaneFileCloseItem;
	private Box airplaneBoxLayout;
	private JButton cancelAirplaneButton, saveAirplaneButton;
	private JLabel airplaneIDLabel, airplaneModelLabel, economyQuantityLabel, businessQuantityLabel, airplaneDescriptionLabel;
	private JTextField airplaneIDField, airplaneModelField, economyQuantityField, businessQuantityField;
	private JTextArea airplaneDescriptionField;
	
	
	/**
	 * Default constructor that calls method to create GUI components and render to screen
	 */
	public AddAirplaneJFrameView() {
		createGUIComponents();
		airplaneMainFrame.setSize(1366,868);
		airplaneMainFrame.setVisible(true);
	}
	
	/**
	 * Create all the required components of the Add Airplane page
	 */
	private void createGUIComponents() {
		airplaneMainFrame = new JFrame("Add Flight");
		FlowLayout layout = new FlowLayout();
		airplanePanel = new JPanel(layout);
		airplaneBoxLayout = Box.createHorizontalBox();
		
		saveAirplaneButton = new JButton("Save");
		saveAirplaneButton.setFont(new java.awt.Font("Arial", 1,14));
		
		cancelAirplaneButton  = new JButton("Cancel");
		cancelAirplaneButton.setFont(new java.awt.Font("Georgia", 1, 14));
		
		airplaneBoxLayout.add(cancelAirplaneButton);
		airplaneBoxLayout.add(saveAirplaneButton);
		airplaneBoxLayout.setBounds(885, 740,200, 50);
		airplanePanel.add(airplaneBoxLayout);
		
		airplaneMenuBar = new JMenuBar();
		airplaneMenu = new JMenu();
		airplaneFileCloseItem = new JMenuItem();
		
		airplaneMenu.setText("File");
		airplaneMenu.setFont(new java.awt.Font("Arial", 1, 11));
		
		airplaneFileCloseItem.setText("Exit");
		airplaneFileCloseItem.setFont(new java.awt.Font("Arial", 1, 11));
		
		airplaneMenu.add(airplaneFileCloseItem);
		airplaneMenuBar.add(airplaneMenu);
		airplaneMainFrame.setJMenuBar(airplaneMenuBar);
		
		airplanePanel.setBackground(new java.awt.Color(48, 48, 48));
		airplanePanel.setFont(new java.awt.Font("Georgia", 1, 11));
		airplanePanel.setLayout(null);
		
		airplaneIDLabel = new JLabel();
		airplaneIDLabel.setText("Airplane ID:");
		airplaneIDLabel.setFont(new java.awt.Font("Arial", 1, 14));
		airplaneIDLabel.setForeground(new java.awt.Color(255, 255, 255));
		airplaneIDLabel.setBounds(40, 80, 120, 17);
		airplanePanel.add(airplaneIDLabel);
		
		airplaneIDField = new JTextField("123456", 40);
		airplaneIDField.setBounds(160, 80, 240, 20);
		airplanePanel.add(airplaneIDField);
		
		airplaneModelLabel = new JLabel();
		airplaneModelLabel.setText("Airplane Model:");
		airplaneModelLabel.setFont(new java.awt.Font("Georgia", 1, 14));
		airplaneModelLabel.setForeground(new java.awt.Color(255, 255, 255));
		airplaneModelLabel.setBounds(40, 160, 120, 17);
		airplanePanel.add(airplaneModelLabel);
		
		airplaneModelField = new JTextField("Airplane Model", 40);
		airplaneModelField.setBounds(160, 160, 240, 20);
		airplanePanel.add(airplaneModelField);
		
		economyQuantityLabel = new JLabel();
		economyQuantityLabel.setText("Economy Seats Quantity:");
		economyQuantityLabel.setFont(new java.awt.Font("Arial", 1, 14));
		economyQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
		economyQuantityLabel.setBounds(40, 240, 120, 17);
		airplanePanel.add(economyQuantityLabel);
		
		economyQuantityField = new JTextField("0", 40);
		economyQuantityField.setBounds(160, 240, 240, 20);
		airplanePanel.add(economyQuantityField);
		
		businessQuantityLabel = new JLabel();
		businessQuantityLabel.setText("Business Seats Quantity:");
		businessQuantityLabel.setFont(new java.awt.Font("Arial", 1, 14));
		businessQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
		businessQuantityLabel.setBounds(40, 320, 120, 17);
		airplanePanel.add(businessQuantityLabel);
		
		businessQuantityField = new JTextField("0", 40);
		businessQuantityField.setBounds(160, 320, 240, 20);
		airplanePanel.add(businessQuantityField);
		
		airplaneDescriptionLabel = new JLabel();
		airplaneDescriptionLabel.setText("Description:");
		airplaneDescriptionLabel.setFont(new java.awt.Font("Georgia", 1, 14));
		airplaneDescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
		airplaneDescriptionLabel.setBounds(438, 80, 120, 17);
		airplanePanel.add(airplaneDescriptionLabel);
		
		
		
		airplaneDescriptionField = new JTextArea(10,40);
		airplaneDescriptionField.setLineWrap(true);
		JScrollPane scroller = new JScrollPane(airplaneDescriptionField);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroller.setBounds(585, 80,600, 600);
		airplanePanel.add(scroller);
		
		
		airplaneMainFrame.getContentPane().add(airplanePanel);
	}
	
	/**
	 * Getter for file close button
	 * @return
	 */
	public JMenuItem getAirplaneFileCloseItem() {
		// TODO Auto-generated method stub
		return airplaneFileCloseItem;
	}
	/**
	 * Getter for cancel button
	 * @return
	 */
	public JButton getCancelAirplaneButton() {
		// TODO Auto-generated method stub
		return cancelAirplaneButton;
	}

	/**
	 * Getter for save button
	 * @return
	 */
	public JButton getSaveAirplaneButton() {
		// TODO Auto-generated method stub
		return saveAirplaneButton;
	}

	/**
	 * @return the airplaneIDField
	 */
	public JTextField getAirplaneIDField() {
		return airplaneIDField;
	}

	/**
	 * @return the airplaneModelField
	 */
	public JTextField getAirplaneModelField() {
		return airplaneModelField;
	}

	/**
	 * @return the economyQuantityField
	 */
	public JTextField getEconomyQuantityField() {
		return economyQuantityField;
	}

	/**
	 * @return the businessQuantityField
	 */
	public JTextField getBusinessQuantityField() {
		return businessQuantityField;
	}

	/**
	 * UI Error Handle for Airplane ID Via controller
	 * @param error
	 */
	public void setAirplaneIDError(String error) {
		airplaneIDField.setText(error);
		airplaneIDField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle for Airplane Model Via controller
	 * @param error
	 */
	public void setAirplaneModelError(String error) {
		airplaneModelField.setText(error);
		airplaneModelField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle forEconomy Quantity Seats Via controller
	 * @param error
	 */
	public void setAirplaneEconomyQuantityError(String error) {
		economyQuantityField.setText(error);
		economyQuantityField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * UI Error Handle forEconomy Quantity Seats Via controller
	 * @param error
	 */
	public void setAirplaneBusinessQuantityError(String error) {
		businessQuantityField.setText(error);
		businessQuantityField.setForeground(new java.awt.Color(255, 0, 0));
	}
	
	/**
	 * This methods initializes and returns a Exhibit object 
	 * @return exhibit 
	 */
	public Airplane getAirplaneData() {
		// Create Exhibit object based on user input
		Airplane airplane = new Airplane(
				Integer.parseInt(airplaneIDField.getText()),
				airplaneModelField.getText(),
				Integer.parseInt(economyQuantityField.getText()),
				Integer.parseInt(businessQuantityField.getText()),
				airplaneDescriptionField.getText()
		);
		return airplane;
	}
	
	
	

}
