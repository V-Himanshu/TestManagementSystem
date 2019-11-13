package com.testapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.testapp.dao.TestDao;

public class TestServiceImpl implements TestService{

	@Autowired
	TestDao testDao;
	
	public void fetchQuestionsFromDatabase() {
		testDao.fetchQuestionsFromDatabase('H');
		testDao.fetchQuestionsFromDatabase('E');
		testDao.fetchQuestionsFromDatabase('M');
		
	}

}
