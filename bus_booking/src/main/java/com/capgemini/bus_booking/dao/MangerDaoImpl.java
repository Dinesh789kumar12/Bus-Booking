package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Manager;

public class MangerDaoImpl implements ManagerDao {

	HashMap<String, Manager> hmanager = new HashMap<String, Manager>();

	@Override
	public Map<String, Manager> addManger() {
		hmanager.put("pushkar", new Manager(1, "Dinesh", "dinesh5455@gmail.com", "09-4-1997", "979898988", "Delhi"));
		hmanager.put("dinesh", new Manager(2, "Pushkar", "pushkar235@gmail.com", "23-06-1999", "679898988", "Lahore"));
		return hmanager;
	}

}
