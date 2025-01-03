package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByPriceGreaterThan ( int price );
	Product findByProductName ( String name);
	

}
/*
		Spring Data JPA 
		
		Internally 
		|
		class ProductRepositoryImpl implements ProductRepository
		{
				void save --- insert/update
				void remove --- delete
				findAll ----select
				
		}
		
		To define additional methods [ search / select ]
		
		* Method to find all products where price is greater than given price
		
			select * from products where price > ?
			
			List<Product> findByPriceGreaterThan ( int price );
			
			
			findBy<propertyname>
			
			
			
			
		
		
		


*/