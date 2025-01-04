package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<String> handleError ( ProductNotFoundException p)
	{
		String msg = p.getMessage();
		ResponseEntity<String> r = new ResponseEntity<String>(msg , HttpStatus.NOT_FOUND);
		return r;
	}
	
	

}
