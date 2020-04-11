package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.exception.DaoException;

public class AdminDaoImpl implements AdminDao {

	private static final Logger logger = Logger.getLogger(AdminDaoImpl.class);
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
	public void addAdminDao(Admin admin1) throws DaoException {
		if (admin1 != null) {
			ladmin.add(admin1);
			logger.info("1 record are added in admin");
		} else {
			throw new DaoException("Error saving record");
		}
	}

	@Override
	public Admin findByUsername(String username) {
		Admin admin = ladmin.stream().filter(x -> username.equals(x.getAdmin_name())).findAny().orElse(null);
		return admin;
	}

	@Override
	public void deleteById(Admin res) {
		if (res != null) {
		}
		ladmin.remove(res);
		logger.info("1 Deleted Data of Bus");
	}
}
