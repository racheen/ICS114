package edu.ust.iics.gasolineestore.model;
import java.sql.*;

import edu.ust.iics.gasolineestore.utility.CalculatorNotation;

public class CalculatorBean implements CalculatorNotation{
	
	
    private int operand1;
    private int operand2;
    private String operator;
    private float result;
    private String notes;
    private String output;
    
	public int getOperand1() {
		return operand1;
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	
	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	public void calculate(int o1, int o2, String op){
		switch(op){
			case "+": setResult(o1 + o2 ); break;
			case "-": setResult(o1 - o2 ); break;
			case "*": setResult(o1 * o2 ); break;
			case "/": 
				if (o2==0){
					break;
				}else{
					setResult(o1 / o2);
				}break;
		}
	}
	
	public void toNote(int o1, int o2, String op){
		switch(op){
			case "+": 
					setOutput("The " + sum + "of " + o1 + " and " + o2 + " is " + getResult());
					setNotes("addition");
					break;
			case "-": 
					setOutput("The " + dif + "of " + o1 + " and " + o2 + "is " + getResult());
					setNotes("subtraction");
					break;
			case "*": 
					setOutput("The " + pro + "of " + o1 + " and " + o2 + "is " + getResult()); 
					setNotes("multiplication");
					break;
			case "/": 
					setOutput("The " + quo + "of " + o1 + " and " + o2 + "is " + getResult()); 
					setNotes("division");
					break;
		}
	}
	
	public void insertRecord(Connection conn){
		try{
			String sql = "insert into calculator (operand1, operand2, operator, result, notes)" + "values(?,?,?,?,?)";
			
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			pstmnt.setFloat(1, operand1);
			pstmnt.setFloat(2, operand2);
			pstmnt.setString(3, operator);
			pstmnt.setFloat(4, result);
			pstmnt.setString(5, notes);
			
			//set the commit to false
			conn.setAutoCommit(false);
			
			//now commit to database
			pstmnt.executeUpdate();
			
			conn.commit();
			
		} catch (SQLException sqle){
			sqle.printStackTrace();
			
			try{
				conn.rollback();
			}catch (SQLException sqle2){
				sqle2.printStackTrace();
			}
		}
		
	}
	
	public ResultSet getAllRecords(Connection conn){
		ResultSet records = null;
		try{
			String sql = "select * from calculator";
			
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			
			records = pstmnt.executeQuery();
		} catch (SQLException sqle){
			sqle.printStackTrace();
		}
		return records;
	}
}
