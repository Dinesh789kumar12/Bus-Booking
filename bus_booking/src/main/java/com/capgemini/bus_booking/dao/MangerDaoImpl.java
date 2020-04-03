package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Manager;

public class MangerDaoImpl implements ManagerDao {

	ArrayList<Manager> lmanger = new ArrayList<Manager>();

	@Override
	public List<Manager> addManger() {
		lmanger.add(new Manager(1, "Dinesh", "dinesh5455@gmail.com", "09-4-1997", "979898988", "Delhi"));
		lmanger.add(new Manager(2, "Pushkar", "pushkar235@gmail.com", "23-06-1999", "679898988", "Lahore"));
		return lmanger;
	}

	public ArrayList<Manager> getLmanger() {
		return lmanger;
	}

	public void setLmanger(ArrayList<Manager> lmanger) {
		this.lmanger = lmanger;
	}

}
