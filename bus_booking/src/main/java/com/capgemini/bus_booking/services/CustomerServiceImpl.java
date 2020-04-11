package com.capgemini.bus_booking.services;

import com.capgemini.bus_booking.bean.Customer;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.dao.CustomerDaoImpl;
import com.capgemini.bus_booking.exception.DaoException;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDaoImpl cstdao = new CustomerDaoImpl();

	@Override
	public void refundMoney(String cancel) {

	}

	@Override
	public void generateTicket(Reserve res) {
		System.out.println("****************Bus Ticket********************");
		System.out.println("Reserve ID" + "\t" + "Passenger ID" + "\t" + "Bus Id" + "Date of Journey" + "\t" + "Seat");
		System.out.println(res.getId() + "\t\t" + res.getCustId() + "\t\t" + res.getBusID() + "\t\t" + res.getDt()
				+ "\t\t" + res.getSeat());
		System.out.println("Enter Your Name:_____________________________________");
		System.out.println("Enter Your Age:_______________________________________");

	}

	@Override
	public boolean loginCustomer(String userName, String password) {
		boolean check = false;
		Customer cst = cstdao.findByUsername(userName);
		if (cst.getCust_pass().equals(password)) {
			check = true;
		}
		return check;
	}

	@Override
	public String forgotPassword(int cID) {
		Customer cst = cstdao.findById(cID);
		String str = cst.getCust_pass();
		return str;
	}

	@Override
	public void addAdditionalData(String address, String phno, int custId) {
		Customer cst = cstdao.findById(custId);
		cst.setCust_address(address);
		cst.setCust_phno(phno);
	}

	@Override
	public void changePassword(int id, String pass) {
		Customer cst = cstdao.findById(id);
		cst.setCust_pass(pass);
	}

	@Override
	public void signupCustomer(int cust_id, String cust_name, String cust_dob, String cust_email, String cust_address,
			String cust_phno, String cust_pass) throws DaoException {

		Customer cst = new Customer(cust_id, cust_name, cust_dob, cust_email, cust_address, cust_phno, cust_pass);
		cstdao.addCustomerDao(cst);
	}
}
