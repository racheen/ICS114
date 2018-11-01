package edu.ust.iics.salescommission.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

import edu.ust.iics.salescommission.model.SalesCommissionBean;
import edu.ust.iics.salescommission.utility.*;

public class ProcessComputeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection = null;
	
	public void init() throws ServletException { 
		connection = DBConnectionUtil.getConnection(getServletContext());
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name").concat("");
		String code = request.getParameter("code").concat("");
		double amount = Double.parseDouble(request.getParameter("sales"));
		
		SalesCommissionBean sc = SalesCommissionHelper.getInstance(name, code, amount, connection);
		
		if (sc.isValidSalesAmount(amount)==true && sc.isValidSalesCode(code)==true){
				getServletContext().setAttribute("TakeHomePay", sc);
				response.sendRedirect("result.jsp");
		} else
			response.sendRedirect("errorpage.jsp");
		
	}

}
