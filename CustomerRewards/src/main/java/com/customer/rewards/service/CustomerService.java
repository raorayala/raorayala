package com.customer.rewards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.rewards.entity.Customer;
import com.customer.rewards.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
    CustomerRepository customerRepository;
	
	//@Autowired
	Customer customer;

	public Customer getCustomerById(Long customerId) {
		
		System.out.println( "Murali service ");
		
		 customer = customerRepository.findByCustomerId(customerId);
		
		System.out.println( "Murali service "+customer.getCustomerName());
		
		return customer;
	}
	
	

}
