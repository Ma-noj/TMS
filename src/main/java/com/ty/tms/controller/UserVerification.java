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

import com.ty.tms.dao.UserDao;
import com.ty.tms.dto.User;

@WebServlet(value = "/login-verification")
public class UserVerification extends HttpServlet {
	UserDao userDao = new UserDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		String userName = req.getParameter("user_name");
		String userEmail = req.getParameter("user_email");
		String password = req.getParameter("user_password");

		User user = userDao.findUserByEmailPassWord(userEmail, password);
		System.out.println(user);
		if (user != null) {
			String role = user.getRole();
			if (role.equalsIgnoreCase("manager")) {

				printWriter.print("<h1>Manager logged in</h1>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("manager.jsp");
				dispatcher.include(req, resp);
			} else if (role.equalsIgnoreCase("employee")) {
				printWriter.print("<h1>Employee logged in</h1>");
				req.setAttribute("user_id", user.getId());
				RequestDispatcher dispatcher = req.getRequestDispatcher("find");
				dispatcher.forward(req, resp);

			printWriter.print("<h1>Manager logged in</h1>");

				List<User> userlist = userDao.fetchAllUser();
				req.setAttribute("employeeList", userlist);

				RequestDispatcher dispatcher1 = req.getRequestDispatcher("manager.jsp");
				dispatcher1.include(req, resp);

			} else if (role.equalsIgnoreCase("employee")) {
				printWriter.print("<h1>Employee logged in</h1>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
				dispatcher.include(req, resp);
			}
		} else {
			printWriter.print("<h1>Get Lost</h1>");

		}

	}
}
