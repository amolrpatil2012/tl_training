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
	
	// Create Student
	public void insert ( int roll , String fName , String lName)
	{
		
			String sql = "Insert Into Student Values (? , ? ,? ) ";
			jt.update ( sql , roll , fName, lName);
	
	}
	
	// Delete Student
	public void delete ( int roll )
	{
		String sql = "Delete From Student Where Roll = "+roll;
		jt.execute(sql);
	}
	
	// Update Student
	public void update ( int roll , String fname , String lname )
	{
		String sql = "Update Student Set firstname = ? , lastname =? where roll = ? ";
		jt.update ( sql , fname, lname, roll);
	}
	
	// Read Student
	

	
	
	
	
	

}
