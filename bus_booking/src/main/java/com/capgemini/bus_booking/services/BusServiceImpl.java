package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.dao.BusDaoImpl;

public class BusServiceImpl implements BusService {

	private BusDaoImpl bsdaoimpl = new BusDaoImpl();

	@Override
	public List<Bus> searchBus(Route route, String date) {
		List<Bus> bs = bsdaoimpl.findByRouteAndDate(route, date);
		return bs;
	}

	@Override
	public List<Bus> sortingBus(String sort) {

		return null;
	}

	@Override
	public int displayFare(Reserve res) {
		Bus bs = bsdaoimpl.getLbusList().stream().filter(p -> p.getId() == res.getBusID()).findAny().orElse(null);
		int price = bs.getFare() * res.getSeat();
		return price;
	}

	public boolean addBus(int id, int routeID, boolean ac, int fare, String departureTime, String arrivalTime,
			int availablityCount) {
		Bus bs = new Bus(id, routeID, ac, fare, arrivalTime, departureTime, availablityCount);
		bsdaoimpl.addbusDao(bs);
		return true;
	}

	@Override
	public void cancelBus(int busId) {
		Bus res = new BusDaoImpl().findById(busId);
		bsdaoimpl.remove(busId);
	}

	@Override
	public List<Bus> updateBusTiming() {
		return null;
	}
}
