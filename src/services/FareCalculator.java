package services;

import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	public double book(Hotel hotel)
	{
		LocalDate fromdate=hotel.getFromdate();
		LocalDate todate=hotel.getTodate();
		int noOfPersons=hotel.getNoOfPersons();
		int rates=hotel.getRates();
		//String occupancy=hotel.getOccupancy();
		double total=0;
		if(todate.isAfter(fromdate))
		{
			total= super.booking(noOfPersons, rates);
		}
		return total;
		
	}
	public double book(Flight flight)
	{
		double total=0;
		String triptype=flight.getTriptype();
		int noOfPersons=flight.getNoOfPersons();
		int rates=flight.getRates();
		LocalDate from=flight.getFrom();
		LocalDate to=flight.getTo();
		
		if(triptype.equals("one-way"))
		{
			total=super.booking(noOfPersons, rates);
		}
		else
		{
			if(to.isAfter(from))
			total=super.booking(noOfPersons, rates);
			total*=2;
		}
		return total;
	}
	public double book(Train train)
	{
		int noOfPersons=train.getNoOfPersons();
		int rates=train.getRates();
		double total= super.booking(noOfPersons, rates);
		return total;
	}
	public double book(Bus bus)
	{
		int noOfPersons=bus.getNoOfPersons();
		int rates=bus.getRates();
		double total= super.booking(noOfPersons, rates);
		return total;
	}
}