package com.example.demo.controllers;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entities.Customer;

// user defined mapper
public class CustomerMapper {

	public Customer dtoToCustomer ( CustomerDto dto)
	{
		Customer cust = new Customer();
		cust.setAge(dto.getAge());
		cust.setCustid(dto.getCustid());
		cust.setCustName(dto.getCustName());
		return cust;
	}
}
