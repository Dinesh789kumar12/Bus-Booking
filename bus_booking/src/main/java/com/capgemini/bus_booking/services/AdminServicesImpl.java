package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.dao.BusDaoImpl;
import com.capgemini.bus_booking.dao.ReserveDaoImpl;
import com.capgemini.bus_booking.dao.RouteDaoImpl;

public class AdminServicesImpl implements AdminServices {

	@Override
	public List<Bus> addBus() {
		return null;
	}

	@Override
	public List<Route> addRoute() {

		return null;
	}

	@Override
	public List<Bus> changeTiming() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelBus(int busId) {
		Bus res = new BusDaoImpl().findById(busId);
		new BusDaoImpl().remove(busId);
	}

	@Override
	public void cancelRoute(int routeId) {
		Route rou = new RouteDaoImpl().findById(routeId);
		new RouteDaoImpl().remove(routeId);
	}

	@Override
	public List<Bus> updateBusTiming() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Route> updateRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserve> generateReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> checkSeatByBusDate(int bid, String date) {
		List<Integer> leftSeat = new ReserveDaoImpl().getSeatNumbersByBusAndDate(bid, date);
		return leftSeat;
	}

}
