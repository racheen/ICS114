package edu.ust.iics.gasolineestore.utility;

import java.sql.*;

import edu.ust.iics.gasolineestore.model.CalculatorBean;
public class CalculatorHelper{
	
	public static CalculatorBean getInstance(int o1, String op, int o2, Connection conn) {
		
		CalculatorBean c = new CalculatorBean();
		c.setOperand1(o1);
		c.setOperand2(o2);
		c.setOperator(op);
		c.calculate(c.getOperand1(),c.getOperand2(),c.getOperator());
		c.toNote(c.getOperand1(),c.getOperand2(),c.getOperator());
		c.insertRecord(conn);
		
		return c;
	}
}
