package com.security.models;

public class AuthRequestModel {

	private String userName;
	private String password;
	public AuthRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthRequestModel(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
