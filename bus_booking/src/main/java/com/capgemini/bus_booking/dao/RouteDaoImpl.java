package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Route;

public class RouteDaoImpl implements RouteDao {

	List<Route> lroute = new ArrayList<Route>();

	public RouteDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		lroute.add(new Route(11, "Delhi", "Jaipur"));
		lroute.add(new Route(22, "Mumbai", "Chennai"));
		lroute.add(new Route(777, "UP", "Delhi"));
		lroute.add(new Route(444, "Himachal Pradesh", "Delhi"));
	}

	public List<Route> getrouteList() {
		return lroute;
	}

	@Override
	public void addRouteDao(List<Route> lroute) {
		this.lroute = lroute;
	}

	public Route findById(int routeId) {
		Route result = lroute.stream().filter(n -> n.getId() == routeId).findAny().orElse(null);
		return result;
	}

	public void remove(int routeId) {
		lroute.remove(routeId);
	}
}
