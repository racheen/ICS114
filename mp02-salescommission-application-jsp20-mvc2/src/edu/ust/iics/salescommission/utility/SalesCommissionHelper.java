package edu.ust.iics.salescommission.utility;

import java.sql.Connection;
import java.text.DecimalFormat;

import edu.ust.iics.salescommission.model.SalesCommissionBean;

public class SalesCommissionHelper {
	public static SalesCommissionBean getInstance(String name, String code, double amount, Connection connection){
		DecimalFormat decFor = new DecimalFormat("#.##");
		SalesCommissionBean sc = new SalesCommissionBean(); 
		sc.setName(name);
		sc.setCode(code);
		sc.setAmount(Double.parseDouble(decFor.format(amount)));
		sc.computeGrossCommission() ;
		sc.computeCommission();
		sc.computeTakeHomePay();
		
		if(sc.getTakeHome()>2500 && sc.getCode().equals("A")){
			sc.insertRecord(connection, "salescodea");
		}
		else if(sc.getTakeHome()>2000 && sc.getCode().equals("B")){
			sc.insertRecord(connection, "salescodeb");
		}
		else if(sc.getTakeHome()>1500 && sc.getCode().equals("C")){
			sc.insertRecord(connection, "salescodec");
		}
		
		return sc;
	}
}
