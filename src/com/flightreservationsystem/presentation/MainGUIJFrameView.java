package com.flightreservationsystem.presentation;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class MainGUIJFrameView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JDesktopPane theDesktop = new JDesktopPane();
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JLabel welcomeLabel, label;
	private JMenuItem adminFunctionsItem, exitApplication;

	/**
	 * Creates the first object of the application and instantiates the Main View
	 */
	public MainGUIJFrameView() {

		super("Flight Management System");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createGUIComponents();

		setSize(800, 800);
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
		fileMenu = new JMenu("File");
		fileMenu.setFont(new java.awt.Font("Arial", 1, 14));
		adminFunctionsItem = new JMenuItem("Admin Functions");
		adminFunctionsItem.setFont(new java.awt.Font("Arial", 1, 14));
		exitApplication = new JMenuItem("Exit");
		exitApplication.setFont(new java.awt.Font("Arial", 1, 14));

		fileMenu.add(adminFunctionsItem);
		fileMenu.add(exitApplication);
		menuBar.add(fileMenu);

		welcomeLabel = new JLabel();
		welcomeLabel.setText("Welcome to the Flight Management System");
		welcomeLabel.setFont(new java.awt.Font("Arial", 1, 16));
		welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
		welcomeLabel.setBounds(150, 80, 800, 17);

		label = new JLabel();
		label.setFont(new java.awt.Font("Georgia", 1, 16));
		label.setText("(Under Construction - For now choose an Action in the Menu Bar)");
		label.setForeground(new java.awt.Color(255, 255, 255));
		label.setBounds(150, 160, 800, 17);

		theDesktop.setBackground(new java.awt.Color(48, 48, 48));
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
	 * @return the adminFunctionsItem
	 */
	public JMenuItem getAdminFunctionsItem() {
		return adminFunctionsItem;
	}

	/**
	 * @return the exitApplication
	 */
	public JMenuItem getExitApplication() {
		return exitApplication;
	}

	/**
	 * Adds child view to parent view
	 * 
	 * @param adminFunctionsJFrameView
	 */
	public void adminFunctionsToDesktop(AdminFunctionsJFrameView adminFunctionsJFrameView) {
		adminFunctionsJFrameView.setVisible(true);
		theDesktop.add(adminFunctionsJFrameView);

	}

}
