package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Route;

public interface RouteService {
	public boolean addRoute(int id, String origin, String destination);

	public boolean cancelRoute(int routeId);

	public List<Route> updateRoute();
}
