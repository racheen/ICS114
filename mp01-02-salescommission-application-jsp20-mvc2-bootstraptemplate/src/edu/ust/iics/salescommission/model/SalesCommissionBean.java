package edu.ust.iics.salescommission.model;


import java.text.DecimalFormat;

import edu.ust.iics.salescommission.utility.SalesCommissionCode;

public class SalesCommissionBean implements SalesCommissionCode{
	private String name;
	private String code;
	private double amount;
	private double grossCommission;
	private double commission;
	private double takeHome;
	DecimalFormat decFor = new DecimalFormat("#.##");
	
	public double getTakeHome() {
		return takeHome;
	}
	public void setTakeHome(double takehome) {
		this.takeHome = takehome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getGrossCommission() {
		return grossCommission;
	}
	public void setGrossCommission(double grossCommission) {
		this.grossCommission = grossCommission;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double computeCommission() {
		if (amount > 2500) 
			setCommission(amount * 0.075);
		else
			setCommission(0.00);
		return commission;
	}

	public double computeTakeHomePay() {
		setTakeHome(grossCommission + commission); 
		return takeHome;
	}
	
	public double computeGrossCommission() {
		switch (code){
		case "A": setGrossCommission(Double.parseDouble(decFor.format(AGrossAdd + (amount * APercentageSales)))); break;
		case "B": setGrossCommission(Double.parseDouble(decFor.format(BGrossAdd + (amount * BPercentageSales)))); break;
		case "C": setGrossCommission(Double.parseDouble(decFor.format(CGrossAdd + (amount * CPercentageSales)))); break;
		}
		return grossCommission;
	}
	
	public boolean isValidSalesCode(String salesCode) {
		switch (salesCode){
		case "A": case "B": case "C": return true;
		}
		return false;
	}

	public boolean isValidSalesAmount(double salesAmount) {
		if (salesAmount < 1) 
			return false;
		return true;
	}
	
	public boolean isValidName(String name) {
		if (name.matches("[a-zA-Z]")){
			return true;
		}
			return false;
	}

}