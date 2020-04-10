package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;

public class BusDaoImpl implements BusDao {
	List<Bus> lbus = new ArrayList<Bus>();

	public BusDaoImpl() {
		super();
		// lbus.add(new Bus(id, routeID, ac, fare, arrivalTime, departureTime,
		// availablityCount))
		lbus.add(new Bus(1, 11, true, 999, "04:00 AM", "08:00PM", 35));
		lbus.add(new Bus(2, 222, false, 888, "04:00AM", "09:00 PM", 36));
		lbus.add(new Bus(4, 444, true, 400, "07:00 AM", "11:00 PM", 40));
		lbus.add(new Bus(6, 666, false, 250, "15:00 PM", "18:00 PM", 40));
		lbus.add(new Bus(7, 777, true, 500, "16:00 PM", "21:00 PM", 48));
		lbus.add(new Bus(8, 888, true, 400, "19:00 PM", "24:00 AM", 72));
		lbus.add(new Bus(9, 12, true, 10000, "04:00 PM", "10:00 PM", 10));
		lbus.add(new Bus(10, 15, false, 400, "9:00 AM", "12:00 PM", 50));
		lbus.add(new Bus(21, 22, true, 1500, "09:00 AM", "03:00 PM", 5));
	}

	public void addbusDao(Bus arr) {
		lbus.add(arr);
	}

	public List<Bus> getLbusList() {
		return lbus;
	}

	@Override
	public Bus findById(int id) {
		Bus result = lbus.stream().filter(n -> n.getId() == id).findAny().orElse(null);
		return result;
	}

	@Override
	public void remove(int id) {
		lbus.remove(id);
	}

	@Override
	public List<Bus> findByRouteAndDate(Route route, String date) {
		List<Route> routeData = new RouteDaoImpl().getrouteList().stream().filter(
				p -> p.getOrigin().equals(route.getOrigin()) && p.getDestination().equals(route.getDestination()))
				.collect(Collectors.toList());
		List<Integer> rId = new ArrayList<Integer>();
		for (Route in : routeData) {
			rId.add(in.getId());
		}
		List<Reserve> reserve = new ReserveDaoImpl().getreserveList();
		List<Bus> bs = lbus.stream().filter(p -> routeData.stream().anyMatch(r -> r.getId() == p.getRouteID()))
				.collect(Collectors.toList());
		List<Bus> rs = bs.stream()
				.filter(p -> reserve.stream().anyMatch(r -> r.getBusID() == p.getId() && r.getDt().equals(date)))
				.collect(Collectors.toList());
		return rs;
	}

	public static void main(String[] args) {
		BusDaoImpl busDaoImpl = new BusDaoImpl();

		System.out.println(busDaoImpl.findByRouteAndDate(new Route(1, "Mumbai", "Chennai"), "06-05-2020"));
	}
}
