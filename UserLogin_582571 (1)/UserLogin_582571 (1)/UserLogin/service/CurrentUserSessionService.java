package com.foodApp.UserLogin.service;

import com.foodApp.UserLogin.exception.LoginException;
import com.foodApp.UserLogin.model.CurrentUserSession;
import com.foodApp.UserLogin.model.SignUp;

public interface CurrentUserSessionService {
	
	public CurrentUserSession getCurrentUserSession(String key) throws LoginException;;
	public Integer getCurrentUserSessionId(String key) throws LoginException;;
	
	public SignUp getSignUpDetails(String key) throws LoginException;;
	

}
