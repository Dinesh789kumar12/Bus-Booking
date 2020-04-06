package com.capgemini.bus_booking.services;

import java.util.Map;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Customer;

public interface UserServices {

	public Map<String, Customer> forgotPassword();

	public Map<String, Customer> addAdditionalData(String address, String phno);

	public Map<String, Customer> changePassword();

	public Map<String, Customer> loginCustomer();

	public Map<String, Customer> signupCustomer();

	public Map<String, Admin> loginAdmin();

	public Map<String, Admin> signupAdmin();

}
