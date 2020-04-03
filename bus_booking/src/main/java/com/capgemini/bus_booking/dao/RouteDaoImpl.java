package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Route;

public class RouteDaoImpl implements RouteDao {

	ArrayList<Route> lroute = new ArrayList<Route>();

	@Override
	public List<Route> addRoute() {

		return null;
	}

	public ArrayList<Route> getLroute() {
		return lroute;
	}

	public void setLroute(ArrayList<Route> lroute) {
		this.lroute = lroute;
	}

}
