package com.ty.tms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.connection.DemoConnectionPool;
import com.ty.tms.dto.User;


public class UserDao {

	public User saveUser(User user) {
		try {
			Class.forName("org.postresql.Driver");
			Connection connection = DemoConnectionPool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user1 values(?,?,?,?,?)");
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getRole());

			preparedStatement.execute();
			DemoConnectionPool.reciveconnection(connection);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public User findUserById(int id) {
		ResultSet resultSet = null;
		try {
			Class.forName("org.postresql.Driver");
			Connection connection = DemoConnectionPool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user1 where id=?");
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			DemoConnectionPool.reciveconnection(connection);
			if (resultSet.next()) {
				return new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public User findUserByEmailPassWord(String email, String password) {
		ResultSet resultSet = null;
		try {
			Class.forName("org.postresql.Driver");
			Connection connection = DemoConnectionPool.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from user1 where email=? and password=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			DemoConnectionPool.reciveconnection(connection);
			if (resultSet.next()) {
				return new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public List<User> fetchAllUser() {
		ResultSet resultSet = null;
		List<User> userList = new ArrayList<>();
		try {
			Class.forName("org.postresql.Driver");
			Connection connection = DemoConnectionPool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user1");
			resultSet = preparedStatement.executeQuery();
			DemoConnectionPool.reciveconnection(connection);
			if (resultSet.next()) {
				userList.add(new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;

	}

	public User updateUser(User user) {
		try {
			Class.forName("org.postresql.Driver");
			Connection connection = DemoConnectionPool.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("update user1 set name=?,email=?,password=? where id=?");
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setInt(4, user.getId());
			preparedStatement.executeUpdate();
			DemoConnectionPool.reciveconnection(connection);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public boolean deleteUser(int id) {
		try {
			Class.forName("org.postresql.Driver");
			Connection connection = DemoConnectionPool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from user1 where id=?");
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			DemoConnectionPool.reciveconnection(connection);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
