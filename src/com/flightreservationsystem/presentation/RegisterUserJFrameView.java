package com.flightreservationsystem.presentation;

import com.flightreservationsystem.model.domain.User;
import java.awt.FlowLayout;
import java.util.regex.Pattern;
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

public class RegisterUserJFrameView extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JFrame RegisterMainFrame;
	private JPanel RegisterPanel;
	private JMenuBar RegisterMenuBar;
	private JMenu RegisterMenu;
	private JMenuItem RegisterFileCloseItem;
	private JLabel FullName, EmailAddress, Password;
	private JTextField FullNameField, EmailAddressField, PasswordField;
	private JButton registerUserButton, cancelRegistrationButton;
	private Box RegisterBoxLayout;

	public RegisterUserJFrameView() {

		createGUIComponents();
		RegisterMainFrame.setSize(700, 600);
		RegisterMainFrame.setVisible(true);
		RegisterMainFrame.setResizable(true);
	}

	private void createGUIComponents() {
		RegisterMainFrame = new JFrame("Add User");
		FlowLayout layout = new FlowLayout();
		RegisterPanel = new JPanel(layout);
		RegisterBoxLayout = Box.createHorizontalBox();

		registerUserButton = new JButton("Save");
		registerUserButton.setFont(new java.awt.Font("Arial", 1, 14));

		cancelRegistrationButton = new JButton("Cancel");
		cancelRegistrationButton.setFont(new java.awt.Font("Arial", 1, 14));

		RegisterBoxLayout.add(cancelRegistrationButton);
		RegisterBoxLayout.add(registerUserButton);
		RegisterBoxLayout.setBounds(250, 400, 200, 50);
		RegisterPanel.add(RegisterBoxLayout);

		RegisterMenuBar = new JMenuBar();
		RegisterMenu = new JMenu();
		RegisterFileCloseItem = new JMenuItem();

		RegisterMenu.setText("File");
		RegisterMenu.setFont(new java.awt.Font("Arial", 1, 11));

		RegisterFileCloseItem.setText("Exit");
		RegisterFileCloseItem.setFont(new java.awt.Font("Arial", 1, 11));

		RegisterMenu.add(RegisterFileCloseItem);
		RegisterMenuBar.add(RegisterMenu);
		RegisterMainFrame.setJMenuBar(RegisterMenuBar);

		RegisterPanel.setBackground(new java.awt.Color(24, 108, 144));
		RegisterPanel.setFont(new java.awt.Font("Arial", 1, 11));
		RegisterPanel.setLayout(null);

		FullName = new JLabel();
		FullName.setText("Full Name:");
		FullName.setFont(new java.awt.Font("Arial", 1, 14));
		FullName.setForeground(new java.awt.Color(255, 255, 255));
		FullName.setBounds(40, 80, 120, 17);
		RegisterPanel.add(FullName);

		FullNameField = new JTextField("ABC", 40);
		FullNameField.setBounds(180, 80, 240, 20);
		RegisterPanel.add(FullNameField);

		EmailAddress = new JLabel();
		EmailAddress.setText("Email Address:");
		EmailAddress.setFont(new java.awt.Font("Arial", 1, 14));
		EmailAddress.setForeground(new java.awt.Color(255, 255, 255));
		EmailAddress.setBounds(40, 160, 120, 17);
		RegisterPanel.add(EmailAddress);

		EmailAddressField = new JTextField("abc@gmail.com", 40);
		EmailAddressField.setBounds(180, 160, 240, 20);
		RegisterPanel.add(EmailAddressField);

		Password = new JLabel();
		Password.setText("Password:");
		Password.setFont(new java.awt.Font("Arial", 1, 14));
		Password.setForeground(new java.awt.Color(255, 255, 255));
		Password.setBounds(40, 240, 150, 17);
		RegisterPanel.add(Password);

		PasswordField = new JPasswordField("abc", 40);
		PasswordField.setBounds(180, 240, 240, 20);
		RegisterPanel.add(PasswordField);

		RegisterMainFrame.getContentPane().add(RegisterPanel);

	}

	public JMenuItem getRegisterFileCloseItem() {
		return RegisterFileCloseItem;
	}

	public JTextField getFullNameField() {
		return FullNameField;
	}

	public JTextField getEmailAddressField() {
		return EmailAddressField;
	}

	public JTextField getPasswordField() {
		return PasswordField;
	}

	public JButton getRegisterUserButton() {
		return registerUserButton;
	}

	public JButton getCancelRegistrationButton() {
		return cancelRegistrationButton;
	}

	public void setNameError(String error) {
		FullName.setText(error);
		FullName.setForeground(new java.awt.Color(255, 0, 0));
	}

	public void setPasswordError(String error) {
		Password.setText(error);
		Password.setForeground(new java.awt.Color(255, 0, 0));
	}

	public void setEmailFormatError(String error) {
		EmailAddressField.setText(error);
		EmailAddressField.setForeground(new java.awt.Color(255, 0, 0));
	}

	// check if entered string for email is valid format
	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public User getUserData() {

		String email = "";
		// validate email and save it to email
		if (isValid(EmailAddressField.getText())) {
			email = EmailAddressField.getText();
		} else {
			setEmailFormatError("Invalid Format");
		}

		/**
		 * Create User object based on user input
		 */
		User users = new User(FullNameField.getText(), email, PasswordField.getText());

		return users;
	}

}
