package demo.annotaiontconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.annotaiontconfiguration.beans.Emp;
import demo.annotaiontconfiguration.beans.MessageProcessor;
import demo.annotaiontconfiguration.beans.Student;
import demo.annotaiontconfiguration.config.ProjectConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container =
    			new AnnotationConfigApplicationContext(ProjectConfig.class);
    	
    	// Bean using @Bean annotation
//    	Student stud = container.getBean(Student.class);
//    	System.out.println(stud);
//    	
    	// Bean using @Component annotation
//    	Emp emp = container.getBean(Emp.class);
//    	emp.setEmpid(100);
//    	emp.setEmpname("Rakesh");
//    	System.out.println(emp);
    	
    	MessageProcessor msg = container.getBean(MessageProcessor.class);
    	msg.processMsg("Hello");
    	
    }
}
