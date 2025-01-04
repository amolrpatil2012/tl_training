package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MapperDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapperDemoApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper()
	{
		return new ModelMapper();
	}
}
