package edu.ust.iics.forex.utility;

import java.sql.*;
import javax.servlet.ServletContext;
import javax.sql.*;
import javax.naming.*;


public class DBConnectionUtil {
	
	public static Connection getConnection(ServletContext context){
		
		Connection connection = null;
		
		try {
			
		/*	Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/ICS114-3CSA-DS");
			connection = ds.getConnection();*/
			
			connection = ((DataSource) InitialContext.doLookup(context.getInitParameter("jndiLookUpKey"))).getConnection();
			
		} catch (NamingException ne){
			ne.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return connection;
	}
}
