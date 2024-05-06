package com.example.CustomerManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerManagement.model.Customers;
import com.example.CustomerManagement.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cms")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Customers createCustomer(@Valid @RequestBody Customers customers) {
		return customerService.createCustomer(customers);
	}
	
	@GetMapping("/display")
	@ResponseStatus(HttpStatus.OK)
	public List<Customers> displayCustomers(){
		return customerService.displayAllCustomers();
	}
	
	@GetMapping("/searchcustomer/{cid}")
	@ResponseStatus(HttpStatus.OK)
	public Customers searchCustomer(@PathVariable int cid){
		
		return customerService.searchCustomer(cid);
	}
	
	@DeleteMapping("/deletecustomer/{cid}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public boolean deleteCustomerById(@PathVariable int cid) {
		return customerService.deleteCustomer(cid);
	}
	
	@PutMapping("/updatecustomer/{cid}")
	@ResponseStatus(HttpStatus.CREATED)
	public Customers updateCustomer(@PathVariable int cid, @RequestBody Customers customers) {
		return customerService.updateCustomer(cid, customers);
	}

}
