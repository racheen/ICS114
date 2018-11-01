package edu.ust.iics.forex.utility;

import edu.ust.iics.forex.model.ForexBean;

import java.sql.*;
public class ForexHelper{
	
	public static ForexBean getInstance(int phpAmount, String currency, Connection conn) {
		
		ForexBean forex = new ForexBean();
		forex.setPhpAmount(phpAmount);
		forex.setCurrency(currency);
		forex.process(conn);
		
		return forex;
	}
}
