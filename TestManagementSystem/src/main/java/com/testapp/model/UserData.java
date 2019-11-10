package com.testapp.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class UserData {

	@NotNull
	private String userId;

	private char activeStatus;

	@NotNull
	@Size(min = 1, max = 50)
	private String name;

	@NotNull
	@Size(min = 1, max = 50)
	private String username;

	@Email
	private String email;

	@NotNull
	@Size(min = 1, max = 50)
	private String password;

	@NotNull
	@Size(min = 10, max = 10)
	private long phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return email;
	}

	public void setUserId(String userId) {
		this.userId = email;
	}

	@Override
	public String toString() {
		return "UserData [userId=" + userId + ", activeStatus=" + activeStatus + ", name=" + name + ", username="
				+ username + ", email=" + email + ", password=" + password + ", phone=" + phone + "]";
	}

	public char getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(char activeStatus) {
		this.activeStatus = activeStatus;
	}

}
