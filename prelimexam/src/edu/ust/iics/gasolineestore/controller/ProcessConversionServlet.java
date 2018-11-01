package edu.ust.iics.gasolineestore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ust.iics.gasolineestore.model.CalculatorBean;
import edu.ust.iics.gasolineestore.utility.DBConnectionUtil;
import edu.ust.iics.gasolineestore.utility.CalculatorHelper;

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
		
		int operand1 = Integer.parseInt(request.getParameter("operand1"));
		String operator = request.getParameter("operator");
		int operand2 = Integer.parseInt(request.getParameter("operand2"));
		
		if (operand2 == 0 && operator.equals("/")){
			response.sendRedirect("errorpage.jsp");
		}else{
		//step 3: create and populate bean
		CalculatorBean calculator = CalculatorHelper.getInstance(operand1, operator, operand2, connection);
		
		//step 4: store the bean in request
		getServletContext().setAttribute("calculator", calculator);
		//step 5: forward the request object to jsp
		response.sendRedirect("displayvalues.jsp");
		}
	}

}
