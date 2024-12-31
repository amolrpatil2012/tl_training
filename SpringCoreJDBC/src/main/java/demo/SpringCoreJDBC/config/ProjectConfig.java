package demo.SpringCoreJDBC.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * 	1. Create package config
 *  2. Create class ProjectConfig
 * 
 */


// defines current class contains beans and componentscan
@Configuration
@ComponentScan (basePackages = {"demo.SpringCoreJDBC"})
public class ProjectConfig {
	
	// This object will be managed by Spring Container
	// DataSource i/f --> DriverManagerDataSource -- implements DataSource
	@Bean
	public DataSource getDataSourceBean()
	{
		String url = "jdbc:mysql://localhost:3306/teamlease";
		String username = "root";
		String password = "demodemo!";
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setUrl(url);
		d.setUsername(username);
		d.setPassword(password);
		return d;
		
	}

}
