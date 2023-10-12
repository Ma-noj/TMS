package com.ty.tms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.DemoConnectionPool;
import com.ty.tms.dto.User;


public class UserDao {
	DemoConnectionPool pool = new DemoConnectionPool();

	User saveUser(User user) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = pool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user1 values(?,?,?,?,?)");
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getRole());
			preparedStatement.execute();
			pool.reciveconnection(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User findUserById(int id) {
		ResultSet rs = null;
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = pool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user1 where id=?");
			preparedStatement.setInt(1, id);
			rs = preparedStatement.executeQuery();
			preparedStatement.close();
			if (rs.next()) {
				return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		pool.reciveconnection(connection);	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	User updateUser(User user) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = pool.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("UPDATE user1 SET name=?,email=?,password=? WHERE id=?");
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setInt(4, user.getId());
			preparedStatement.executeUpdate();
			pool.reciveconnection(connection);
			return user;
           
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	public List<User> findAllUser() {
		List<User> al=null;
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = pool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from User");
			ResultSet rs=preparedStatement.executeQuery();
			 al= new ArrayList();
			 while(rs.next()) {
				 al.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			 }
			 pool.reciveconnection(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	public User findByEmailAndPassword(String email,String password) {
		ResultSet rs=null;
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = pool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user1 where email=?and password=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			if(rs.next()) {
				return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
			pool.reciveconnection(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean deleteUser(int id) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = pool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from user1 where id=?");
			preparedStatement.setInt(1, id);
			pool.reciveconnection(connection);
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
