package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Customer;

public class CustomerDaoImpl implements CustomerDao {

	ArrayList<Customer> lcustomer = new ArrayList<Customer>();

	@Override
	public List<Customer> addCustomer() {
		lcustomer.add(new Customer(1, "Dinesh", "30-06-1998", "dinesh@gmail.com", "Delhi", "8920677718"));
		lcustomer.add(new Customer(2, "Pushkar", "06-08-1998", "pushkar67@gmail.com", "Jaipur", "689089885"));
		lcustomer.add(new Customer(3, "Raman", "02-03-1995", "raman34#2@gmail.com", "Srilanka", "8957754768"));
		lcustomer.add(new Customer(4, "Devender", "12-08-1996", "dk056@gmail.com", "Gorakpur", "786557878"));
		return lcustomer;
	}
	

}
