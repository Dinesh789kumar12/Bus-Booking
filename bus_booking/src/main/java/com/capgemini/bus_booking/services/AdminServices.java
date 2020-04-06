package com.capgemini.bus_booking.services;

import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;

public interface AdminServices {
	public Map<String, Bus> addBus();

	public Map<String, Route> addRoute();

	public Map<String, Bus> changeTiming();

	public Map<String, Bus> cancelBus();

	public Map<String, Route> cancelRoute();

	public Map<String, Bus> updateBusTiming();

	public Map<String, Route> updateRoute();

	public Map<String, Reserve> generateReport();
}
