package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;

public interface BusService {
	public List<Bus> searchBus(Route route, String date);

	public List<Bus> sortingBus(String sort);

	public int displayFare(Reserve res);

	public boolean addBus(int id, int routeID, boolean ac, int fare, String departureTime, String arrivalTime,
			int availablityCount);

	public boolean cancelBus(int busId);

	public boolean updateBusTiming(int bid,String At,String Dt);
}
