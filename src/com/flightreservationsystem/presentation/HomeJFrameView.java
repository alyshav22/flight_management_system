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
	private JButton addButton, searchButton;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem fileCloseItem;
	private Box boxLayout;
	private JDesktopPane theDesktop = new JDesktopPane();
	
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

		addButton = new JButton("Add Flight");
		addButton.setFont(new java.awt.Font("Arial", 1, 14));
		
		searchButton= new JButton("Search Flight");
		searchButton.setFont(new java.awt.Font("Arial", 1, 14));
		
		boxLayout.add(addButton);
		boxLayout.add(searchButton);
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu();
		fileCloseItem = new JMenuItem();
		label = new JLabel();

		fileMenu.setText("File");
		fileMenu.setFont(new java.awt.Font("Arial", 1, 11));

		fileCloseItem.setText("Exit");
		fileCloseItem.setFont(new java.awt.Font("Arial", 1, 11));

		fileMenu.add(fileCloseItem);
		menuBar.add(fileMenu);
		mainframe.setJMenuBar(menuBar);
		
		panel.setBackground(new java.awt.Color(24, 108, 144));
		panel.setFont(new java.awt.Font("Arial", 1, 11));

		label.setFont(new java.awt.Font("Arial", 1, 16));
		label.setText("Choose an Action:");
		label.setForeground(new java.awt.Color(255, 255, 255));
		

		panel.add(label);
		panel.add(boxLayout);
		

		mainframe.getContentPane().add(panel);
	}
	
	/**
	 * Getter for addButton
	 * 
	 * @return the addButton
	 */
	public JButton getAddButton() {
		return addButton;
	}
	
	/**
	 * Getter for searchButton
	 * @return the searchButton
	 */
	public JButton getSearchButton() {
		return searchButton;
	}
	
	/**
	 * Getter for fileCloseItem
	 * 
	 * @return the fileCloseItem
	 */
	public JMenuItem getFileCloseItem() {
		return fileCloseItem;
	}
	public void addFlightToDesktop(AddFlightJFrameView addFlightJFrameView) {
		addFlightJFrameView.setVisible(true);
		theDesktop.add(addFlightJFrameView);
	}


}
