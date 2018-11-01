package edu.ust.iics.gasolineestore.utility;

import java.sql.*;

import edu.ust.iics.gasolineestore.model.GasolineBean;
public class GasolineHelper{
	
	public static GasolineBean getInstance(String fuelType, double liters, Connection conn) {
		
		GasolineBean gb = new GasolineBean();
		gb.setFuelType(fuelType);
		gb.putPricePerLiter();
		gb.computePurchaseAmount(fuelType, liters);
		gb.computeVat();
		gb.computeTotalAmount();
		gb.insertRecord(conn);
		gb.numberToWord();
		
		return gb;
	}
}
