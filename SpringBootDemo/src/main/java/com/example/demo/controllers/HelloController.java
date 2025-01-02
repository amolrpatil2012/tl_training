package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*		Default web server with Spring Boot  --- Tomcat
 * 
 * 		Default port no of Tomcat : 8080
 * 
 * 		http://localhost:8080			--- default url
 * 
 * 
 */

// Controller -- Servlet -- Takes request process and generates response

// @Controller -- alias --- @Component --- managed by IOC Container

@Controller
public class HelloController {
	
	// localhost:8080/hello	
	
	@GetMapping("/hello")				
	@ResponseBody						// Hello WOrld is part of response body
	public String getHelloWorld()
	{
		return "Hello  World ";
	}
	
	//localhost:8080/welcome
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome()
	{
		return "Welcome to Spring Boot";
	}
	
	// localhost:8080
	
	@GetMapping
	public String index()
	{
		return "index.html";				// index.html
	}
	
	

}
