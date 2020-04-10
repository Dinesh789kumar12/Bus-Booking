package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Customer;

public interface CustomerDao {
	public void addCustomerDao(Customer lcust);

	public List<Customer> getcustList();

	public Customer findById(int id);

	public Customer findByUsername(String username);
}
