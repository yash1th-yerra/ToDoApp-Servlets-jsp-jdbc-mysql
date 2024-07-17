package com.learnings.todoapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.learnings.todoapp.model.User;
import com.learnings.todoapp.utils.JDBCUtils;

public class UserDao {
	
	public int registerEmployee(User employee) throws ClassNotFoundException,SQLException {
		String insert_sq = "INSERT INTO users "+" (first_name,last_name,username,password) VALUES (?,?,?,?);";
		int result = 0;
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insert_sq);
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUsername());
			preparedStatement.setString(4, employee.getPassword());
			result = preparedStatement.executeUpdate();	
			
			return result;
			
		
	}

}
