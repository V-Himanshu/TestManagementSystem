package com.testapp.dao;

import java.util.List;

import com.testapp.model.Questions;
import com.testapp.model.UserData;

public interface InsertDao {
	
	void insertUserRegistrationData(UserData userData);
	
	void insertQuestionsFromExcelToDb(List<Questions> questions);

}
