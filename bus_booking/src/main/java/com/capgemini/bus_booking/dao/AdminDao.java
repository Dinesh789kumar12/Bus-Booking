package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.exception.DaoException;

public interface AdminDao {
	public void addAdminDao(Admin ladmin) throws DaoException;

	public Admin findByUsername(String username);

	public List<Admin> getadminList();

	public void deleteById(Admin res);
}
