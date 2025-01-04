package com.example.demo.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entities.Customer;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.repositories.CustomerRepository;

/*
 * 		DTO Pattern --- Mapping
 * 		Logging		-- Log4J
 * 		Exception Handling
 * 
 */
@RestController
public class CustomerController {

		@Autowired
		CustomerRepository repo;
		
		@Autowired
		ModelMapper mapper;
		// Get Object of Logger
		Logger logger = LoggerFactory.getLogger(CustomerController.class);
				
		@PostMapping("/customers")
		public ResponseEntity<String> saveProduct ( @RequestBody CustomerDto dto )
		{
			Customer cust = mapper.map(dto, Customer.class);	
			logger.info("Saving Customer in Database");
			repo.save(cust);
			String msg = "Customer Saved Successfully !!";
			ResponseEntity<String> r = new ResponseEntity<String>(msg , HttpStatus.CREATED);
			return r;
		}
		@GetMapping("/customers/{id}")
		public CustomerDto findProductById (@PathVariable long id )
		{
			Optional<Customer> opt = repo.findById(id);
			if(opt.isPresent())
			{
				Customer cust = opt.get();
				CustomerDto dto = mapper.map(cust, CustomerDto.class);
				logger.info("returing Customer in Database");
				return dto;
			}
			else
			{
				logger.error("Product Id Not Found");
				throw new ProductNotFoundException("Product Not Found");
			}
		}
		
		
		
		
		
		
		
}
