package com.ty.tms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.dao.UserDao;
import com.ty.tms.dto.User;

@WebServlet(value = "/sign_up")
public class UserSignUp extends HttpServlet{
	UserDao userDao=new UserDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id= Integer.parseInt( req.getParameter("user_id"));  
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String password=req.getParameter("user_password");
		
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole("employee");
		userDao.saveUser(user);
		
		List<User> userlist = userDao.fetchAllUser();
		req.setAttribute("employeeList", userlist);
		RequestDispatcher dispatcher = req.getRequestDispatcher("manager.jsp");
		dispatcher.include(req, resp);
		
	}
}
