package com.capgemini.bus_booking.dao;

import com.capgemini.bus_booking.bean.Customer;

public interface CustomerDao {
	public void addCustomerDao(Customer cust);

	public Customer findById(int id);

	public Customer findByUsername(String username);
}
