package edu.ust.iics.salescommission.utility;

import java.sql.*;
import javax.servlet.ServletContext;

public class DBConnectionUtil {
	
	public static Connection getConnection(ServletContext context){
		Connection connection = null;
		try {
			//load the driver
			Class.forName(context.getInitParameter("jdbcDriver"));
			
			connection = DriverManager.getConnection(context.getInitParameter("jdbcURL"),context.getInitParameter("dbUserName"),context.getInitParameter("dbPassword"));
		
			System.out.println((connection != null)
					?"successful connection"
					:"unable to connect to db server");
			
		} catch (ClassNotFoundException cfne){
			cfne.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return connection;
	}
}
