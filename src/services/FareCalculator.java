package services;

// Progression -6
import java.time.LocalDate;
import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	
	
	public double book(Hotel hotel)
	{
		LocalDate checkInDate = hotel.getFromdate();
		LocalDate checkOutDate = hotel.getTodate();
		Double total = 0d;
		
		//Progression -7
		
		if(hotel.getRates()==0||hotel.getNoOfPersons()==0 || checkInDate==null || checkOutDate==null)
			return total;
		else
		{
			int noOfPersons=hotel.getNoOfPersons();
			if(noOfPersons==1)
			{			
				hotel.setOccupancy("single");	
			}
			else if(noOfPersons==2)
			{			
				hotel.setOccupancy("double");	
			}
			else if(noOfPersons>2)
			{
				hotel.setOccupancy(String.format("%d Double Occupancy room and %d Single Occupancy",Math.round(noOfPersons/2),noOfPersons%2));
			}
			
			if(checkInDate.isBefore(checkOutDate)) 
			{
				total=super.booking(hotel.getNoOfPersons(), hotel.getRates());
				return total;
			}
			else
			{
				return total;
			}
		}
	}
	
	public double book(Flight flight) {
		
		double total=0d;
		String type=flight.getTriptype();
				
		if(flight.getRates()==0 || flight.getNoOfPersons()==0 || flight.getFrom()==null || flight.getTo()==null ) 
		{
			return 0d;
		}
		
		if(type.equals("one-way")==true) 
		{
			total = flight.getRates()*flight.getNoOfPersons();
		}
		else if(type.equals("round-trip")==true)
		{
			LocalDate startDate=flight.getFrom();
			LocalDate returnDate=flight.getTo();
			if(startDate.isBefore(returnDate)) {
				return total = 2*flight.getRates()*flight.getNoOfPersons();
			}
		}
		return total;
		
	}
	
	public double book(Train train) {
		if(train.getRates()==0 || train.getNoOfPersons()==0) 
		{
			return 0d;
		}
		return super.booking(train.getNoOfPersons(),train.getRates());
	}
	
	public double book(Bus bus) {
		if(bus.getRates()==0 || bus.getNoOfPersons()==0) 
		{
			return 0d;
		}
		return super.booking(bus.getNoOfPersons(),bus.getRates());
	}
	

}