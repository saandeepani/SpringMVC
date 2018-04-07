package com.asvah.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.asvah.model.Customer;

public class HibernateCustomerRespositoryImpl implements CustomerRespository {
	
	@Value("${dbUserName}") // autowire Notes# no need setter for this for autowire
	private String dbUserName;

	
	/*public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}*/
	@Override
	public List<Customer> findAll() {
		System.out.println("DB Name: " + dbUserName);
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customerSandeep = new Customer();
		
		customerSandeep.setFirstName("Sandeep");
		customerSandeep.setLastName("Bomma");
		customers.add(customerSandeep);
		
		Customer customerKalyani = new Customer();
		
		customerKalyani.setFirstName("Kalyani");
		customerKalyani.setLastName("Yele");
		customers.add(customerKalyani);
		
		return customers;
		
		
	}
	
	

}
