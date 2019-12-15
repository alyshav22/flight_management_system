package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


import com.flightreservationsystem.model.domain.Airplane;

public class SearchAirplaneResultsJFrameView extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private Airplane airplane;
	private JFrame airplaneMainFrame;
	private JPanel airplanePanel;
	private JLabel airplaneIDLabel, airplaneModelLabel, economyQuantityLabel, businessQuantityLabel, airplaneNotesLabel;
	private JTextArea airplaneNotesField;
	

	/**
	 * Creates The view for search for Airplane
	 */
	public SearchAirplaneResultsJFrameView(Airplane airplane) {
		this.airplane = airplane;
		 createGUIComponents();
		 airplaneMainFrame.setSize(1366, 868);
		airplaneMainFrame.setVisible(true);
		
	}

	private void createGUIComponents() {
		airplaneMainFrame = new JFrame("Exhibit Search Results");
		FlowLayout layout = new FlowLayout();
		airplanePanel = new JPanel(layout);
		
		airplanePanel.setBackground(new java.awt.Color(24, 108, 144));
		airplanePanel.setFont(new java.awt.Font("Georgia", 1, 11));
		airplanePanel.setLayout(null);
		
		airplaneIDLabel = new JLabel();
		airplaneIDLabel.setText("Airplane ID: " + Integer.toString(airplane.getAirplaneID()));
		airplaneIDLabel.setFont(new java.awt.Font("Georgia", 1, 14));
		airplaneIDLabel.setForeground(new java.awt.Color(255, 255, 255));
		airplaneIDLabel.setBounds(40, 80, 360, 17);
		airplanePanel.add(airplaneIDLabel);
		
		airplaneModelLabel = new JLabel();
		airplaneModelLabel.setText("Airplane Model: " + airplane.getAirplaneModel());
		airplaneModelLabel.setFont(new java.awt.Font("Georgia", 1, 14));
		airplaneModelLabel.setForeground(new java.awt.Color(255, 255, 255));
		airplaneModelLabel.setBounds(40, 160, 360, 17);
		airplanePanel.add(airplaneModelLabel);
		
		economyQuantityLabel = new JLabel();
		economyQuantityLabel.setText("Economy Seats Quantity: " + airplane.getEconomySeatsQuantity());
		economyQuantityLabel.setFont(new java.awt.Font("Georgia", 1, 14));
		economyQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
		economyQuantityLabel.setBounds(40, 240, 360, 17);
		airplanePanel.add(economyQuantityLabel);
		
		businessQuantityLabel = new JLabel();
		businessQuantityLabel.setText("Economy Seats Quantity: " + airplane.getEconomySeatsQuantity());
		businessQuantityLabel.setFont(new java.awt.Font("Arial", 1, 14));
		businessQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
		businessQuantityLabel.setBounds(40, 320, 360, 17);
		airplanePanel.add(businessQuantityLabel);
		
		airplaneNotesLabel = new JLabel();
		airplaneNotesLabel.setText("Additional Notes: ");
		airplaneNotesLabel.setFont(new java.awt.Font("Arial", 1, 14));
		airplaneNotesLabel.setForeground(new java.awt.Color(255, 255, 255));
		airplaneNotesLabel.setBounds(40, 400, 360, 17);
		airplanePanel.add(airplaneNotesLabel);
		
		airplaneNotesField = new JTextArea(10,40);
		airplaneNotesField.setLineWrap(true);
		airplaneNotesField.setText(airplane.getNotes());
		JScrollPane scroller = new JScrollPane(airplaneNotesField);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroller.setBounds(220, 400,600, 200);
		airplanePanel.add(scroller);
		
		airplaneMainFrame.getContentPane().add(airplanePanel);
		
	}

}
