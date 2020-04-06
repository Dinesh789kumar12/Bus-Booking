package com.capgemini.bus_booking.services;

import java.util.List;
import java.util.Map;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Customer;

public interface UserServices {

	public List<Customer> forgotPassword();

	public List<Customer> addAdditionalData(String address, String phno);

	public List<Customer> changePassword();

	public boolean loginCustomer(String userName, String password);

	public void signupCustomer(List<Customer> cst);

	public boolean loginAdmin(String userName, String password);

	public void signupAdmin(List<Admin> admin);

}
