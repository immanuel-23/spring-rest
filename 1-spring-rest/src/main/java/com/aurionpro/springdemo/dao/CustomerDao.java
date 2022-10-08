package com.aurionpro.springdemo.dao;

import java.util.List;

import com.aurionpro.springdemo.entity.Customer;

public interface CustomerDao {
	List<Customer> getCustomers();

	Customer getCustomerById(int customerId);

	void addCustomer(Customer customer);
}