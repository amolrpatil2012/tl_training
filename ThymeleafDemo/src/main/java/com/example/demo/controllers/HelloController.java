package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.beans.Student;

//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;

@Controller
public class HelloController {

	// localhost:8080
	@GetMapping
	public String getHello()
	{
		return "index";				// thymeleaf engine --- index.html
	}
	
	// localhost:8080/greet?fname=Suresh <----- Request Parameter
	
	@GetMapping ("/greet")
	//@ResponseBody
	public String greetUser( @RequestParam("fname") String fname , Model model)	// fname receives value
	{
		// set data [ fname ] as a key-value pair to model
		model.addAttribute("firstname", fname);
		return "greeting";
		
	}
	
	@PostMapping("/register")
	public String saveStudent ( Student student , Model model )
	{
		/*
		 * EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(student);
		transaction.commit();	
		 */
		model.addAttribute("msg" ," Registered Successfully !!");
		return "registersuccess";
		
		
	}
	
	
	
	
	
	
}
