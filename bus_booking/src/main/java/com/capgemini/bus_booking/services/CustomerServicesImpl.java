package com.capgemini.bus_booking.services;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.dao.BusDaoImpl;
import com.capgemini.bus_booking.dao.ReserveDaoImpl;

public class CustomerServicesImpl implements CustomerServices {

	@Override
	public boolean cancelBooking(Reserve reserve) {
		ReserveDaoImpl reserveDao = new ReserveDaoImpl();
		Reserve record = reserveDao.findById(reserve.getId());
		if (record.getCustId() == reserve.getCustId()) {
			reserveDao.deleteById(record);
			return true;
		}
		return false;
	}

	@Override
	public void refundMoney(String cancel) {

	}

	@Override
	public int displayFare(Reserve res) {
		Bus bs = new BusDaoImpl().getLbusList().stream().filter(p -> p.getId() == res.getBusID()).findAny()
				.orElse(null);
		int price = bs.getFare() * res.getSeat();
		return price;
	}

	@Override
	public int seatAvailability(int busId, String dt) {
		int seat = new ReserveDaoImpl().seatAvailabilityDao(busId, dt);
		return seat;
	}

	@Override
	public void generateTicket(Reserve res) {
		System.out.println("****************Bus Ticket********************");
		System.out.println("Reserve ID" + "\t" + "Passenger ID" + "\t" + "Bus Id" + "Date of Journey" + "\t" + "Seat");
		System.out.println(res.getId() + "\t\t" + res.getCustId() + "\t\t" + res.getBusID() + "\t\t" + res.getDt()
				+ "\t\t" + res.getSeat());
		System.out.println("Enter Your Name:_____________________________________");
		System.out.println("Enter Your Age:_______________________________________");

	}

	@Override
	public boolean busBooking(Reserve reserve) {
		boolean check = false;
		if (reserve == null) {
			return false;
		} else {
			new ReserveDaoImpl().addReserveDao(reserve);
			return true;
		}
	}

	@Override
	public int seatAvailableBus(int id, String date) {
		int seat = new ReserveDaoImpl().seatAvailabilityDao(id, date);
		return seat;
	}
}
