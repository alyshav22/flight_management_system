/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightreservationsystem.presentation;

import com.flightreservationsystem.model.business.UserMgr;
import com.flightreservationsystem.model.domain.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterUserJFrameController implements ActionListener {
    
    private RegisterUserJFrameView registerUserJFrameView;
    
    public RegisterUserJFrameController() {

	}
    //Overloaded Constructor
    RegisterUserJFrameController(RegisterUserJFrameView registerUserJFrameView) {
             this.registerUserJFrameView = registerUserJFrameView;
             
             registerUserJFrameView.getCancelRegistrationButton().addActionListener(this);
             registerUserJFrameView.getRegisterUserButton().addActionListener(this);
             registerUserJFrameView.getRegisterFileCloseItem().addActionListener(this);
    }
    
        @Override
	public void actionPerformed(ActionEvent event) {
		
		System.out.println("Inside RegisterUserJFrameController::actionPerformed");
		// Listens and checks the value of each action and performs the correct logic based on action
		if (event.getSource().equals(registerUserJFrameView.getRegisterFileCloseItem())) {
                    
			System.out.println("register User File menu exit button clicked !!");
			registerFileCloseItem_actionPerformed(event);
                        
		} else if (event.getSource().equals(registerUserJFrameView.getCancelRegistrationButton())) {
			System.out.println("Registration cancel button clicked!!");
			registerCancelButton_actionPerformed(event);
                        
		} else if (event.getSource().equals(registerUserJFrameView.getRegisterUserButton())) {
			System.out.println("Register user button clicked!!");
                        
                        
			if ((registerUserJFrameView.getFullNameField().getText().isEmpty())
					|| (registerUserJFrameView.getFullNameField().getText().equals(""))) {
				System.out.println("Name Field cannot be empty !!");
				registerUserJFrameView.setNameError("Error: Name must be entered!");
                                
			} else if (registerUserJFrameView.getEmailAddressField().getText().isEmpty()) {
				System.out.println("Email address cannot be empty !!");
				registerUserJFrameView.setEmailFormatError("Error: Email Address must be entered!");
                                
			} else if (registerUserJFrameView.getPasswordField().getText().isEmpty()) {
				System.out.println("Password cannot be empty !!");
				registerUserJFrameView.setPasswordError("Error: Password must be entered!");
                                
			} else if (registerUserJFrameView.getConfirmPasswordField().getText().isEmpty()) {
				System.out.println("Confirm password field cannot be empty !!");
				registerUserJFrameView.setConfirmPasswordError("Error: Confirm password must be entered!");
			}else{
                            RegisterUserButton_actionPerformed(event);
                        }
                }
        }
        
        @SuppressWarnings("unused")
	public void RegisterUserButton_actionPerformed(ActionEvent event) {
		
		// Creates a user object based on user input view
		User user = registerUserJFrameView.getUserData();
		// Get an instance of the Exhibit Business Layer facade via the manager
		UserMgr userMgr = UserMgr.getUserMgr();

		if (userMgr != null) {
			// Test creates a user using manager and if passes or true alerts the correct messages
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
	 * @param event
	 */
	private void registerFileCloseItem_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(0);
	}

	/**
	 * Close window component and exit application
	 * @param event
	 */
	private void registerCancelButton_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(0);

	};
}
   

