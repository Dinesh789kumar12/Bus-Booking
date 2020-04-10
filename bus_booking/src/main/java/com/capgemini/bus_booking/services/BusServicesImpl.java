package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.dao.BusDaoImpl;

public class BusServicesImpl implements BusServices {

	@Override
	public List<Bus> searchBus(Route route, String date) {
		List<Bus> bs = new BusDaoImpl().findByRouteAndDate(route, date);
		return bs;
	}

	@Override
	public List<Bus> sortingBus(String sort) {

		return null;
	}
}
