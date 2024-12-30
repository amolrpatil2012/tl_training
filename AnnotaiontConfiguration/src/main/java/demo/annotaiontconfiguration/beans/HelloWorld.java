package demo.annotaiontconfiguration.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 * 	by default their is only single object of every component
 *  this is known as Singleton pattern
 *  
 *  prototype -- container will create new object every time
 *  when we call getBean method
 * 
 * 
 */
@Component
@Lazy			// Lazy creation of object -- getBean method
@Scope(value = "prototype")
public class HelloWorld {

	public String getMessage()
	{
		return "Hello World";
	}
	
	public HelloWorld()
	{
		System.out.println(" Inside HelloWorld Constructor");
	}
}
