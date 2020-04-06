package com.capgemini.bus_booking.services;

import java.util.Date;
import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Route;

public interface BusServices {
	public Map<String, Bus> searchBus(Route route, Date date);

	public Map<String, Bus> sortingBus(String sort);

	public Map<String, Bus> modifySearch(String from, String to, Date date);
}
