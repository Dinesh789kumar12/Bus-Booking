package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.exception.DaoException;

public interface AdminService {

	public List<Reserve> generateReport();

	public boolean loginAdmin(String userName, String password);

	public void signupAdmin(int admin_id, String admin_name, String admin_emai, String admin_pass) throws DaoException;
	
}
