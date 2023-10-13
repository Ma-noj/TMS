package com.ty.tms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.dao.TaskDao;
import com.ty.tms.dto.Task;
@WebServlet(value="/view")
public class ViewAllTask extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TaskDao taskDao = new TaskDao();
		List<Task> listTask = taskDao.fecthAllTask();
		req.setAttribute("list_task", listTask);
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("viewTask.jsp");
		requestDispatcher.forward(req, resp);
	}

}
