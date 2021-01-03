package ServletProject;
//import javax.servlet.ServletException;




//import com.mysql.jdbc.Connection;

import java.lang.*;

import java.sql.*;
import java.sql.DriverManager;

public class DatabasePro {
 
		// TODO Auto-generated method stub
		public static Connection initialDatabase() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.jdbc.Driver");
	Connection con1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1?useSSL=false","dinesh","D!ne$h123");
			
			return con1;
			
			
		}
		
}
	
	
	

	
