package demo.firstspringproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.firstspringproject.beans.Customer;
import demo.firstspringproject.beans.HelloWorld;
import demo.firstspringproject.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // This is IOC Container
    	
    	ApplicationContext container =
    			new ClassPathXmlApplicationContext("spring.xml");
    	
    	// Retrieve Object of HelloWorld class Created by container 
    	// based on XML Configuration
    	
//    	HelloWorld h = container.getBean("helloWorld",HelloWorld.class);    	
//    	System.out.println("Message : " + h.getMessage());
//    	
//    	Student s = container.getBean("stud", Student.class);
//    	System.out.println(" Name :" + s.getName());
//    	System.out.println("Address :" + s.getHomeAddress());
//    	
    	
    	Customer customer = container.getBean("cust", Customer.class);
    	System.out.println(" Rent Of Vehicle : " + customer.getVehicle().getRent(100));
    	
    	
    	
    	
    }
}
