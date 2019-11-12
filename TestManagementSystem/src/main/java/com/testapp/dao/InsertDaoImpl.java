package com.testapp.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.testapp.model.Questions;
import com.testapp.model.UserData;

public class InsertDaoImpl implements InsertDao {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insertUserRegistrationData(UserData userData) {
//
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/TestManagementSystem");
//		dataSource.setUsername("root");
//		dataSource.setPassword("");
//
//		jdbcTemplate = new JdbcTemplate(dataSource);

		String sql1 = "insert into User_data(vch_user_id,vch_name,vch_email_id,bint_phone_number) values(?,?,?,?)";
		String sql2 = "insert into Login(vch_user_id,vch_username,vch_password) values(?,?,?)";
		jdbcTemplate.update(sql1, userData.getUserId(), userData.getName(), userData.getEmail(),
				userData.getPhone());
		jdbcTemplate.update(sql2, userData.getUserId(), userData.getUsername(), userData.getPassword());
//		int num = jdbcTemplate.update(sql1, "himanshulodha10@gmail.com", "Hpj97", "himanshu");
//		System.out.println(num1 + " " + num2);

	}

	public void insertQuestionsFromExcelToDb(List<Questions> questions) {
		
		
	}

}
