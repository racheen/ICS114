package edu.ust.iics.forex.model;
import edu.ust.iics.forex.utility.ForexRate;

public class ForexBean implements ForexRate{
	
	private int phpAmount;
	private String currency;
	private double results;
	
	public int getPhpAmount() {
		return phpAmount;
	}
	public void setPhpAmount(int phpAmount) {
		this.phpAmount = phpAmount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}
	public void process() {
		switch(currency) {
		case "US$":
			setResults(getPhpAmount()/US$);
			break;
		case "EURO":
			setResults(getPhpAmount()/EURO);
			break;
		case "YEN":
			setResults(getPhpAmount()/YEN);
			break;
		case "AUS$":
			setResults(getPhpAmount()/AUS$);
			break;
		}
	}
	
	
}
