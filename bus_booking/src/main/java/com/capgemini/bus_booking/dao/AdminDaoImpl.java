package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Admin;

public class AdminDaoImpl implements AdminDao {

	HashMap<String, Admin> hadmin = new HashMap<String, Admin>();

	public Map<String, Admin> addAdmin() {

		hadmin.put("karan", new Admin(111, "Ammu", "Jammu@gmail.com"));
		hadmin.put("amit", new Admin(222, "Pushkar", "pushkar@gmail.com"));

		return hadmin;
	}

}
