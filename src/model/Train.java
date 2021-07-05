package model;

import java.time.LocalDate;

/*
Progression - 3
Create a parent class called Train inside the model package with the following arguments
private int noOfPersons
private String berth
private int rates
private LocalDate date
Generate appropriate getters and setters.
Generate the constructor Train(int noOfPersons, int rates, String berth, LocalDate date) in Train class.
*/

public class Train{
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	public Train(int noOfPersons, String berth, int rates, LocalDate date) {
		super();
		this.noOfPersons = noOfPersons;
		this.berth = berth;
		this.rates = rates;
		this.date = date;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
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