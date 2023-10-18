package com.ty.tms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.dao.TaskDao;
import com.ty.tms.dao.UserDao;
import com.ty.tms.dto.User;

@WebServlet(value = "/remove")
public class RemoveEmp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
//		printWriter.print("<h1>hello</h1>");
		int id = Integer.parseInt(req.getParameter("user_id"));
		UserDao userDao = new UserDao();
//		User user = userDao.findUserById(id);
		TaskDao taskDao = new TaskDao();
		taskDao.deleteTaskByUserId(id);
		
		boolean flag=userDao.deleteUser(id);
		System.out.println(flag);
		
		List<User> employeeList = userDao.fetchAllUser();
		req.setAttribute("employeeList", employeeList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("manager.jsp");
		dispatcher.include(req, resp);
	}
}
