package edu.ust.iics.forex.controller;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ust.iics.forex.model.ForexBean;
import edu.ust.iics.forex.utility.DBConnectionUtil;

import java.sql.*;

//@WebServlet("/viewalltransactions.html")
public class ListTransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection = null;
	
	public void init() throws ServletException { 
		connection = DBConnectionUtil.getConnection(getServletContext());
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
