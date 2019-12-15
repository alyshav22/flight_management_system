package com.flightreservationsystem.presentation;

import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFormJFrameView extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	
	private JFrame LoginFrame;
	private JPanel LoginPanel;
	private JMenuBar LoginMenuBar;
	private JMenu LoginMenu;
	private JMenuItem LoginMenuCloseItem;
	private JLabel EmailAddress, Password;
	private JTextField EmailAddressField, PasswordField;
	private JButton LoginButton, cancelLoginButton;
	private Box LoginBoxLayout;
	
	/**
	 * Default constructor
	 */
	public LoginFormJFrameView() {

		createGUIComponents();
		LoginFrame.setSize(600, 600);
		LoginFrame.setVisible(true);
		LoginFrame.setResizable(true);
	}
	
	/**
	 * Creates all the required components of the Login Form page
	 */
	private void createGUIComponents() {
		LoginFrame = new JFrame("Login");
		FlowLayout layout = new FlowLayout();
		LoginPanel = new JPanel(layout);
		LoginBoxLayout = Box.createHorizontalBox();

		LoginButton = new JButton("Login");
		LoginButton.setFont(new java.awt.Font("Arial", 1, 14));

		cancelLoginButton = new JButton("Cancel");
		cancelLoginButton.setFont(new java.awt.Font("Arial", 1, 14));

		LoginBoxLayout.add(cancelLoginButton);
		LoginBoxLayout.add(LoginButton);
		LoginBoxLayout.setBounds(200, 400, 200, 50); // 600 450 200 50
		LoginPanel.add(LoginBoxLayout);

		LoginMenuBar = new JMenuBar();
		LoginMenu = new JMenu();
		LoginMenuCloseItem = new JMenuItem();

		LoginMenu.setText("File");
		LoginMenu.setFont(new java.awt.Font("Arial", 1, 11));

		LoginMenuCloseItem.setText("Exit");
		LoginMenuCloseItem.setFont(new java.awt.Font("Arial", 1, 11));

		LoginMenu.add(LoginMenuCloseItem);
		LoginMenuBar.add(LoginMenu);
		LoginFrame.setJMenuBar(LoginMenuBar);

		LoginPanel.setBackground(new java.awt.Color(48, 48, 48));
		LoginPanel.setFont(new java.awt.Font("Arial", 1, 11));
		LoginPanel.setLayout(null);

		EmailAddress = new JLabel();
		EmailAddress.setText("Email Address:");
		EmailAddress.setFont(new java.awt.Font("Arial", 1, 14));
		EmailAddress.setForeground(new java.awt.Color(255, 255, 255));
		EmailAddress.setBounds(40, 160, 120, 17);
		LoginPanel.add(EmailAddress);

		EmailAddressField = new JTextField("", 40);
		EmailAddressField.setBounds(180, 160, 240, 20);
		LoginPanel.add(EmailAddressField);

		Password = new JLabel();
		Password.setText("Password:");
		Password.setFont(new java.awt.Font("Arial", 1, 14));
		Password.setForeground(new java.awt.Color(255, 255, 255));
		Password.setBounds(40, 240, 150, 17);
		LoginPanel.add(Password);

		PasswordField = new JPasswordField("", 40);
		PasswordField.setBounds(180, 240, 240, 20);
		LoginPanel.add(PasswordField);

		LoginFrame.getContentPane().add(LoginPanel);
	}

	public JMenuItem getLoginMenuCloseItem() {
		return LoginMenuCloseItem;
	}

	public void setLoginMenuCloseItem(JMenuItem LoginMenuCloseItem) {
		this.LoginMenuCloseItem = LoginMenuCloseItem;
	}

	public JTextField getEmailAddressField() {
		return EmailAddressField;
	}

	public void setEmailAddressField(JTextField EmailAddressField) {
		this.EmailAddressField = EmailAddressField;
	}

	public JTextField getPasswordField() {
		return PasswordField;
	}

	public void setPasswordField(JTextField PasswordField) {
		this.PasswordField = PasswordField;
	}

	public JButton getLoginButton() {
		return LoginButton;
	}

	public JButton getCancelLoginButton() {
		return cancelLoginButton;
	}

	void setEmailError(String error) {
		EmailAddressField.setText(error);
		EmailAddressField.setForeground(new java.awt.Color(255, 0, 0));

	}

	void setPasswordError(String error) {
		PasswordField.setText(error);
		PasswordField.setForeground(new java.awt.Color(255, 0, 0));
	}

}
