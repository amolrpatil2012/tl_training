package demo.springhibernate;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.springhibernate.beans.Student;
import demo.springhibernate.beans.StudentOperations;
import demo.springhibernate.config.ProjectConfig;



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
    	 Student s = new Student(15, "ABCD", "XYZ");
    	// ops.insert(s);
    	// System.out.println("Record Inserted Successfully!!");
    	 
    	 List<Student> list =ops.getAllStudents(); 
    	 list.forEach(System.out::println);
    	 
         
    	 
    	 
    	 
    }
}
