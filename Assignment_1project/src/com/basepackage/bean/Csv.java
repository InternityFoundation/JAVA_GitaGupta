package com.basepackage.bean;

public class Csv {
	
	private  String username;
	private  String password;
	private int phone_no;
	private String job_status;
	private  String company;
	
	// never take method in csv 
	public  Csv(String username, String password, int phone_no, String job_status, String company) {
		this.username = username;
		this.password = password;
		this.phone_no = phone_no;
		this.job_status = job_status;
		this.company = company;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getJob_status() {
		return job_status;
	}

	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}