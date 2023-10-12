package com.ty.tms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.DemoConnectionPool;
import com.ty.tms.dto.Task;

public class TaskDao {
	DemoConnectionPool pool = new DemoConnectionPool();
	Task saveUser(Task task) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = pool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user1 values(?,?,?,?,?)");
			preparedStatement.setInt(1, task.getT_id());
			preparedStatement.setString(2, task.getDicription());
			preparedStatement.setString(3, task.getStatus());
			preparedStatement.setString(4, task.getCompleted_date_time());
			preparedStatement.setString(4, task.getCreated_date_time());
			preparedStatement.setInt(6, task.getUser_id());
			preparedStatement.execute();
			pool.reciveconnection(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return task;
	}
	
}
