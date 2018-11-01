package edu.ust.iics.forex.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.ust.iics.forex.model.ForexBean;
import edu.ust.iics.forex.utility.ForexHelper;

@WebServlet("/ProcessCoversionServlet")
public class ProcessCoversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step 2: get values from the form
		int phpAmount = Integer.parseInt(request.getParameter("phpAmount"));
		String currency = request.getParameter("currencyType");
		
		//step 3: create and populate bean
		ForexBean forex = ForexHelper.getInstance(phpAmount, currency);
		
		//step 4: store the bean in request
		getServletContext().setAttribute("palitanNgPera", forex);
		//step 5: forward the request object to jsp
		response.sendRedirect("displayvalues.jsp");
	}

}
