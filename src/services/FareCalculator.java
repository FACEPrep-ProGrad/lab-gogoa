package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	
	
	public double book(Hotel hotel) {
		
		
		if(hotel.getFromdate().compareTo(hotel.getTodate())<=0) {
			
			int total_occ=hotel.getNoOfPersons();
			total_occ=(int)(total_occ/2)+(total_occ%2);
			hotel.setOccupancy(String.valueOf(total_occ));
			
			return booking(hotel.getNoOfPersons(),hotel.getRates());
		}
		
			
		return 0;
		
	}
	public double book(Flight flight) {
		

		
		//System.out.println(flight.getFrom().compareTo(flight.getTo()));
		if(flight.getFrom().compareTo(flight.getTo())<=0) {
			
			return booking(flight.getNoOfPersons(),flight.getRates());
			
			
		}
		
		
		
		return 0;
		
	}
	public double book(Train train) {
		
		return booking(train.getNoOfPersons(),train.getRates());
		
	}
	public double book(Bus bus) {
		
		
		return booking(bus.getNoOfPersons(), bus.getRates());
		
	}
	
	
}


// Type your code