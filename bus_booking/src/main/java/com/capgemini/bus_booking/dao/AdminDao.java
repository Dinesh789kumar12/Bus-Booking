package com.capgemini.bus_booking.dao;

import java.util.List;

import com.capgemini.bus_booking.bean.Admin;

public interface AdminDao {
	public void addAdminDao(Admin ladmin);

	public Admin findByUsername(String username);

	public List<Admin> getadminList();
}
