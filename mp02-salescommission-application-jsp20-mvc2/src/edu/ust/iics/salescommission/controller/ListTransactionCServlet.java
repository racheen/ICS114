package edu.ust.iics.salescommission.controller;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ust.iics.salescommission.model.SalesCommissionBean;
import edu.ust.iics.salescommission.utility.DBConnectionUtil;

import java.sql.*;

//@WebServlet("/viewalltransactions.html")
public class ListTransactionCServlet extends HttpServlet {
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
			ResultSet recordsC = new SalesCommissionBean().getAllRecords(connection, "c");
			
			//store the bean in request
			request.setAttribute("salescoRecordsC", recordsC);
			
			//forward ResutlSet to JSP for view
			request.getRequestDispatcher("tablec.jsp").forward(request, response);
		} else {
			System.err.println("connection is NULL.");
		}
	}

}
