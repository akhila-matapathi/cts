package com.example.CustomerManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerManagement.model.Customers;

@Repository
public interface CustomerDao extends JpaRepository<Customers,Integer>{

}
