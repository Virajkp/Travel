package application;
/*This file is specifcally for Air travel. It uses the Travel.java file as a base 
and add the extra methods that are specific to the air type of travel.*/
public class AirTravel extends Travel {

	private String airline;
	private String travelRefNumber;

	public AirTravel(String country, String city, String travelDate, String returnDate, String days, String airline,
			String hotel, String travelRefNumber, String cost, String travelMileage) {
		super("Air", country, city, travelDate, returnDate, days, hotel, cost, travelMileage);
		this.airline = airline;
		this.travelRefNumber = travelRefNumber;
	}

	public void setairline(String airline) {
		this.airline = airline;
	}

	public void settravelRefNumber(String travelRefNumber) {
		this.travelRefNumber = travelRefNumber;
	}

	public String getairline() {
		return airline;
	}

	public String gettravelRefNumber() {
		return travelRefNumber;
	}

	public String print() {
		String total = super.print();
		total = total + "Airline: " + airline+"\n";
		total = total + "TravelRefNumber: " + travelRefNumber+"\n";
		total = total + "\n";
		return total;
	}
}
