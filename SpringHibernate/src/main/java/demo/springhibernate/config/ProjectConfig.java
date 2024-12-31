package demo.springhibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.springhibernate.beans.Student;

@Configuration
@ComponentScan(basePackages = {"demo.springhibernate"})
public class ProjectConfig {
	
	
	@Bean
	public SessionFactory getSessionFactory()
	{
			Properties properties = new Properties();
			properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/teamlease");
			properties.setProperty(Environment.USER, "root");
			properties.setProperty(Environment.PASS, "demodemo!");
			
			properties.setProperty(Environment.SHOW_SQL, "true");
			properties.setProperty(Environment.HBM2DDL_AUTO , "update"); // if table is not available hibernate will create new table
			
			org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
			config.setProperties(properties);
			config.addAnnotatedClass(Student.class);
			
			return config.buildSessionFactory();		
		
	}

}
