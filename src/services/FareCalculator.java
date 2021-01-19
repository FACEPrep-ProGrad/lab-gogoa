package services;

import java.time.temporal.ChronoUnit;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		int noOfPersons=hotel.getNoOfPersons();
		int noOfRooms;
		//int days=(int) ChronoUnit.DAYS.between(hotel.getFromdate(), hotel.getTodate())+1;
		double fare = 0;
		if(noOfPersons%2!=0) {
			noOfRooms=(int) (((noOfPersons-1)*0.5)+1);
		}
		else {
			noOfRooms=(noOfPersons)/2;
		}
		int compareValue = hotel.getFromdate().compareTo(hotel.getTodate());
		if(compareValue<=0) {
			if(hotel.getOccupancy().equals("single")) {
				fare= booking(noOfRooms*hotel.getNoOfPersons(),hotel.getRates());
			}else
		 fare= booking(noOfRooms,hotel.getRates());
		}
		return fare;
	}
	
	public double book(Flight flight) {
		int compareValue = 0;
		double fare=0;
		if(!flight.getTriptype().equals("one-way")) {
			 compareValue = flight.getFrom().compareTo(flight.getTo());
		}
		if(compareValue>=0) {
			fare=booking(flight.getNoOfPersons(),flight.getRates());
		}
		return fare;
	}
	
	public double book(Bus bus) {
		double fare=0;
		fare = booking(bus.getNoOfPersons(),bus.getRates());
		return fare;
	}
	public double book(Train train) {
		double fare=0;
		fare = booking(train.getNoOfPersons(),train.getRates());
		return fare;
	}
}

