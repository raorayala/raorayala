package com.customer.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rewards.entity.Customer;
import com.customer.rewards.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	//@Autowired
	Customer customer;

 
   

	@GetMapping(value = "/{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getRewardsByCustomerId(@PathVariable("customerId") Long customerId){
		System.out.println( "Murali Rayala path parameter : "+customerId);

		 customer = customerService.getCustomerById(customerId);
		
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}

}
