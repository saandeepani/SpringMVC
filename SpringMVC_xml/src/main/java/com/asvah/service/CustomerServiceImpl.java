package com.asvah.service;

import java.util.List;

import com.asvah.respository.CustomerRespository;
import com.asvah.respository.HibernateCustomerRespositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	// CustomerRespository customerRespository = new HibernateCustomerRespositoryImpl();
	
	public CustomerServiceImpl() {
		
	}

	public CustomerServiceImpl(CustomerRespository customerRespositorySetter) {
		super();
		this.customerRespositorySetter = customerRespositorySetter;
	}

	CustomerRespository customerRespositorySetter;

	public void setCustomerRespositorySetter(CustomerRespository customerRespositorySetter) {
		this.customerRespositorySetter = customerRespositorySetter;
	}

	@Override
	public List findAll() {
		return customerRespositorySetter.findAll();
	}

}
