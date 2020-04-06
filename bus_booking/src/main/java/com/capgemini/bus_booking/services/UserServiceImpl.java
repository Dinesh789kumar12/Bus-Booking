package com.capgemini.bus_booking.services;

import java.util.Map;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Customer;
import com.capgemini.bus_booking.dao.AdminDaoImpl;
import com.capgemini.bus_booking.dao.CustomerDaoImpl;

public class UserServiceImpl implements UserServices {

	@Override
	public Map<String, Customer> forgotPassword() {

		return null;
	}

	@Override
	public Map<String, Customer> addAdditionalData(String address, String phno) {

		return null;
	}

	@Override
	public Map<String, Customer> changePassword() {

		return null;
	}

	@Override
	public boolean loginCustomer(String userName, String password) {
		boolean check = false;
		for (Map.Entry me : new CustomerDaoImpl().getHcustomer().entrySet()) {
			Customer j = (Customer) me.getValue();
			if (me.getKey().equals(userName) && j.getCust_id() == Integer.parseInt(password)) {
				System.out.println("Welcome to Login Page");
				check = true;
			}
		}
		return check;
	}

	@Override
	public Map<String, Customer> signupCustomer() {

		return null;
	}

	@Override
	public boolean loginAdmin(String userName, String password) {
		boolean check = false;
		for (Map.Entry me : new AdminDaoImpl().getHadmin().entrySet()) {
			Admin j = (Admin) me.getValue();
			if (me.getKey().equals(userName) && j.getAdmin_id() == Integer.parseInt(password)) {
				check = true;
			}
		}
		return check;
	}

	@Override
	public Map<String, Admin> signupAdmin() {

		return null;
	}

}
