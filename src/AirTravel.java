package application;

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
