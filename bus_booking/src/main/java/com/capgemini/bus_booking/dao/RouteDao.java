package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Route;

public interface RouteDao {
	public List<Route> getrouteList();

	public void addRouteDao(Route lroute);

	public Route findById(int routeId);

	public void remove(int routeId);

	public List<Route> findByOrigin(String origin);
}
