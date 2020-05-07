package services;

import java.time.LocalDate;
import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

/*
Progression - 6
Create a class called as FareCalculator.
FareCalculator should extend the Booking Class and should use the booking method defined in Booking Class.
FareCalculator has 4 methods as mentioned below.
public double book(Hotel hotel)
public double book(Flight flight)
public double book(Train train)
public double book(Bus bus)
Each method should return the total fare

---------------------------------------------------------------------------------------------------------------
Progression - 7
In the public double book(Hotel hotel)method inside the FareCalculator.
Check-In date should be less than Check-Out date.
Single occupancy can be given only for 1 guest.
If there are 3 guests then the rooms alloted should be 1 Double Occupancy room and 1 Single Occupancy.
Calculate the total fare after these conditions are met.
In public double book(Flight flight) method inside the FareCalculator.
If one way trip is selected then departure date is not considered for fare calculation.
For round trips Start date should be less than return date.
----------------------------------------------------------------------------------------------------------------
*/
public class FareCalculator extends Booking{
	double total_fare;
	Booking booking = new Booking();
	
/*	public FareCalculator(double total_fare) {
		super();
		this.total_fare = total_fare;
	}*/
	public FareCalculator() {
		// TODO Auto-generated constructor stub
	}
	public double book(Hotel hotel) {
		
		int noOfPersons = hotel.getNoOfPersons();
		String roomType = hotel.getRoomType();
		int rates = hotel.getRates();
		String occupancy = hotel.getOccupancy();
		LocalDate fromdate = hotel.getFromdate();
		LocalDate todate = hotel.getTodate(); 
		
		if( fromdate.isAfter(todate)) {
			total_fare = booking.booking(noOfPersons, rates);W
			/*if((occupancy % 2) == 1) {
				
			}*/
			return total_fare;
		}
		else {
			return total_fare;
		}
	}
	public double book(Flight flight) {
		return total_fare;
	}
	public double book(Train train) {
		return total_fare;
	}
	public double book(Bus bus) {
		
		return total_fare;
	}
	
}