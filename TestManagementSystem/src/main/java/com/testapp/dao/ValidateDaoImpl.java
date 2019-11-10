package com.testapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.testapp.model.LoginData;

public class ValidateDaoImpl implements ValidateDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public LoginData validateLoginProcess(LoginData loginData) {

		String sql = "select * from Login where vch_username=? and vch_password=? and ch_active_status='y'";
		List<LoginData> list = jdbcTemplate.query(sql, new Object[] {loginData.getUsername(), loginData.getPassword() }, new RowMapper<LoginData>() {

			public LoginData mapRow(ResultSet rs, int rowNum) throws SQLException {
				LoginData data = new LoginData();
				data.setUsername(rs.getString("vch_username"));
				data.setPassword(rs.getString("vch_password"));
				return data;
			}
			
		});
		
		return list.size() > 0 ? list.get(0) : null;

	}

}
