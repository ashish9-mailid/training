

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
	private static Connection connection;
	static
	{
		//Load the JDBC Driver
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//oracle.jdbc.driver.OracleDriver
				
			
				// Database connection
				//jdbc:oracle:thin@localhost:1521/orcl"
				try {
					 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
					if(connection != null)
					{
						System.out.println("Connection done...");
					}
					else
					{
						System.out.println("Connection error..");
					}
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public static void main(String[] args) {
		
		
		
		
	}

}
