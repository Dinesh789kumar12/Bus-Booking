package com.capgemini.bus_booking.services;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Customer;
import com.capgemini.bus_booking.dao.AdminDaoImpl;
import com.capgemini.bus_booking.dao.CustomerDaoImpl;

public class UserServiceImpl implements UserServices {

	@Override
	public boolean loginCustomer(String userName, String password) {
		boolean check = false;
		Customer cst = new CustomerDaoImpl().findByUsername(userName);
		if (cst.getCust_pass().equals(password)) {
			check = true;
		}
		return check;
	}

	@Override
	public boolean loginAdmin(String userName, String password) {
		boolean check = false;
		Admin ad = new AdminDaoImpl().findByUsername(userName);
		if (ad.getAdmin_pass().equals(password)) {
			check = true;
		}
		return check;
	}

	@Override
	public String forgotPassword(int cID) {
		Customer cst = new CustomerDaoImpl().findById(cID);
		String str = cst.getCust_pass();
		return str;
	}

	@Override
	public void addAdditionalData(String address, String phno, int custId) {
		Customer cst = new CustomerDaoImpl().findById(custId);
		cst.setCust_address(address);
		cst.setCust_phno(phno);
	}

	@Override
	public void changePassword() {

	}

	@Override
	public void signupCustomer(int cust_id, String cust_name, String cust_dob, String cust_email, String cust_address,
			String cust_phno, String cust_pass) {

		Customer cst = new Customer(cust_id, cust_name, cust_dob, cust_email, cust_address, cust_phno, cust_pass);
		new CustomerDaoImpl().addCustomerDao(cst);
	}

	@Override
	public void signupAdmin(int admin_id, String admin_name, String admin_email, String admin_pass) {
		Admin ad = new Admin(admin_id, admin_name, admin_email, admin_pass);
		new AdminDaoImpl().addAdminDao(ad);
	}
}
