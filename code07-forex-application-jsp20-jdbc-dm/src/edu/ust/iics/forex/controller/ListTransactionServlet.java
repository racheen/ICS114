package edu.ust.iics.forex.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ust.iics.forex.model.ForexBean;

import java.sql.*;

@WebServlet("/viewalltransactions.html")
public class ListTransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection = null;
	
	public void init() throws ServletException { 
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tumulak-3csa-ics114-db","root","");
													//JBDC URL, db user, db password
			
			System.out.println((connection != null)
					?"successful connection"
					:"unable to connect to db server");
			
		} catch (ClassNotFoundException cfne){
			cfne.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (connection != null){
			ResultSet records = new ForexBean().getAllRecords(connection);
			
			//store the bean in request
			request.setAttribute("forexRecords", records);
			
			//forward ResutlSet to JSP for view
			request.getRequestDispatcher("viewallrecords.jsp").forward(request, response);
		} else {
			System.err.println("connection is NULL.");
		}
	}

}
