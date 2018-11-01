package edu.ust.iics.forex.utility;

import java.sql.*;
import javax.servlet.ServletConfig;

public class DBConnectionUtil {
	
	public static Connection getConnection(ServletConfig config){
		Connection connection = null;
		try {
			//load the driver
			Class.forName(config.getInitParameter("jdbcDriver"));
			
			connection = DriverManager.getConnection(config.getInitParameter("jdbcURL"),config.getInitParameter("dbUserName"),config.getInitParameter("dbPassword"));
		
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
