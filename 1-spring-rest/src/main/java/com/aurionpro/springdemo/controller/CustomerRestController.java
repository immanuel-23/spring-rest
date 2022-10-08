package com.aurionpro.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.springdemo.entity.Customer;
import com.aurionpro.springdemo.service.CustomerService;

@RestController
@RequestMapping("/app")
public class CustomerRestController {

	@Autowired
	private CustomerService customService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customService.getCustomers();
		
	}
	@GetMapping("/customers/{customerId}") // this is called path variable
	public Customer getCustomerById(@PathVariable int customerId) {
		Customer customer = customService.getCustomerById(customerId);
		return customer;
		
	}
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) { // WE HAVE USED REQUEST BODY BECAUSE DATA IS JSON
		customer.setId(0);
		customService.addCustomer(customer);
		return customer;
		
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) { // WE HAVE USED REQUEST BODY BECAUSE DATA IS JSON
		customer.setId(0);
		customService.addCustomer(customer);
		return customer;
		
	}
	
}