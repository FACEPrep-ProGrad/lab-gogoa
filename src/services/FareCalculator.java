package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		if (hotel.getNoOfPersons() == 1)
			hotel.setOccupancy("single");
		else if (hotel.getNoOfPersons() >= 3) {
			String msg=String.format("%d Double Occupancy and %d Single Occupancy", (int)hotel.getNoOfPersons()/2,hotel.getNoOfPersons()%2);
			hotel.setOccupancy(msg);
		}
		if(hotel.getFromdate() != null && hotel.getTodate() != null && hotel.getFromdate().isBefore(hotel.getTodate())) {
			return super.booking(hotel.getNoOfPersons(), hotel.getRates());
		}
		else {
			System.out.println("Invalid Date");
			return 0.0;
		}
	}
	public double book(Flight flight) {
		if(flight.getFrom() != null && flight.getTo() != null && flight.getFrom().isBefore(flight.getTo())) {
			if (flight.getTriptype().equals("one-way"))
				return super.booking(flight.getNoOfPersons(),flight.getRates());
			else
				return 2*super.booking(flight.getNoOfPersons(),flight.getRates());
		}
		else {
			System.out.println("Invalid Date");
			return 0.0;
		}
		
	}
	public double book(Train train) {
		return super.booking(train.getNoOfPersons(), train.getRates());
	}
	public double book(Bus bus) {
			return super.booking(bus.getNoOfPersons(), bus.getRates());
	}
	
}