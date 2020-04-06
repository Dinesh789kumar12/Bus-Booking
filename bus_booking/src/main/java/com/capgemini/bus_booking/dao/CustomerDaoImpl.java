package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Customer;

public class CustomerDaoImpl implements CustomerDao {

	HashMap<String, Customer> hcustomer = new HashMap<String, Customer>();

	public CustomerDaoImpl() {
		super();
		hcustomer.put("gita", new Customer(11, "Dinesh", "30-06-1998", "dinesh@gmail.com", "Delhi", "8920677718"));
		hcustomer.put("ramesh", new Customer(22, "Pushkar", "06-08-1998", "pushkar67@gmail.com", "Jaipur", "689089885"));
		hcustomer.put("karan", new Customer(33, "Raman", "02-03-1995", "raman34#2@gmail.com", "Srilanka", "8957754768"));
		hcustomer.put("tina", new Customer(44, "Devender", "12-08-1996", "dk056@gmail.com", "Gorakpur", "786557878"));
	}

	@Override
	public Map<String, Customer> addCustomer() {

		return hcustomer;
	}

	public HashMap<String, Customer> getHcustomer() {
		return hcustomer;
	}

	public void setHcustomer(HashMap<String, Customer> hcustomer) {
		this.hcustomer = hcustomer;
	}

}
