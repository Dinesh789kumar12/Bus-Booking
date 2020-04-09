package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;

public interface BusDao {

	void addbusDao(Bus lbus);

	public List<Bus> getLbusList();

	public Bus findById(int id);

	public void remove(int id);
}
