package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	
	
	
	
}
