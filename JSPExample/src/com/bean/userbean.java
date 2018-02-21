package com.bean;

public class userbean {
	public String username;
	public String password;
	public String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void getUserdata()
	{
		System.out.println("This is user data that we can check"+username);
	}
	
}
