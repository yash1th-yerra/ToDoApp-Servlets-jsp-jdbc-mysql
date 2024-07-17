package com.learnings.todoapp.model;

import java.sql.SQLException;
import java.util.List;

import com.learnings.todoapp.model.Todo;

public interface TodoImpl {
	void insertTodo(Todo todo) throws SQLException;

	Todo selectTodo(long todoId);

	List<Todo> selectAllTodos();

	boolean deleteTodo(int id) throws SQLException;

	boolean updateTodo(Todo todo) throws SQLException;

}
