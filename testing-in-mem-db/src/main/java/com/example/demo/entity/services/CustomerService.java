package com.example.demo.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.ifaces.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public Customer add(Customer entity) {
		return this.repo.save(entity);
	}
	
	public List<Customer> findByName(String srchString){
		return this.repo.findByName(srchString);
	}
}
