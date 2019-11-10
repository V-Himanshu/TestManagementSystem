package com.testapp.dao;

import com.testapp.model.LoginData;

public interface ValidateDao {

	LoginData validateLoginProcess(LoginData loginData);
	
}
