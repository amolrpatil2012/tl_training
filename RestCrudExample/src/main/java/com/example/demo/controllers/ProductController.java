package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepository;

// @RestController --->  @Controller + @ResponseBody

@RestController
@CrossOrigin
public class ProductController {
	
		@Autowired
		ProductRepository repo;
	
		// http://localhost:8080/products -- Post Method	
		// @RequestBody --- JSON input into Java Object 
		// @ResponseBody -- converts java object to JSON
		
		// ResponseEntity ---> Response + Status Code
		
		@PostMapping("/products")
		public ResponseEntity<String> saveProduct ( @RequestBody Product product )
		{			
			repo.save(product);
			String msg = "Product Saved Successfully !!";
			ResponseEntity<String> r = new ResponseEntity<String>(msg , HttpStatus.CREATED);
			return r;
		}
		
		// http://localhost:8080/products -- Get Method
		@GetMapping("/products")
		public List<Product> findAllProducts()
		{
			return repo.findAll();
		}
	
			
		// select * from products where productid=3
		
		// http://localhost:8080/products/3				3<--- path variable
		@GetMapping("/products/{id}")
		public Product findProductById (@PathVariable int id )
		{
			Optional<Product> opt = repo.findById(id);
			if(opt.isPresent())
				return opt.get();
			else
				throw new RuntimeException("Product Not Found");
		}
		
		// http://localhost:8080/products/pricegreaterthan/30000
		
		@GetMapping("/products/pricegreaterthan/{price}")
		public List<Product> findProductsGreaterThan ( @PathVariable int price)
		{
			return repo.findByPriceGreaterThan(price);
		}
		
		
		
		// Optional class -- 
		
		// Delete
		// http://localhost:8080/products/3	
		@DeleteMapping("/products/{id}")
		public String delete ( @PathVariable int id)
		{
			Optional<Product> opt = repo.findById(id);
			if(opt.isPresent())
			{
				Product product = opt.get();
				repo.delete(product);
				return "Product deleted successfully";
			}
			else
				throw new RuntimeException("Product Not Found");
		}
		
		// Update
		// http://localhost:8080/products/3	<-- id of product whose data to update
		@PutMapping("/products/{id}")
		public String update ( @PathVariable int id , @RequestBody Product newProduct )
		{
			Optional<Product> opt = repo.findById(id);  // search for product
			if(opt.isPresent())
			{
				Product oldProduct = opt.get();	// old product
				
				oldProduct.setPrice(newProduct.getPrice());				// change price 
				oldProduct.setProductName(newProduct.getProductName());	// change name
				
				repo.save(oldProduct);	// update oldProduct
				
				return "Product Updated successfully";
			}
			else
				throw new RuntimeException("Product Not Found");
		}
		
		
		
		
		

}
