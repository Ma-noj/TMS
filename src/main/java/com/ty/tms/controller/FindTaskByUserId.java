package com.ty.tms.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.dao.TaskDao;
import com.ty.tms.dto.Task;

@WebServlet(value = "/find")
public class FindTaskByUserId extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TaskDao taskDao = new TaskDao();
		List<Task> taskList = taskDao.findTaskByUserId((Integer) req.getAttribute("user_id"));
		Comparator<Task> comparator = (Task task1, Task task2) -> {
			return task1.getStatus().compareTo(task2.getStatus());
		};
		Collections.sort(taskList, comparator);
		req.setAttribute("listOfTask", taskList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		dispatcher.include(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
