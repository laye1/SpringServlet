package com.saraya.login;

public class UserValidation {
	
	
	
	public boolean isValid(String username,String password) {
		
		if(username.equalsIgnoreCase("laye") && password.equalsIgnoreCase("ndiaye")) {
			
			return true;
			
		}else {
			
			return false;
		}
	}

}
