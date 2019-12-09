package com.flightreservationsystem.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservationsystem.model.business.UserMgr;
import com.flightreservationsystem.model.domain.User;

/**
 * RegisterUserJFrameController
 * Listens and handles actions generated from RegisterJFrameView
 * @author Alysha
 *
 */
public class RegisterUserJFrameController implements ActionListener {

	private RegisterUserJFrameView registerUserJFrameView;
	
	/**
	 * Default constructor
	 */
	public RegisterUserJFrameController() {

	}
	/**
	 * Overloaded Constructor
	 * @param registerUserJFrameView
	 */
	RegisterUserJFrameController(RegisterUserJFrameView registerUserJFrameView) {
		this.registerUserJFrameView = registerUserJFrameView;

		registerUserJFrameView.getCancelRegistrationButton().addActionListener(this);
		registerUserJFrameView.getRegisterUserButton().addActionListener(this);
		registerUserJFrameView.getRegisterFileCloseItem().addActionListener(this);
	}
	/**
	 * Overrides ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		System.out.println("Inside RegisterUserJFrameController::actionPerformed");
		// Listens and checks the value of each action and performs the correct logic
		// based on action
		if (event.getSource().equals(registerUserJFrameView.getRegisterFileCloseItem())) {

			System.out.println("register User File menu exit button clicked !!");
			registerFileCloseItem_actionPerformed(event);

		} else if (event.getSource().equals(registerUserJFrameView.getCancelRegistrationButton())) {
			System.out.println("Registration cancel button clicked!!");
			registerCancelButton_actionPerformed(event);

		} else if (event.getSource().equals(registerUserJFrameView.getRegisterUserButton())) {
			System.out.println("Register user button clicked!!");
			
			//Validate User input before RegisterUserButton_actionPerformed
			String emptyPattern = "";
			if ((registerUserJFrameView.getFullNameField().getText().equals(emptyPattern))
					|| (registerUserJFrameView.getFullNameField().getText().equals("ABC"))) {
				System.out.println("Name Field cannot be empty !!");
				registerUserJFrameView.setNameError("Error: Name must be entered!");

			} else if ((registerUserJFrameView.getEmailAddressField().getText().equals(emptyPattern)) ||
			(registerUserJFrameView.getEmailAddressField().getText().equals("abc@gmail.com"))){
				System.out.println("Email address cannot be empty !!");
				registerUserJFrameView.setEmailFormatError("Error: Email Address must be entered!");

			} else if (registerUserJFrameView.getPasswordField().getText().equals(emptyPattern)) {
				System.out.println("Password cannot be empty !!");
				registerUserJFrameView.setPasswordError("Error: Password must be entered!");

			}   
			
			else {
				RegisterUserButton_actionPerformed(event);
			}
		}
	}

	@SuppressWarnings("unused")
	public void RegisterUserButton_actionPerformed(ActionEvent event) {

		// Creates a user object based on user input view
		User user = registerUserJFrameView.getUserData();
		// Get an instance of the User Business Layer facade via the manager
		UserMgr userMgr = UserMgr.getUserMgr();

		if (userMgr != null) {
			// Test creates a user using manager and if passes or true alerts the correct
			// messages
			if (userMgr.create(user)) {

				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Save Confirmation",
						"User was registered successfully");
				AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
						alertMessageJFrameView);
				System.out.println(" User Registration Success!!!");
			} else {
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Save Error",
						"User was not saved.");
				AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
						alertMessageJFrameView);
				System.out.println("User Registration Failed!!!");
			}
		} else {
			AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("System Error",
					"Operation Error.");
			AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(
					alertMessageJFrameView);
			System.out.println(" Error-User Manager Business Facade instance is null ");
		}

	}

	/**
	 * Close window component and exit application
	 * 
	 * @param event
	 */
	private void registerFileCloseItem_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(0);
	}

	/**
	 * Close window component and exit application
	 * 
	 * @param event
	 */
	private void registerCancelButton_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(0);

	};

}
