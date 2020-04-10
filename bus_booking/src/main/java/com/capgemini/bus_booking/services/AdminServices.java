package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;

public interface AdminServices {
	public List<Bus> addBus();

	public List<Route> addRoute();

	public List<Bus> changeTiming();

	public void cancelBus(int busId);

	public void cancelRoute(int routeId);

	public List<Bus> updateBusTiming();

	public List<Route> updateRoute();

	public List<Reserve> generateReport();

	public List<Integer> checkSeatByBusDate(int bid, String date);
}
