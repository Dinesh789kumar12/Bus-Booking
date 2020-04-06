package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Admin;

public interface AdminDao {
	public List<Admin> addAdminDao();

	public Admin findByUsername(String username);
}
