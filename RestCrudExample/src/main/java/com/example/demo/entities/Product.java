package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity							// Defines this class represents a table -- compulsory
@Table(name = "products")		// products will be name of table - not compulsory
public class Product {
	
	@Id														// Primary-Key	
	@GeneratedValue(strategy = GenerationType.IDENTITY)		// will increment auto
	@Column(name="productid")			// Creates column name in table as productid
	private int productId;
	
	@Column(name="productname" , nullable = false)		// Not Null 
	private String productName;	
	
	private int price;						
																
														
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
