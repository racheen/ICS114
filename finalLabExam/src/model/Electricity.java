package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import helper.ElectricityRate;

@Entity (name="MeralcoPaymentBill")
public class Electricity implements ElectricityRate {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private int kilowattHours;
	private double initialBill;
	private double finalBill;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKilowattHours() {
		return kilowattHours;
	}
	public void setKilowattHours(int kilowattHours) {
		this.kilowattHours = kilowattHours;
	}
	public double getInitialBill() {
		return initialBill;
	}
	public void setInitialBill(double initialBill) {
		
		this.initialBill = initialBill;
	}
	
	public double getFinalBill() {
		return finalBill;
	}
	public void setFinalBill(double finalBill) {
		this.finalBill = finalBill;
	}
	
	public double computeInitial(int kilowattHours, double initialBill, double excess){
		if (kilowattHours <= 250){
			initialBill = kilowattHours * NORMALRATE; 
		}else{
			initialBill = (NORMALPRICE * NORMALRATE) + (excess * HIGHRATE); 
		}
		return initialBill;
	}
	
	public double computeFinal(double initialBill, double finalBill){
		finalBill = initialBill + (initialBill * TAX);
		return finalBill;
	}
	
}
