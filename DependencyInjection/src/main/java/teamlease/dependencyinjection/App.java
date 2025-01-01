package teamlease.dependencyinjection;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import teamlease.dependencyinjection.beans.MessageProcessor;
import teamlease.dependencyinjection.beans.Student;


public class App 
{
    public static void main( String[] args )
    {
    	// container -- IOC Container    	
    	ApplicationContext container = 
    			new ClassPathXmlApplicationContext("beans.xml");
 	
    	
    	// Reference will be Student
    	
    	// Student student =  container.getBean("s" , Student.class);		// passing id of bean tag
    	
    	// Reference will be Object class
    	
    	//Student student =  (Student)container.getBean("s" );		// passing id of bean tag
    	
    	
    	
    	//System.out.println("Roll : " + student.getRoll());
    	//System.out.println("Name : " + student.getName());
    	
    	MessageProcessor p = container.getBean("processor3",MessageProcessor.class);
    	p.processMessage("Hello World");
    	
    	
    }
}
