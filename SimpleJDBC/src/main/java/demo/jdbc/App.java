package demo.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        // 1.  Connect to Database
    	
    		String url = "jdbc:mysql://localhost:3306/teamlease";	// teamlease -- schema
    		String username  = "root";
    		String password = "demodemo!";
    	
    		Connection con =	DriverManager.getConnection(url,username,password);
    		
    		System.out.println("Connected");
    		
    	
    	// 2. Define Query Type
    		
    // Normal Query -- Insert Into Student Values ( 1 , 'Suresh' , 'XYZ') -- Statement
    // Parameterized Query -- Insert Into Student Values ( ? , ? , ? ) -- PreparedStatement
    // Stored Procedure -- Function defined in Database --- CallableStatement
    		
    		String sql = "Insert Into Student Values ( 3 , 'Rohit' , 'XYZ')";
    		Statement st = con.createStatement();
    		
    		
    	
    	// 3. Execute Query
    		
    		st.executeUpdate(sql);		// insert - update - delete
    		System.out.println("Inserted Successfully !!");
    		
    		con.close();
    		
    		
    }
}
