package edu.ust.iics.gasolineestore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ust.iics.gasolineestore.model.GasolineBean;
import edu.ust.iics.gasolineestore.utility.DBConnectionUtil;
import edu.ust.iics.gasolineestore.utility.GasolineHelper;

import java.sql.*;

//@WebServlet("/ProcessCoversionServlet")
public class ProcessConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection = null;
	
	public void init() throws ServletException {
		connection = DBConnectionUtil.getConnection(getServletContext());
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String FuelType = request.getParameter("gasolineType");
		double liters = Double.parseDouble(request.getParameter("liters"));
		
		//step 3: create and populate bean
		GasolineBean g = GasolineHelper.getInstance(FuelType, liters, connection);
		
		//step 4: store the bean in request
		getServletContext().setAttribute("gasolina", g);
		//step 5: forward the request object to jsp
		response.sendRedirect("displayvalues.jsp");
	}

}
