package demo.SpringCoreJDBC;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.SpringCoreJDBC.beans.Jdbc;
import demo.SpringCoreJDBC.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext container =
        		new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Jdbc j = container.getBean(Jdbc.class);
        //j.insert(4, "Virat", "PQR");
        //System.out.println(" Record Inserted");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No of Student to Update");
        int roll = scanner.nextInt();
        System.out.println("Enter New First Name : ");
        String fname = scanner.next();
        System.out.println("Enter New Last Name : ");
        String lname = scanner.next();
        
        j.update(roll	, fname , lname);
        System.out.println("Record Updated Successfully !!");
        
    }
}
