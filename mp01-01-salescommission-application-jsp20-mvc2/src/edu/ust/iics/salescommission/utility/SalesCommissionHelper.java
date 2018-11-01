package edu.ust.iics.salescommission.utility;

import java.text.DecimalFormat;

import edu.ust.iics.salescommission.model.SalesCommissionBean;

public class SalesCommissionHelper {
	public static SalesCommissionBean getInstance(String name, String code, double amount){
		DecimalFormat decFor = new DecimalFormat("#.##");
		SalesCommissionBean sc = new SalesCommissionBean(); 
		sc.setName(name);
		sc.setCode(code);
		sc.setAmount(Double.parseDouble(decFor.format(amount)));
		sc.computeTakeHomePay() ;
		sc.computeCommission();
		
		return sc;
	}
}
