package com.example.CustomerManagement.service;

import java.util.List;

import com.example.CustomerManagement.exception.IncorrectData;
import com.example.CustomerManagement.exception.IncorrectDelete;
import com.example.CustomerManagement.exception.IncorrectUpdate;
import com.example.CustomerManagement.exception.IncorrectView;
import com.example.CustomerManagement.model.Customers;

public interface CustomerService {
	
	public Customers createCustomer(Customers customers)throws IncorrectData;
	public List<Customers> displayAllCustomers();
	public Customers searchCustomer(int cid) throws IncorrectView;
	public boolean deleteCustomer(int cid) throws IncorrectDelete;
	public Customers updateCustomer(int id, Customers customers) throws IncorrectUpdate;

}
