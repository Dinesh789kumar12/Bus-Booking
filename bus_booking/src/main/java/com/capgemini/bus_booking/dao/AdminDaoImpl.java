package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Admin;

public class AdminDaoImpl implements AdminDao {

	List<Admin> ladmin = new ArrayList<Admin>();

	public AdminDaoImpl() {
		super();
		ladmin.add(new Admin(111, "Ammu", "Jammu@gmail.com", "amu567@#"));
		ladmin.add(new Admin(222, "Pushkar", "pushkar@gmail.com", "pushkar$%12"));
	}

	public List<Admin> getadminList() {
		return ladmin;
	}

	@Override
	public void addAdminDao(List<Admin> ladmin) {
		this.ladmin = ladmin;
	}

	@Override
	public Admin findByUsername(String username) {
		Admin admin = ladmin.stream().filter(x -> username.equals(x.getAdmin_name())).findAny().orElse(null);
		return admin;
	}
}
