package com.ty.tms.dto;

public class Task {
	private int t_id;
	private String dicription;
	private String status;
	private String created_date_time;
	private String completed_date_time;
	private int user_id;
	
	
	

	public Task(int t_id, String dicription, String status, String created_date_time, String completed_date_time,
			int user_id) {
		this.t_id = t_id;
		this.dicription = dicription;
		this.status = status;
		this.created_date_time = created_date_time;
		this.completed_date_time = completed_date_time;
		this.user_id = user_id;
	}

	public Task() {
		
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getDicription() {
		return dicription;
	}

	public void setDicription(String dicription) {
		this.dicription = dicription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_date_time() {
		return created_date_time;
	}

	public void setCreated_date_time(String created_date_time) {
		this.created_date_time = created_date_time;
	}

	public String getCompleted_date_time() {
		return completed_date_time;
	}

	public void setCompleted_date_time(String completed_date_time) {
		this.completed_date_time = completed_date_time;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
