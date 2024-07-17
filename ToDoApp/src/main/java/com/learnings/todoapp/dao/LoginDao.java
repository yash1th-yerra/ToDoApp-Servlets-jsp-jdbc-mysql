package com.learnings.todoapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learnings.todoapp.model.LoginBean;
import com.learnings.todoapp.utils.JDBCUtils;

public class LoginDao {
	public boolean validate(LoginBean loginbean) throws ClassNotFoundException,SQLException{
		boolean status = false;
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM users where username= ? and password=?");
		prepareStatement.setString(1,loginbean.getUsername());
		prepareStatement.setString(2,loginbean.getPassword());
		ResultSet rs = prepareStatement.executeQuery();
		status = rs.next();
		return status;
	}

}
