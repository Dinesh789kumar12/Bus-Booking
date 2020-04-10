package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Customer;

public class CustomerDaoImpl implements CustomerDao {

	List<Customer> lcust = new ArrayList<Customer>();

	public CustomerDaoImpl() {
		super();
		lcust.add(new Customer(11, "Dinesh", "30-06-1998", "dinesh@gmail.com", "Delhi", "8920677718", "dinesh97"));
		lcust.add(new Customer(22, "Pushkar", "06-08-1998", "pushkar67@gmail.com", "Jaipur", "689089885", "push89"));
		lcust.add(new Customer(33, "Raman", "02-03-1995", "raman34#2@gmail.com", "Srilanka", "8957754768", "raman678"));
		lcust.add(new Customer(44, "Devender", "12-08-1996", "dk056@gmail.com", "Gorakpur", "786557878", "deven&*12"));
		lcust.add(new Customer(55,"Reema", "04-05-1998", "reema@gmail.com", "Indore","89207714","reema@123"));
	}

	@Override
	public void addCustomerDao(Customer cust) {
		lcust.add(cust);
	}

	public List<Customer> getcustList() {
		return lcust;
	}

	@Override
	public Customer findById(int id) {
		Customer result = lcust.stream().filter(n -> n.getCust_id() == id).findAny().orElse(null);
		return result;
	}

	@Override
	public Customer findByUsername(String username) {
		Customer result = lcust.stream().filter(x -> username.equals(x.getCust_name())).findAny().orElse(null);
		return result;
	}
}
