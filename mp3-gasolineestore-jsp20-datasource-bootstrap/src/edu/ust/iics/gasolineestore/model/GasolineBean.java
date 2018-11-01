package edu.ust.iics.gasolineestore.model;
import java.sql.*;

import edu.ust.iics.gasolineestore.utility.GasolineRate;

public class GasolineBean implements GasolineRate{
	
	private String fuelType;
	private double pricePerLiter;
	private double purchaseAmount;
	private double vat;
	private double totalAmount;
	private String numberInWords;
	
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getPricePerLiter() {
		return pricePerLiter;
	}

	public void setPricePerLiter(double pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getNumberInWords() {
		return numberInWords;
	}

	public void setNumberInWords(String numberInWords) {
		this.numberInWords = numberInWords;
	}

	public void putPricePerLiter(){
		switch (getFuelType()){
			case "Unleaded": setPricePerLiter(Unleaded); break;
			case "Diesel"  : setPricePerLiter(Diesel); break;
			case "Premium" : setPricePerLiter(Premium); break;
		}
	}
	
	public void computePurchaseAmount(String FuelType, double liters){
		switch (FuelType){
			case "Unleaded": setPurchaseAmount(Unleaded * liters); break;
			case "Diesel"  : setPurchaseAmount(Diesel * liters); break;
			case "Premium" : setPurchaseAmount(Premium * liters); break;
		}
	}
	
	public void computeVat(){
		setVat(Double.valueOf(getPurchaseAmount()*.12).intValue());
	}
	
	public void computeTotalAmount(){
		setTotalAmount(Double.valueOf(getPurchaseAmount()+getVat()).intValue());
	}
	
	private static final String[] specialNames = {
			"",
	        "ng libo",
	        "ng milyon",
	        "ng bilyon",
	        "ng trilyon",
	        "ng quadrilyon",
	        "ng quintilyon"
	};
	    
	private static final String[] tensNames = {
	        "",
	        " sampu",
	        " dalawampu",
	        " tatlumpu",
	        " apat-na-pu",
	        " limampu",
	        " anim-na-pu",
	        " pitumpu",
	        " walumpu",
	        " siyam-na-pu"
	};
	    
	private static final String[] numNames = {
	        "",
	        " isa",
	        " dalawa",
	        " tatlo",
	        " apat",
	        " lima",
	        " anim",
	        " pito",
	        " walo",
	        " siyam",
	        " sampu",
	        " labing-isa",
	        " labing-dalawa",
	        " labing-tatlo",
	        " labing-apat",
	        " labing-lima",
	        " labing-anim",
	        " labing-pito",
	        " labing-walo",
	        " labing-siyam"
	};
	
	
	private String convertLessThanOneThousand(int number) {
        String current;
        
        if (number % 100 < 20){
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            current = numNames[number % 10];
            number /= 10;
            
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + "ng daan" + current;
    }
    
    public String convert(int number) {

        if (number == 0) { return "zero"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
    }
    
    public void numberToWord(){
    	int toConvert = Double.valueOf(getTotalAmount()).intValue();
    	setNumberInWords(convert(toConvert));
    }
    
	public void insertRecord(Connection conn){
		try{
			String sql = "insert into customerpurchase (FuelType, PricePerLiter, PurchaseAmount, Vat, TotalAmount)" + "values(?,?,?,?,?)";
			
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			pstmnt.setString(1, fuelType);
			pstmnt.setDouble(2, pricePerLiter);
			pstmnt.setDouble(3, purchaseAmount);
			pstmnt.setDouble(4, vat);
			pstmnt.setDouble(5, totalAmount);
			
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
			String sql = "select * from customerpurchase";
			
			PreparedStatement pstmnt = conn.prepareStatement(sql);
			
			records = pstmnt.executeQuery();
		} catch (SQLException sqle){
			sqle.printStackTrace();
		}
		return records;
	}
}
