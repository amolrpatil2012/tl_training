package demo.springjpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.springjpa.beans.StudentOperations;
import demo.springjpa.config.ProjectConfig;

import demo.springjpa.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container =
         		new AnnotationConfigApplicationContext(ProjectConfig.class);
    	
    	StudentOperations ops = container.getBean(StudentOperations.class);
    	Student std = new Student(455,"AAAA","BBBB");
    	ops.insert(std);
    	System.out.println("Record Inserted Successfully!!");
    	 
    }
}
