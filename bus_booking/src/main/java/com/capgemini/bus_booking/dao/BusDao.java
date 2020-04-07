package com.capgemini.bus_booking.dao;

import java.util.List;
import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Customer;

public interface BusDao {
	public void addbusDao(List<Bus> lbus);

	public List<Bus> getLbusList();

	public Bus findById(int id);

	public void remove(int id);
}
