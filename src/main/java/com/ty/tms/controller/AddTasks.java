package com.ty.tms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.dao.TaskDao;
import com.ty.tms.dto.Task;

@WebServlet(value="/task")
public class AddTasks extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int task_id = Integer.parseInt(req.getParameter("t_id"));
		String discription = req.getParameter("discription");
		int user_id = Integer.parseInt(req.getParameter("user_id"));
		String created_date_time = LocalDateTime.now().toString();

		Task task = new Task();
		task.setT_id(task_id);
		task.setDicription(discription);
		task.setStatus("Assigned");
		task.setCreated_date_time(created_date_time);
		task.setCompleted_date_time("null");
		task.setUser_id(user_id);
		TaskDao taskDao= new TaskDao();
		taskDao.saveTask(task);
		PrintWriter printWriter= resp.getWriter();
		printWriter.print("<html><body background:solid aqua>");
		printWriter.print("<h1>Task Added successfully</h1>");
		printWriter.print("</body></html>");
	}
}
