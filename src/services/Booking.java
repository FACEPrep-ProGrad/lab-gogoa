package services;

// Progression -5

public class Booking{
	double totalFare;
	
	public double booking(int noOfPersons,int rates)
	{
		totalFare= noOfPersons*rates;
		return totalFare;
	}
}

