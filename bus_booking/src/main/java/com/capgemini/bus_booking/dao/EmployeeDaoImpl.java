package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> lemp = new ArrayList<Employee>();

	public EmployeeDaoImpl() {
		super();
		lemp.add(new Employee(1, "Tina", "tina23@gmail.com", "03-02-1989", "Villaspur"));
		lemp.add(new Employee(2, "Aparna", "aparna067@gmail.com", "09-06-1997", "Karanataka"));
	}

	@Override
	public List<Employee> addEmployeeDao() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getLemp() {
		return lemp;
	}

	public void setLemp(List<Employee> lemp) {
		this.lemp = lemp;
	}

}
