package com.capgemini.bus_booking.services;

import com.capgemini.bus_booking.exception.DaoException;

public interface AdminService {

	public boolean loginAdmin(String userName, String password);

	public void signupAdmin(int admin_id, String admin_name, String admin_emai, String admin_pass) throws DaoException;
	
}
