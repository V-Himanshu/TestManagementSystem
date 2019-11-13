package com.testapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.testapp.model.Questions;

public class TestDaoImpl implements TestDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void fetchQuestionsFromDatabase(char ch) {
		String sql = "Select * from Questions where vch_question_id like '"+ ch + "%'";
		List<Questions> questions = jdbcTemplate.query(sql, new RowMapper<Questions>() {

			public Questions mapRow(ResultSet rs, int rowNum) throws SQLException {
				Questions question = new Questions();
				question.setQuestionId(rs.getString("vch_question_id"));
				question.setTopic(rs.getString("vch_topic"));
				question.setQuestionDescription(rs.getString("vch_question_description"));
				question.setOption1(rs.getString("vch_option1"));
				question.setOption2(rs.getString("vch_option2"));
				question.setOption3(rs.getString("vch_option3"));
				question.setOption4(rs.getString("vch_option4"));
				question.setOption5(rs.getString("vch_option5"));
				question.setAnswer(rs.getString("vch_option5"));
				question.setOptionType(rs.getString("vch_option_type"));
				return question;
			}
			
		});
		
		System.out.println(questions.size());
		
	}

}
