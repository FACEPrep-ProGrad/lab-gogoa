package model;

import java.time.LocalDate;

/*
 Progression - 4
Create a parent class called Bus inside the model package with the following arguments
private int noOfPersons
private String busType
private int rates
private LocalDate date
Generate appropriate getters and setters.
Generate the constructor Bus(int noOfPersons, int rates, String busType, LocalDate date) in Bus class.
 */
public class Bus{
	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;
	public Bus(int noOfPersons, String busType, int rates, LocalDate date) {
		super();
		this.noOfPersons = noOfPersons;
		this.busType = busType;
		this.rates = rates;
		this.date = date;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}