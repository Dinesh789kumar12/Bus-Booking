package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Reserve;

public class ReserveDaoImpl implements ReserveDao {

	ArrayList<Reserve> lreserve = new ArrayList<Reserve>();

	@Override
	public List<Reserve> addReserves() {
		// TODO Auto-generated method stub
		return lreserve;
	}

	public ArrayList<Reserve> getLreserve() {
		return lreserve;
	}

	public void setLreserve(ArrayList<Reserve> lreserve) {
		this.lreserve = lreserve;
	}

}
