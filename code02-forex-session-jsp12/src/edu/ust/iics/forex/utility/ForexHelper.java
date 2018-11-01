package edu.ust.iics.forex.utility;

import edu.ust.iics.forex.model.ForexBean;

public class ForexHelper{
	
	public static ForexBean getInstance(int phpAmount, String currency) {
		
		ForexBean forex = new ForexBean();
		forex.setPhpAmount(phpAmount);
		forex.setCurrency(currency);
		forex.process();
		
		return forex;
	}
}
