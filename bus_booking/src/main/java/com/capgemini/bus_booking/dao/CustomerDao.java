package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Customer;
import com.capgemini.bus_booking.exception.DaoException;

public interface CustomerDao {
	public void addCustomerDao(Customer lcust)throws DaoException;

	public List<Customer> getcustList();

	public Customer findById(int id);

	public Customer findByUsername(String username);
}
