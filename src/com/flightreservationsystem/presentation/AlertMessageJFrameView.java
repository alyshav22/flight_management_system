package com.flightreservationsystem.presentation;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * AlertMessageJFrameView UI to load alert message confirmation after action 
 * 
 * @author Alysha 
 */

public class AlertMessageJFrameView extends JDialog {

	
	private static final long serialVersionUID = 1L;
	
	
	JButton confirmButton = new JButton("OK");
	JLabel confirmButtonLabel = new JLabel();

	public AlertMessageJFrameView(String title, String message) {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(350, 150);
		confirmButtonLabel.setText(message);
		this.setTitle(title);
		createGUIComponents();
		this.setVisible(true);	
	}

	
	/**
	 * Creates all the required components of the Alert Message  
	 */
	private void createGUIComponents() {
		setBackground(new java.awt.Color(48, 48, 48));
		setFont(new java.awt.Font("Georgia", 1, 11));
		
		confirmButtonLabel.setBounds(56, 15, 240, 40); 
		confirmButtonLabel.setFont(new java.awt.Font("Georgia", 1, 14));
		
		confirmButton.setBounds(114, 70, 68, 23);
		confirmButton.setFont(new java.awt.Font("Georgia", 1, 14));
		this.getContentPane().add(confirmButtonLabel);
		this.getContentPane().add(confirmButton);
		getContentPane().setLayout(null);
	}

	/**
	 * Getter for alert confirm button 
	 * @return confirmButton
	 */
	public JButton getConfirmButton() {
		return confirmButton;
	}

}
