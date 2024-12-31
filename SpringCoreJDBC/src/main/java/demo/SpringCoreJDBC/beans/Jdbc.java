package demo.SpringCoreJDBC.beans;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Jdbc {
	
	
	JdbcTemplate jt;

	@Autowired
	public Jdbc(DataSource ds) {		// ds -- will be injected -- created in ProjectConfig
		
		jt = new JdbcTemplate(ds);
		
	}
	
	public void insert ( int roll , String fName , String lName)
	{
		String sql = "Insert Into Student Values ( ? , ? ,? ) ";
		jt.update ( sql , roll , fName, lName);
	}
	
	
	

}
