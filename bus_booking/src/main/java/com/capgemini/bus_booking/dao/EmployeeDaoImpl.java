package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	ArrayList<Employee> lemployee = new ArrayList<Employee>();

	@Override
	public List<Employee> addEmployee() {
		// TODO Auto-generated method stub
		lemployee.add(new Employee(1, "Tina", "tina23@gmail.com", "03-02-1989", "Villaspur"));
		lemployee.add(new Employee(2, "Aparna", "aparna067@gmail.com", "09-06-1997", "Karanataka"));
		return lemployee;
	}

	public ArrayList<Employee> getLemployee() {
		return lemployee;
	}

	public void setLemployee(ArrayList<Employee> lemployee) {
		this.lemployee = lemployee;
	}

}
