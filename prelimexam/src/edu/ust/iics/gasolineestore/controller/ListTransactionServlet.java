package edu.ust.iics.gasolineestore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ust.iics.gasolineestore.model.CalculatorBean;
import edu.ust.iics.gasolineestore.utility.DBConnectionUtil;

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
			ResultSet records = new CalculatorBean().getAllRecords(connection);
			
			request.setAttribute("calculator", records);
			request.getRequestDispatcher("viewallrecords.jsp").forward(request, response);;
		} else {
			System.err.println("connection is NULL.");
		}
	}

}
