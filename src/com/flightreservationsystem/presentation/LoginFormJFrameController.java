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


class LoginFormJFrameController implements ActionListener{
     private LoginFormJFrameView loginFormJFrameView;
    
    public LoginFormJFrameController() {

	}

    LoginFormJFrameController(LoginFormJFrameView loginFormJFrameView) {
        
            this.loginFormJFrameView = loginFormJFrameView;
             
             loginFormJFrameView.getCancelLoginButton().addActionListener(this);
             loginFormJFrameView.getLoginButton().addActionListener(this);
             loginFormJFrameView.getLoginMenuCloseItem().addActionListener(this);
    }
    
      @Override
	public void actionPerformed(ActionEvent event) {
		
		System.out.println("Inside RegisterUserJFrameController::actionPerformed");
		// Listens and checks the value of each action and performs the correct logic based on action
		if (event.getSource().equals(loginFormJFrameView.getLoginMenuCloseItem())) {
                    
			System.out.println("Login User File menu exit button clicked !!");
			registerFileCloseItem_actionPerformed(event);
                        
		} else if (event.getSource().equals(loginFormJFrameView.getCancelLoginButton())) {
			System.out.println("Login cancel button clicked!!");
			registerCancelButton_actionPerformed(event);
                        
		} else if (event.getSource().equals(loginFormJFrameView.getLoginButton())) {
			System.out.println("Login  button clicked!!");
                        
                        
			if ((loginFormJFrameView.getEmailAddressField().getText().isEmpty())
					|| (loginFormJFrameView.getEmailAddressField().getText().equals(""))) {
				System.out.println("Email Field cannot be empty !!");
				loginFormJFrameView.setEmailError("Error: Email must be entered!");
                                
			}  else if (loginFormJFrameView.getPasswordField().getText().isEmpty()) {
				System.out.println("Password cannot be empty !!");
				loginFormJFrameView.setPasswordError("Error: Password must be entered!");
                                
			} else{
                            loginUserButton_actionPerformed(event);
                        }
                }
        }
        
        @SuppressWarnings("unused")
	public void loginUserButton_actionPerformed(ActionEvent event) {
		UserMgr userMgr = UserMgr.getUserMgr();
                
                if(userMgr != null) {
			User user = userMgr.queryUser(loginFormJFrameView.getEmailAddressField().getText());
			if (user == null) {
				AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("Search Error", "User not found.");
			 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
				System.out.println("Search error no user found!!!");
			}else {
			 System.out.println("User Found!!!");
			 System.out.println(user.toString());
			 
		 }
			
		}else {
			 AlertMessageJFrameView alertMessageJFrameView = new AlertMessageJFrameView("System Error", "Operation Error.");
		 	AlertMessageJFrameController alertMessageJFrameController = new AlertMessageJFrameController(alertMessageJFrameView);
			 System.out.println(" Error-Exhibit Manager Business Facade instance is null ");
		 }
	}

	/**
	 * Close window component and exit application
	 * @param event
	 */
	private void registerFileCloseItem_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(1);
	}

	/**
	 * Close window component and exit application
	 * @param event
	 */
	private void registerCancelButton_actionPerformed(ActionEvent event) {
		System.out.println("quitting application ");
		System.exit(1);

	};
    
}
