package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Route;

public class RouteDaoImpl implements RouteDao {

	HashMap<String, Route> hroute = new HashMap<String, Route>();

	public RouteDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		hroute.put("Komal", new Route(11, "Delhi", "Jaipur"));
		hroute.put("Jonny", new Route(22, "Mumbai", "Chennai"));
		hroute.put("Irina", new Route(777, "UP", "Delhi"));
		hroute.put("Vikas", new Route(444, "Himachal Pradesh", "Delhi"));
	}

	public HashMap<String, Route> getHroute() {
		return hroute;
	}

	public void setHroute(HashMap<String, Route> hroute) {
		this.hroute = hroute;
	}

	@Override
	public Map<String, Route> add_Route() {
		return hroute;
	}

}
