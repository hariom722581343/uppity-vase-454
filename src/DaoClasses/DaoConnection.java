package DaoClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConnection {
	public static Connection provideConnection() {
		 Connection con =null;
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		 
		 String url = "jdbc:mysql://localhost:3306/hr_management";
		 
		 try {
				con = DriverManager.getConnection(url,"root","1432");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 
		 return con;
	 }
}

//