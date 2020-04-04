package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Route;

public class RouteDaoImpl implements RouteDao {

	HashMap<String, Route> hroute = new HashMap<String, Route>();

	@Override
	public Map<String, Route> addRoute() {

		return hroute;
	}

}
