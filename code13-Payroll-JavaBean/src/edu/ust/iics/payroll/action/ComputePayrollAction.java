package edu.ust.iics.payroll.action;

import edu.ust.iics.payroll.helper.TaxRate;

public class ComputePayrollAction implements TaxRate{
	
	private int hoursWorked;
	private double payRate;
	
	//computed value
	private double basicPay;
	private double overTimePay;
	private double grossPay;
	private double taxRate;
	private double netPay;

	public String execute(){
		setHoursWorked(65);
		setPayRate(1000);
		
		if (hoursWorked < 0){
			
			return "error";
			
		} else {
			setBasicPay((hoursWorked <= 40) ? hoursWorked * payRate : 40 * payRate);
			setOverTimePay((hoursWorked >= 40) ? (hoursWorked - 40) * payRate * 1.5: 0);
			setGrossPay(basicPay + overTimePay);
		
			if (grossPay < 10000){
				setTaxRate(grossPay * LT10K);
			}else if (grossPay < 15000){
				setTaxRate(grossPay * LT15K);
			}else if (grossPay < 20000){
				setTaxRate(grossPay * LT20K);
			}else if (grossPay < 25000){
				setTaxRate(grossPay * LT25K);
			}else if (grossPay < 30000){
				setTaxRate(grossPay * LT30K);
			}else if (grossPay < 40000){
				setTaxRate(grossPay * LT40K);
			}else if (grossPay >= 45000){
				setTaxRate(grossPay * GTE40K);
			}
			
			setNetPay(grossPay - taxRate);
			
			System.out.println("Hours Worked: " + getHoursWorked());
			System.out.println("Pay Rate: Php" + getPayRate());
			System.out.println("Basic Rate: Php" + getBasicPay());
			System.out.println("Overtime Pay: Php" + getOverTimePay());
			System.out.println("Gross Pay: Php" + getGrossPay());
			System.out.println("Withholding Tax: Php" + getTaxRate());
			System.out.println("Net Pay: Php" + getNetPay());
			
			return "success";
		}
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
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
	
	
}