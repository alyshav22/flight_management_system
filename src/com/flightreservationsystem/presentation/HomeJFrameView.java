package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HomeJFrameView {
	
	private JFrame mainframe;
	private JPanel panel;
	private JLabel label;
	private Box boxLayout;
	
	/**
	 * Default constructor that calls methods to create GUI components and render to
	 * screen
	 */
	public HomeJFrameView() {

		createGUIComponents();

		mainframe.setSize(600, 175);
		mainframe.setVisible(true);
	}
	/**
	 * Creates all the required components of the Home page
	 */
	private void createGUIComponents() {
		mainframe = new JFrame("Flight Management System");
		FlowLayout layout = new FlowLayout();
		panel = new JPanel(layout);
		boxLayout = Box.createHorizontalBox();
		
		panel.setBackground(new java.awt.Color(24, 108, 144));
		panel.setFont(new java.awt.Font("Arial", 1, 11));
		
		label = new JLabel();
		label.setFont(new java.awt.Font("Arial", 1, 16));
		label.setText("Success! You are logged in!");
		label.setForeground(new java.awt.Color(255, 255, 255));
		
		panel.add(label);
		panel.add(boxLayout);
		

		mainframe.getContentPane().add(panel);
	}
	


}
