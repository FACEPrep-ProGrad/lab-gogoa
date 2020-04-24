package services;

import model.*;

// Type your code

/*Create a class called as FareCalculator.
FareCalculator should extend the Booking Class and should use the booking method defined in Booking Class.
FareCalculator has 4 methods as mentioned below.
public double book(Hotel hotel)
public double book(Flight flight)
public double book(Train train)
public double book(Bus bus)
Each method should return the user details and total fare


In the public double book(Hotel hotel)method inside the FareCalculator.
Check-In date should be less than Check-Out date.
Single occupancy can be given only for 1 guest.
If there are 3 guests then the rooms alloted should be 1 Double Occupancy room and 1 Single Occupancy.
Calculate the total fare after these conditions are met.
*/
 public class FareCalculator extends Booking{
	 
	 double fare=0;
	 
	 public double book(Hotel hotel) {
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
	 
	 
	 public double book(Flight flight) {
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
	 
	 
	 public double book(Train train) {
		 return booking(train.getNoOfPersons(),train.getRates());
	 }
	 
	 
	 public double book(Bus bus) {
		 return booking(bus.getNoOfPersons(),bus.getRates());
	 }
 }