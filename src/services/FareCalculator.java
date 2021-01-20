package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code

public class FareCalculator extends Booking{
	public double book(Hotel hotel)
	{
		//covering edge cases
		if(hotel.getNoOfPersons()<=0||hotel.getRates()<=0||hotel.getRoomType()==null
			||hotel.getFromdate()==null||hotel.getTodate()==null)
			return 0;
		else if(hotel.getFromdate().isAfter(hotel.getTodate()))
			return 0;
		else
		{
			int singleOccupancy=hotel.getNoOfPersons()%2;
			int doubleOccupancy=hotel.getNoOfPersons()/2;
			hotel.setOccupancy(singleOccupancy+"Single Occupancy,+"
					+ doubleOccupancy+" Double Occupancy");
			return booking(hotel.getNoOfPersons(),hotel.getRates());
		}
	}
	public double book(Flight flight)
	{
		//edge cases
		if(flight.getNoOfPersons()<=0||flight.getRates()<=0||flight.getTriptype()==null
				||flight.getFrom()==null||flight.getTo()==null||
				flight.getClassType()==null)
		{
			return 0;
		}
		else if(flight.getTriptype().equals("two-way"))
		{
			if(flight.getFrom().isAfter(flight.getTo()))
				return 0;
			else
				return 2*booking(flight.getNoOfPersons(),flight.getRates());
		}
		else
		{
			return booking(flight.getNoOfPersons(),flight.getRates());
		}
	}
	public double book(Train train)
	{
		//edge cases
		if(train.getNoOfPersons()<=0||train.getBerth()==null||train.getRates()<=0||
				train.getDate()==null)
			return 0;
		return booking(train.getNoOfPersons(),train.getRates());
	}
	public double book(Bus bus)
	{
		//edge cases
		if(bus.getBusType()==null||bus.getDate()==null||bus.getRates()<=0||
				bus.getNoOfPersons()<=0)
			return 0;
		return booking(bus.getNoOfPersons(),bus.getRates());
	}
}