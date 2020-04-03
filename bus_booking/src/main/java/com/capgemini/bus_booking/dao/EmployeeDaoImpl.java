package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	HashMap<String, Employee> hemployee = new HashMap<String, Employee>();

	@Override
	public Map<String, Employee> addEmployee() {
		// TODO Auto-generated method stub
		hemployee.put("hitesh", new Employee(1, "Tina", "tina23@gmail.com", "03-02-1989", "Villaspur"));
		hemployee.put("gaurav", new Employee(2, "Aparna", "aparna067@gmail.com", "09-06-1997", "Karanataka"));
		return hemployee;
	}
}
