package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Route;

public class RouteDaoImpl implements RouteDao {

	List<Route> lroute = new ArrayList<Route>();
	private static final Logger logger = Logger.getLogger(Route.class);

	public RouteDaoImpl() {
		super();
		lroute.add(new Route(11, "Delhi", "Jaipur"));
		lroute.add(new Route(22, "Mumbai", "Chennai"));
		lroute.add(new Route(777, "UP", "Delhi"));
		lroute.add(new Route(444, "Himachal Pradesh", "Delhi"));
		lroute.add(new Route(11, "Delhi", "Kolkatta"));
		lroute.add(new Route(12, "Delhi", "Jaipur"));
		lroute.add(new Route(15, "Delhi", "Kolkatta"));
	}

	public List<Route> getrouteList() {
		return lroute;
	}

	@Override
	public void addRouteDao(Route route) {
		if (route != null)
			lroute.add(route);
		logger.info("1 Route added");

	}

	public Route findById(int routeId) {
		Route result = lroute.stream().filter(n -> n.getId() == routeId).findAny().orElse(null);
		return result;
	}

	public void remove(int routeId) {
		lroute.remove(routeId);
	}

	public List<Route> findByOrigin(String origin) {
		List<Bus> bs = new BusDaoImpl().getLbusList();
		List<Route> routes = lroute.stream()
				.filter(r -> bs.stream().anyMatch(b -> r.getOrigin().equals(origin) && r.getId() == b.getRouteID()))
				.collect(Collectors.toList());
		return routes;
	}

	public List<String> findAllOrigins() {
		List<Bus> bs = new BusDaoImpl().getLbusList();
		List<Route> routes = lroute.stream().filter(distinctByKey(Route::getOrigin))
				.filter(r -> bs.stream().anyMatch(b -> r.getId() == b.getRouteID())).collect(Collectors.toList());

		List<String> origins = new ArrayList<String>();
		for (Route row : routes) {
			origins.add(row.getOrigin());
		}
		return origins;
	}

	private static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> seen = new ConcurrentHashMap<Object, Boolean>();
		return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
	
}
