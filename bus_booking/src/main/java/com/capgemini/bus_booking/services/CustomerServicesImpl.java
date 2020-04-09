package com.capgemini.bus_booking.services;

import java.util.List;
import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.dao.BusDaoImpl;

public class CustomerServicesImpl implements CustomerServices {

	@Override
	public List<Reserve> cancelBooking() {
		return null;
	}

	@Override
	public List<Reserve> refundMoney(String cancel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int displayFare(Reserve res) {
		Bus bs = new BusDaoImpl().getLbusList().stream().filter(p -> p.getId() == res.getBusID()).findAny()
				.orElse(null);
		int price = bs.getFare() * res.getSeat();
		return price;
	}

	@Override
	public List<Bus> seatAvailability() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Rating() {
		// TODO Auto-generated method stub

	}

	@Override
	public void feedback() {
		// TODO Auto-generated method stub

	}

	@Override
	public void generateTicket() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Reserve> busBooking() {
		// TODO Auto-generated method stub
		return null;
	}

}
