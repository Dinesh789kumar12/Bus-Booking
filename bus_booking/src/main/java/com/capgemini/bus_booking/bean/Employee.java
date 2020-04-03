package com.capgemini.bus_booking.bean;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_email;
	private String emp_dob;
	private String emp_address;

	public int getEmp_id() {
		return emp_id;
	}

	public Employee(int emp_id, String emp_name, String emp_email, String emp_dob, String emp_address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_email = emp_email;
		this.emp_dob = emp_dob;
		this.emp_address = emp_address;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(String emp_dob) {
		this.emp_dob = emp_dob;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
}
