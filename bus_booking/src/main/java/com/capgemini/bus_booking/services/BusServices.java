package com.capgemini.bus_booking.services;

import java.util.Date;
import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Route;

public interface BusServices {
	public List<Bus> searchBus(Route route, Date date);

	public List<Bus> sortingBus(String sort);

	public List<Bus> modifySearch(String from, String to, Date date);
}
