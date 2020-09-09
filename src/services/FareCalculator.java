package services;

// Type your code
import model.*;


public class FareCalculator extends Booking{
	
	public double book(Hotel hotel) {
		if(hotel.getTodate().isAfter(hotel.getFromdate()))
			return booking(hotel.getNoOfPersons(), hotel.getRates());
		return 0;
	}
	
	public double book(Flight flight) {
		
		if(flight.getTriptype().contentEquals("one-way"))
			return booking(flight.getNoOfPersons(), flight.getRates());
		else if(flight.getTriptype().contentEquals("round trip"))
			return booking(flight.getNoOfPersons(), flight.getRates())*2;
		return 0;
	}
	
	public double book(Train train) {
		return booking(train.getNoOfPersons(), train.getRates());
	}
	
	public double book(Bus bus) {
		return booking(bus.getNoOfPersons(), bus.getRates());
	}
} 