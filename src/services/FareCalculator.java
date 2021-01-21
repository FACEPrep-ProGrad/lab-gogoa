package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		 if(hotel.getFromdate().isBefore(hotel.getTodate())) {
			 int rooms = (hotel.getNoOfPersons()/2)+hotel.getNoOfPersons()%2;
			 return hotel.getRates()*rooms;
		 }
		 return 0;
	}
	public double book(Flight flight) {
		double fare = 0;
		if(flight.getFrom().isBefore(flight.getTo())) {
		if(flight.getTriptype().equals("one-way-trip")) {
			fare =  flight.getNoOfPersons() *flight.getRates();
		}else {
			fare =  flight.getNoOfPersons() *flight.getRates()*2;
		}
		}
		return fare;
	}
	public double book(Train train) {
		double fare = train.getNoOfPersons() *train.getRates();
		return fare;
	}
	public double book(Bus bus) {
		return bus.getRates()*bus.getNoOfPersons();
	}
}