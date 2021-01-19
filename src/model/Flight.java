package model;

import java.time.LocalDate;
//Type your code
public class Flight{
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private int noOfPersons;
	private String triptype;
	public Flight(int noOfPersons,int rates,  String classType, LocalDate from, LocalDate to,  String triptype) {
		super();
		this.classType = classType;
		this.rates = rates;
		this.from = from;
		this.to = to;
		this.noOfPersons = noOfPersons;
		this.triptype = triptype;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getTriptype() {
		return triptype;
	}
	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}
	
	
}