package com.flightreservationsystem.presentation;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 * The Main Driver Class is responsible for starting the GUI for the Flight Management System
 * @author ALYSHA
 *
 */
public class MainGUIJFrameView extends JFrame {

	
	private static final long serialVersionUID = 1L;

	private JDesktopPane theDesktop = new JDesktopPane();
	private JMenuBar menuBar;
	private JMenu loginMenu, addMenu, searchMenu;
	private JLabel welcomeLabel, label;
	private JMenuItem login, register, exitApplication, addFlight, addAirplane, searchFlight, searchAirplane;

	/**
	 * Creates the first object of the application and instantiates the Main View
	 */
	public MainGUIJFrameView() {

		super("Flight Management System");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createGUIComponents();

		setSize(800, 400);
		setVisible(true);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Creates all the required components of the Main GUI page
	 */
	private void createGUIComponents() {
		
		menuBar = new JMenuBar();
		super.setJMenuBar(menuBar);
		loginMenu = new JMenu("Login");
		loginMenu.setFont(new java.awt.Font("Arial", 1, 14));
		register = new JMenuItem("Register");
		register.setFont(new java.awt.Font("Arial", 1, 14));
		login = new JMenuItem("Login");
		login.setFont(new java.awt.Font("Arial", 1, 14));
		exitApplication = new JMenuItem("Exit");
		exitApplication.setFont(new java.awt.Font("Arial", 1, 14));

		loginMenu.add(login);
		loginMenu.add(register);
		loginMenu.add(exitApplication);
		menuBar.add(loginMenu);

		addMenu = new JMenu("Add");
		addMenu.setFont(new java.awt.Font("Arial", 1, 14));

		addFlight = new JMenuItem("Add Flight");
		addFlight.setFont(new java.awt.Font("Arial", 1, 14));
		addMenu.add(addFlight);
		
		addAirplane = new JMenuItem("Add Airplane");
		addAirplane.setFont(new java.awt.Font("Arial", 1, 14));
		addMenu.add(addAirplane);

		menuBar.add(addMenu);

		searchMenu = new JMenu("Search");
		searchMenu.setFont(new java.awt.Font("Arial", 1, 14));

		searchFlight = new JMenuItem("Search Flight");
		searchFlight.setFont(new java.awt.Font("Arial", 1, 14));
		searchMenu.add(searchFlight);
		
		searchAirplane = new JMenuItem("Search Airplane");
		searchAirplane.setFont(new java.awt.Font("Arial", 1, 14));
		searchMenu.add(searchAirplane);

		menuBar.add(searchMenu);

		welcomeLabel = new JLabel();
		welcomeLabel.setText("Welcome to the Flight Management System");
		welcomeLabel.setFont(new java.awt.Font("Arial", 1, 20));
		welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
		welcomeLabel.setBounds(150, 80, 800, 21);

		label = new JLabel();
		label.setFont(new java.awt.Font("Arial", 1, 14));
		label.setText("(Please choose an action from the menu options above.)");
		label.setForeground(new java.awt.Color(255, 255, 255));
		label.setBounds(150, 120, 800, 17);

		theDesktop.setBackground(new java.awt.Color(24, 108, 144));
		theDesktop.add(welcomeLabel);
		theDesktop.add(label);
		theDesktop.setLayout(null);
		getContentPane().add(theDesktop);
	}

	/**
	 * The main method is the starting point of the entire application
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MainGUIJFrameView mainGUIJFrameView = new MainGUIJFrameView();
		MainGUIJFrameController MainGUIJFrameController = new MainGUIJFrameController(mainGUIJFrameView);
	}

	/**
	 * @return the login
	 */
	public JMenuItem getLogin() {
		return login;
	}

	/**
	 * @return the register
	 */
	public JMenuItem getRegister() {
		return register;
	}

	/**
	 * @return the exitApplication
	 */
	public JMenuItem getExitApplication() {
		return exitApplication;
	}

	/**
	 * @return the addFlight
	 */
	public JMenuItem getAddFlight() {
		return addFlight;
	}
	
	/**
	 * @return the addFlight
	 */
	public JMenuItem getAddAirplane() {
		return addAirplane;
	}

	/**
	 * @return the searchFlight
	 */
	public JMenuItem getSearchFlight() {
		return searchFlight;
	}
	
	/**
	 * @return the searchAirplane
	 */
	public JMenuItem getSearchAirplane() {
		return searchAirplane;
	}

	/**
	 * Adds child view to parent view
	 * 
	 * @param searchFlightJFrameView
	 */
	public void addToDesktop(SearchFlightJFrameView searchFlightJFrameView) {
		searchFlightJFrameView.setVisible(true);
		theDesktop.add(searchFlightJFrameView);
	}
	
	/**
	 * Adds child view to parent view
	 * 
	 * @param searchAirplaneJFrameView
	 */
	public void searchAirplaneToDesktop(SearchAirplaneJFrameView searchAirplaneJFrameView) {
		searchAirplaneJFrameView.setVisible(true);
		theDesktop.add(searchAirplaneJFrameView);
	}
	
	/**
	 * Adds child view to parent view
	 * 
	 * @param addFlightJFrameView
	 */
	public void addFlightToDesktop(AddFlightJFrameView addFlightJFrameView) {
		addFlightJFrameView.setVisible(true);
		theDesktop.add(addFlightJFrameView);
	}
	/**
	 * Adds child view to parent view
	 * 
	 * @param addAirplaneJFrameView
	 */
	public void addAirplaneToDesktop(AddAirplaneJFrameView addAirplaneJFrameView) {
		// TODO Auto-generated method stub
		addAirplaneJFrameView.setVisible(true);
		theDesktop.add(addAirplaneJFrameView);
	}
	
	/**
	 * Adds child view to parent view
	 * 
	 * @param loginFlightJFrameView
	 */
	public void addLoginToDesktop(LoginFormJFrameView loginFormJFrameView) {
		// TODO Auto-generated method stub
		loginFormJFrameView.setVisible(true);
		theDesktop.add(loginFormJFrameView);
		
	}
	/**
	 * Adds child view to parent view
	 * 
	 * @param registerFlightJFrameView
	 */
	public void addRegisterUserToDesktop(RegisterUserJFrameView registerUserJFrameView) {
		// TODO Auto-generated method stub
		registerUserJFrameView.setVisible(true);
		theDesktop.add(registerUserJFrameView);
		
	}
	
	
	
	
	

}
