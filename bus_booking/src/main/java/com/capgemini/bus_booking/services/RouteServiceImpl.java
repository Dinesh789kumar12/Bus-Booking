package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.dao.RouteDaoImpl;

public class RouteServiceImpl implements RouteService {

	private RouteDaoImpl rdaoimpl = new RouteDaoImpl();

	@Override
	public boolean addRoute(int id, String origin, String destination) {
		Route route = new Route(id, origin, destination);
		rdaoimpl.addRouteDao(route);
		return true;
	}

	@Override
	public boolean cancelRoute(int routeId) {
		boolean check=false;
		if (rdaoimpl.findById(routeId) != null) {
			rdaoimpl.remove(routeId);
			check=true;
		}
		return check;
	}

	@Override
	public List<Route> updateRoute() {
		// TODO Auto-generated method stub
		return null;
	}
}
