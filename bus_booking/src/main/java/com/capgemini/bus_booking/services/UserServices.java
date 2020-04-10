package com.capgemini.bus_booking.services;

public interface UserServices {

	public String forgotPassword(int cId);

	public void addAdditionalData(String address, String phno, int CustId);

	public void changePassword();

	public boolean loginCustomer(String userName, String password);

	public void signupCustomer(int cust_id, String cust_name, String cust_dob, String cust_email, String cust_address,
			String cust_phno, String cust_pass);

	public boolean loginAdmin(String userName, String password);

	public void signupAdmin(int admin_id, String admin_name, String admin_emai, String admin_pass);

}
