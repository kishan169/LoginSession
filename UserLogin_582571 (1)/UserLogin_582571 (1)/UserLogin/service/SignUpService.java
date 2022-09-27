package com.foodApp.UserLogin.service;

import com.foodApp.UserLogin.exception.LoginException;
import com.foodApp.UserLogin.model.SignUp;

public interface SignUpService {
	
	public SignUp createNewSignUp(SignUp signUp) throws LoginException;;
	
	public SignUp updateSignUpDetails(SignUp signUp,String key) throws LoginException;;

}
