package edu.ust.iics.forex.model;
import edu.ust.iics.forex.utility.ForexRate;
import java.sql.*;

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
	
	public void process(Connection connection) {
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
		insertRecord(connection);
	}
	
	private void insertRecord(Connection conn){
		try{
			String sql = "insert into forex (phpAmount, currency, results)" + "values(?,?,?)";
			
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			pstmnt.setInt(1, phpAmount);
			pstmnt.setString(2, currency);
			pstmnt.setDouble(3, results);
			
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
	
	public ResultSet getAllRecords(Connection conn){
		ResultSet records = null;
		try{
			String sql = "select * from Forex";
			
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			
			records = pstmnt.executeQuery();
		} catch (SQLException sqle){
			sqle.printStackTrace();
		}
		return records;
	}
}
