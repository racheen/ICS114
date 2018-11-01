package model;

import javax.persistence.*;

@Entity
public class Input {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String inputString;
	private String inputLetters;
	private String inputNumbers;
	private int totalLetters;
	private int totalNumber;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInputString() {
		return inputString;
	}
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	public String getInputLetters() {
		return inputLetters;
	}
	public void setInputLetters(String inputLetters) {
		this.inputLetters = inputLetters;
	}
	public String getInputNumbers() {
		return inputNumbers;
	}
	public void setInputNumbers(String inputNumbers) {
		this.inputNumbers = inputNumbers;
	}
	public int getTotalLetters() {
		return totalLetters;
	}
	public void setTotalLetters(int totalLetters) {
		this.totalLetters = totalLetters;
	}
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	
	
}
