package com.example.CustomerManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerManagement.dao.CustomerDao;
import com.example.CustomerManagement.exception.IncorrectData;
import com.example.CustomerManagement.exception.IncorrectDelete;
import com.example.CustomerManagement.exception.IncorrectUpdate;
import com.example.CustomerManagement.exception.IncorrectView;
import com.example.CustomerManagement.model.Customers;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	public Customers createCustomer(Customers customers) {
		if(customers.getCid()==0 || customers.getFirstname()==null ||customers.getLastname()== null || customers.getSex()==null|| customers.getAge()<=0 || customers.getQualification()==null)
			throw new IncorrectData();
		return customerDao.save(customers);
				
	}

	@Override
	public List<Customers> displayAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public Customers searchCustomer(int cid) {
		// TODO Auto-generated method stub
		return customerDao.findById(cid).orElseThrow(() -> new IncorrectView());
	//return customerDao.findById(cid).get();
	}

	@Override
	public boolean deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		
		Customers cus =customerDao.findById(cid).orElseThrow(()-> new IncorrectDelete());
		customerDao.deleteById(cid);
		System.out.println("The delete is : "+cid);	
		return true;
		
	}
	

	@Override
	public Customers updateCustomer(int cid, Customers customers) {
		// TODO Auto-generated method stub
		
		Customers cc=customerDao.findById(cid).orElseThrow(()-> new IncorrectUpdate());
		if(customers.getFirstname()==null || customers.getAge()<=0 || customers.getQualification()==null)
			throw new IncorrectData();
		cc.setFirstname(customers.getFirstname());
		cc.setAge(customers.getAge());
		cc.setQualification(customers.getQualification());
		return customerDao.save(cc);
		
		
		//return customerDao.save(customers);
	}

	

}
