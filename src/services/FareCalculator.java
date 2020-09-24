package services;

import java.time.LocalDate;


import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	
	@Override
	public double booking(int noOfPersons, int rates) {
		// TODO Auto-generated method stub
		return super.booking(noOfPersons, rates);
	}
	
	public double book(Hotel hotel) {
		
		LocalDate checkInDate = hotel.getFromdate();
		LocalDate checkOutDate = hotel.getTodate();
		
		if(hotel.getNoOfPersons() == 1) {
			hotel.setOccupancy("Single");
		}
		else if(hotel.getNoOfPersons() == 2) {
			hotel.setOccupancy("Double");
		}
		
		else if(hotel.getNoOfPersons()%2 == 0 && hotel.getNoOfPersons() > 2) {
			int o = hotel.getNoOfPersons()/2;
			hotel.setOccupancy("%d Double");
		}
		
		if(checkInDate.isBefore(checkOutDate)) {
			totalFare = hotel.getNoOfPersons()*hotel.getRates();
		}
		return totalFare;
		
		
	}
	
	public double book(Flight flight) {
		
		totalFare = flight.getNoOfPersons()*flight.getRates();
		return totalFare;
	}
	
	public double book(Train train) {
		totalFare = train.getNoOfPersons()*train.getRates();
		return totalFare;
		
		
	}
	
	public double book(Bus bus) {
		
		totalFare =  bus.getNoOfPersons()*bus.getRates();
		return totalFare;
		
		
	}
	
}