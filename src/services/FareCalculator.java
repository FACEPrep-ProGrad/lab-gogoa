package services;

import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
import services.Booking;

// Type your code
public class FareCalculator extends Booking{
	Booking book = new Booking();  //obj of booking
	//methods
	public double book(Hotel hotel) {
		 int noOfPersons = hotel.getNoOfPersons();
		 String roomType = hotel.getRoomType();
		 int rates = hotel.getRates();
		 String occupancy = hotel.getOccupancy();
		 LocalDate fromdate = hotel.getFromdate();
		 LocalDate todate = hotel.getTodate();
		 double totalFare = 0;
		 //Check-In date should be less than Check-Out date
		 //Single occupancy can be given only for 1 guest
		 //If there are 3 guests then the rooms alloted should be 1 Double Occupancy room and 1 Single Occupancy
		 if(fromdate.isBefore(todate)) {
			 System.out.println(occupancy);
			 if((occupancy.equals("single") && noOfPersons == 1)) {
				totalFare= book.booking(noOfPersons, rates);
				System.out.println("totalFare: "+totalFare);
			 }
			 else if((occupancy.equals("double") )) {
				 if(noOfPersons <=2 && noOfPersons>0) {
					 totalFare= book.booking(noOfPersons, rates);
				 }
			 }
		 }
	  
		 return totalFare;

	}
	public double book(Flight flight) {
		int noOfPersons = flight.getNoOfPersons();
		 int rates = flight.getRates();
		 String classType = flight.getClassType();
	     LocalDate from = flight.getFrom();
		 LocalDate to = flight.getTo();
		 String triptype =flight.getTriptype();
		 double totalFare = 0;
		//If one way trip is selected then departure date is not considered for fare calculation.*
		//For round trips Start date should be less than return date.*
		 System.out.println(triptype);
		 if(triptype.equals("round-trip")) {
			 if((from.isBefore(to))){
				 totalFare= book.booking(noOfPersons, rates);
			 }
			 
		 }
		 else
			 totalFare= book.booking(noOfPersons, rates); 

		return totalFare;
		
	}
	public double book(Train train) {
		int noOfPersons = train.getNoOfPersons();
		int rates= train.getRates();
		String berth = train.getBerth();
	    LocalDate date = train.getDate();
		double totalFare = 0;
		
		 totalFare= book.booking(noOfPersons, rates); 
		     
	    return totalFare;	
		
	}
	public double book(Bus bus) {
		double totalFare = 0;
		int noOfPersons = bus.getNoOfPersons();
		int rates= bus.getRates();
		 String busType = bus.getBusType();
	     LocalDate date = bus.getDate();
	     
	     totalFare= book.booking(noOfPersons, rates); 
	     
		return totalFare;	
	}

	
	
}