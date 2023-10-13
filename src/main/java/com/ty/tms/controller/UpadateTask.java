package com.ty.tms.controller;

import java.io.IOException;
import java.time.LocalDateTime;
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

@WebServlet(value = "/update")
public class UpadateTask extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * TaskDao taskDao= new TaskDao(); List<Task> taskList =
		 * taskDao.findTaskByUserId((Integer) req.getAttribute("user_id")); for (Task
		 * task2 : taskList) { task2.setStatus("completed"); taskDao.updateTask(task2);
		 * }
		 * 
		 * 
		 * System.out.println("task updated"); }
		 */
		TaskDao dao = new TaskDao();
		Task task = dao.findTaskById(Integer.parseInt(req.getParameter("taskId")));
		task.setCompleted_date_time(LocalDateTime.now().toString());
		task.setStatus("completed");
		dao.updateTask(task);
		List<Task> listOfTask = dao.findTaskByUserId(task.getUser_id());
		Comparator<Task> comparator=(Task task1,Task task2)->{
			return task1.getStatus().compareTo(task2.getStatus());
		};
		Collections.sort(listOfTask,comparator);
		req.setAttribute("listOfTask", listOfTask);
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("employee.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}
