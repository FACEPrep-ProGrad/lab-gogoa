package services;

import model.*;

// Type your code
public class FareCalculator extends Booking
{
	double fare=0;
	public double book(Hotel hotel)
	{
		
		if(hotel.getFromdate().isBefore(hotel.getTodate()))
		{
			if(hotel.getNoOfPersons()==1)
				hotel.setOccupancy("Single");
			else if(hotel.getNoOfPersons()==3)
				hotel.setOccupancy("Double "+"Single");
			fare= hotel.getNoOfPersons()*hotel.getRates();
		}
		 return fare;
	}
	public double book(Flight flight)
	{
		
		 if(flight.getTriptype()=="one-way") {
			 fare=flight.getNoOfPersons()*flight.getRates();
			 return fare;
		 }
		 else if(flight.getTriptype()=="round") {
			 if(flight.getFrom().isBefore(flight.getTo())) {
				 fare=flight.getNoOfPersons()*flight.getRates();
				 return fare;
			 }
			 System.out.println("Enter valid date");
		 }
		 return fare;
	}
	public double book(Train train)
	{
		return booking(train.getNoOfPersons(),train.getRates());
	}
	public double book(Bus bus)
	{
		return booking(bus.getNoOfPersons() ,bus.getRates());
	}

}