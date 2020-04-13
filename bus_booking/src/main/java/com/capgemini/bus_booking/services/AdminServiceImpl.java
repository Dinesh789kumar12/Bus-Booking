package com.capgemini.bus_booking.services;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.dao.AdminDaoImpl;
import com.capgemini.bus_booking.exception.DaoException;

public class AdminServiceImpl implements AdminService {
	private AdminDaoImpl adDaoImpl = new AdminDaoImpl();

	@Override
	public void signupAdmin(int admin_id, String admin_name, String admin_email, String admin_pass)
			throws DaoException {
		Admin ad = new Admin(admin_id, admin_name, admin_email, admin_pass);
		adDaoImpl.addAdminDao(ad);
	}

	@Override
	public boolean loginAdmin(String userName, String password) {
		boolean check = false;
		Admin ad = adDaoImpl.findByUsername(userName);
		if (ad.getAdmin_pass().equals(password)) {
			check = true;
		}
		return check;
	}
}
