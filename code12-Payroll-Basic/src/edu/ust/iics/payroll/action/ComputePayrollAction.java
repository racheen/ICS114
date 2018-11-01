package edu.ust.iics.payroll.action;

import edu.ust.iics.payroll.helper.TaxRate;

public class ComputePayrollAction implements TaxRate{
	
	public String execute(){
		int hoursWorked = 65;
		double payRate = 1000;
		
		if (hoursWorked < 0){
			
			return "error";
			
		} else {
			double basicPay = (hoursWorked <= 40) ? hoursWorked * payRate : 40 * payRate;
			double overTimePay = (hoursWorked >= 40) ? (hoursWorked - 40) * payRate * 1.5: 0;
			double grossPay = basicPay + overTimePay;
		
			double taxRate = 0;
			if (grossPay < 10000){
				taxRate = grossPay * LT10K;
			}else if (grossPay < 15000){
				taxRate = grossPay * LT15K;
			}else if (grossPay < 20000){
				taxRate = grossPay * LT20K;
			}else if (grossPay < 25000){
				taxRate = grossPay * LT25K;
			}else if (grossPay < 30000){
				taxRate = grossPay * LT30K;
			}else if (grossPay < 40000){
				taxRate = grossPay * LT40K;
			}else if (grossPay >= 45000){
				taxRate = grossPay * GTE40K;
			}
			
			double netPay = grossPay - taxRate;
			
			System.out.println("Hours Worked: " + hoursWorked);
			System.out.println("Pay Rate: Php" + payRate);
			System.out.println("Basic Rate: Php" + basicPay);
			System.out.println("Overtime Pay: Php" + overTimePay);
			System.out.println("Gross Pay: Php" + grossPay);
			System.out.println("Withholding Tax: Php" + taxRate);
			System.out.println("Net Pay: Php" + netPay);
			
			return "success";
		}
	}
}
