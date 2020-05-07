package services;

/*
 Progression - 5
Create a class called as Booking inside the service package.
Create a method public double booking(int noOfPersons,int rates).
The booking method should return the total rate.
 */
public class Booking{
	int total_rate = 0;
	public double booking(int noOfPersons,int rates) {
		//...logic.........
		total_rate = noOfPersons * rates;
		return total_rate;
	}
	
}
