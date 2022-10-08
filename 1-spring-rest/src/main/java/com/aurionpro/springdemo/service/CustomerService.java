package com.aurionpro.springdemo.service;

import java.util.List;

import com.aurionpro.springdemo.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

	Customer getCustomerById(int customerId);

	void addCustomer(Customer customer);
}