//package com.testapp.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Configuration
//public class BeanConfig {
//	
//	
//
//	@Bean
//	JdbcTemplate jdbc() {
//		return new JdbcTemplate(dataSource());
//	}
//	
//	DriverManagerDataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("dbc:mysql://localhost:3306/TestManagementSystem");
//		dataSource.setUsername("root");
//		dataSource.setPassword("");
//		return dataSource;
//		
//	}
//}
