package com.foodApp.UserLogin.service;

import com.foodApp.UserLogin.model.LoginData;
import com.foodApp.UserLogin.exception.LoginException;

public interface LoginService {
	
	public String logInAccount(LoginData loginData) throws LoginException;
	public String logOutFromAccount(String key) throws LoginException;

}
