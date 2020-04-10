package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Route;

public interface BusDao {

	void addbusDao(Bus lbus);

	public List<Bus> getLbusList();

	public Bus findById(int id);

	public void remove(int id);

	public  List<Bus> findByRouteAndDate(Route route, String date);

}
