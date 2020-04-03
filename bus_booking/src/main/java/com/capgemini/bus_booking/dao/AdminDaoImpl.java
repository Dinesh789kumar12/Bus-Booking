package com.capgemini.bus_booking.dao;

import java.util.List;
import java.util.ArrayList;

import com.capgemini.bus_booking.bean.Admin;

public class AdminDaoImpl implements AdminDao {
	ArrayList<Admin> ladmin = new ArrayList<Admin>();

	public List<Admin> addAdmin() {
		ladmin.add(new Admin(111, "Ammu", "Jammu@gmail.com"));
		ladmin.add(new Admin(222, "Pushkar", "pushkar@gmail.com"));
		return ladmin;
	}

	public ArrayList<Admin> getLadmin() {
		return ladmin;
	}

	public void setLadmin(ArrayList<Admin> ladmin) {
		this.ladmin = ladmin;
	}

}
