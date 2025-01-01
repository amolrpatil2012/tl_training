package demo.springjpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"demo.springjpa.beans"})
public class ProjectConfig {

}
