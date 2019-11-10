package com.testapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.testapp.dao.InsertDao;
import com.testapp.model.UserData;

public class InsertServiceImpl implements InsertService{

	@Autowired
	InsertDao insertDao;
	
	
	public void insertUserRegistrationData(UserData userData) {
		
		
		insertDao.insertUserRegistrationData(userData);
		
	}

}
