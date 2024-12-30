package demo.annotaiontconfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.annotaiontconfiguration.beans.Student;

/*
 * 	This is class used for bean Configuration Purpose just like xml file in XML Configuration
 *   
 *  Add @Configuration -- to define class for configuration purpose 
 * 
 *  To create an Object of a class
 *  
 *  1. @Bean  ---> Container will not create an Object but will manage it
 *  
 *  2. @Component ---> Container will create an Object and manage it
 *  
 *  		
 * 
 */

@Configuration
// used to mention packages where components/beans are located
@ComponentScan (basePackages = {"demo.annotaiontconfiguration.beans"})

public class ProjectConfig {
	
	@Bean(name="rahul")
	public Student student()
	{
		Student s = new Student(1 , "Rahul");
		return s;
	}
	
	
	
}
