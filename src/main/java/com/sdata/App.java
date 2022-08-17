package com.sdata;

import java.util.ResourceBundle;

public class App {

	public int UserLogin(String User, String Pwd)
	{
	
		// This is the Login function //
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String Uname=rb.getString("username");
	String Pawd=rb.getString("password");
	
	if(User.equals(Uname) && Pwd.equals(Pawd))
	
		return 1;
	
	else
		return 0;
	}
}
