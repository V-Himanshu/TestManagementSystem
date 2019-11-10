package com.testapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.testapp.dao.ValidateDao;
import com.testapp.model.LoginData;

public class ValidationServiceImpl implements ValidationService {

	@Autowired
	ValidateDao validateDao;

	public LoginData validateLoginService(LoginData loginData) {

		return validateDao.validateLoginProcess(loginData);
	}

}
