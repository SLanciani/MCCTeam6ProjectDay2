package com.team6.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team6.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
	ArrayList<Customer> customerList = new ArrayList<Customer>();

	public CustomerAPI() {
		Customer c1 = new Customer(1, "Austin", "pass", "austin@bah.com");
		Customer c2 = new Customer(2, "Anne", "pass", "anne@bah.com");
		Customer c3 = new Customer(3, "Timothy", "pass", "timothy@bah.com");
		Customer c4 = new Customer(4, "Emily", "pass", "emily@bah.com");
		Customer c5 = new Customer(5, "John", "pass", "john@bah.com");
		Customer c6 = new Customer(6, "Morgan", "pass", "morgan@bah.com");
		Customer c7 = new Customer(7, "Yerarmy", "pass", "Yerarmy@bah.com");
		Customer c8 = new Customer(8, "Brian", "pass", "brian@bah.com");
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		customerList.add(c6);
		customerList.add(c7);
		customerList.add(c8);
	}

	@GetMapping
	public Collection<Customer> getAll() {
		return this.customerList;
	}

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") long id) {
		
		Customer customer = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getId() == id) {
				customer = customerList.get(i);
			}
		}
		return customer;
	}

}
