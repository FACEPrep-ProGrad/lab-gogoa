package model;

import java.time.LocalDate;

// Type your code
//parent class called Bus
public class Bus{
	private int noOfPersons;
	private int rates;
	private String busType;
	private LocalDate date;
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Bus(int noOfPersons, int rates, String busType, LocalDate date) {
		super();
		this.noOfPersons = noOfPersons;
		this.rates = rates;
		this.busType = busType;
		this.date = date;
	}
	
	
}