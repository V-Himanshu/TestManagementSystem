package com.testapp.model;

import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class LoginData {

	@NonNull
	@Size(min = 1, max = 50)
	private String username;

	@NonNull
	@Size(min = 1, max = 50)
	private String password;

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "LoginData [username=" + username + ", password=" + password + "]";
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

}
