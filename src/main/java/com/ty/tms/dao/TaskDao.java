package com.ty.tms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.DemoConnectionPool;
import com.ty.tms.dto.Task;
import com.ty.tms.dto.User;
import com.ty.tms.service.ConnectionPool;

public class TaskDao {
	// DemoConnectionPool pool = new DemoConnectionPool();
	String path="org.postgresql.Driver";
	public Task saveTask(Task task) {
		try {
			Class.forName(path);
			Connection connection = DemoConnectionPool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into task values(?,?,?,?,?,?)");
			preparedStatement.setInt(1, task.getT_id());
			preparedStatement.setString(2, task.getDicription());
			preparedStatement.setString(3, task.getStatus());
			preparedStatement.setString(4, task.getCompleted_date_time());
			preparedStatement.setString(5, task.getCreated_date_time());
			preparedStatement.setInt(6, task.getUser_id());
			preparedStatement.execute();
			DemoConnectionPool.reciveconnection(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return task;
	}

	public Task findTaskById(int t_id) {
		ResultSet resultSet = null;
		try {
			Class.forName(path);
			Connection connection = ConnectionPool.getConnectionObject();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from task where t_id=?");
			preparedStatement.setInt(1, t_id);
			resultSet = preparedStatement.executeQuery();
			ConnectionPool.receiveConnectionObject(connection);
			if (resultSet.next()) {
				return new Task(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public List<Task> findTaskByUserId(int user_id) {
		ResultSet resultSet = null;
		List<Task> taskList = new ArrayList<Task>();
		try {
			Class.forName(path);
			Connection connection = ConnectionPool.getConnectionObject();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from task where user_id=?");
			preparedStatement.setInt(1, user_id);
			resultSet = preparedStatement.executeQuery();
			ConnectionPool.receiveConnectionObject(connection);
			while (resultSet.next()) {
				taskList.add(new Task(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taskList;

	}

	// rewrite
	public Task updateTask(Task task) {
		try {
			Class.forName(path);
			Connection connection = ConnectionPool.getConnectionObject();
			PreparedStatement preparedStatement = connection.prepareStatement("update task set status=? where t_id=? ");
			preparedStatement.setString(1, task.getStatus());
			preparedStatement.setInt(2, task.getT_id());
			preparedStatement.executeUpdate();
			ConnectionPool.receiveConnectionObject(connection);
			return task;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean deleteTask(int id) {
		try {
			Class.forName(path);
			Connection connection = ConnectionPool.getConnectionObject();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from task where t_id=?");
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			ConnectionPool.receiveConnectionObject(connection);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public List<Task> fecthAllTask(){
		ResultSet resultSet = null;
		List<Task> taskList = new ArrayList<>();
		try {
			Class.forName(path);
			Connection connection = ConnectionPool.getConnectionObject();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from task");
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				taskList.add(new Task(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6)));
			}
			ConnectionPool.receiveConnectionObject(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taskList;
	}

}
