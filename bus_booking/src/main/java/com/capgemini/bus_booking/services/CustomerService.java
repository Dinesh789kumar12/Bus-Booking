package com.capgemini.bus_booking.services;

import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.exception.DaoException;

public interface CustomerService {
	public void refundMoney(String cancel);

	public void generateTicket(Reserve res);

	public String forgotPassword(int cId);

	public void addAdditionalData(String address, String phno, int CustId);

	public boolean changePassword(int id, String pass);

	public boolean loginCustomer(String userName, String password);

	public void signupCustomer(int cust_id, String cust_name, String cust_dob, String cust_email, String cust_address,
			String cust_phno, String cust_pass) throws DaoException;
}
