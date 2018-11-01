package edu.ust.iics.payroll.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeBean {

	private int hoursWorked;
	private double payRate;
	private String lastName; 
	private String firstName;
	private String empId;
	
	//computed value
	private double basicPay;
	private double overTimePay;
	private double grossPay;
	private double taxRate;
	private double netPay;
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		System.out.println("setHoursWorked executed - received " + hoursWorked);
		this.hoursWorked = hoursWorked;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		System.out.println("setPayRate executed - received " + payRate);
		this.payRate = payRate;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getOverTimePay() {
		return overTimePay;
	}

	public void setOverTimePay(double overTimePay) {
		this.overTimePay = overTimePay;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	
	private void insertRecord(Connection conn){
		try{
			String sql = "insert into SweldoNgEmpleyado (id, lastName, firstName, hoursWorked, payRate, basicPay, overTimePay, grossPay, tax, netPay)" + "values(?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			pstmnt.setString(1, empId);
			pstmnt.setString(2, lastName);
			pstmnt.setString(3, firstName);
			pstmnt.setInt(4, hoursWorked);
			pstmnt.setDouble(5, payRate);
			pstmnt.setDouble(6, basicPay);
			pstmnt.setDouble(7, overTimePay);
			pstmnt.setDouble(8, grossPay);
			pstmnt.setDouble(9, taxRate);
			pstmnt.setDouble(10, netPay);
			
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
}
