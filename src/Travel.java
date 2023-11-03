package application;
/*This file is the getter and setter methods for all of the buttons
Where the information is similar between the air and land type of travel.*/
public abstract class Travel {

	protected String country;
	protected String city;
	protected String travelDate;
	protected String returnDate;
	protected int days;
	protected String hotel;
	protected double cost;
	protected String travelType;
	private int travelMileage;
	//This method sets all of the data that is given by the txt file.
	public Travel(String travelType, String country, String city, String travelDate, String returnDate, String days,
			String hotel, String cost, String travelMileage) {
		this.country = country;
		this.city = city;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.days = Integer.parseInt(days);
		this.hotel = hotel;
		this.travelType = travelType;
		this.cost = Double.parseDouble(cost);
		this.travelMileage = Integer.parseInt(travelMileage);
	}

	public void setcountry(String country) {
		this.country = country;
	}

	public void settravelMileage(String travelMileage) {
		this.travelMileage = Integer.parseInt(travelMileage);
	}

	public void settravelType(String travelType) {
		this.travelType = travelType;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public void settravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public void setreturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public void setdays(String days) {
		this.days = Integer.parseInt(days);
	}

	public void sethotel(String hotel) {
		this.hotel = hotel;
	}

	public void setcost(String cost) {
		this.cost = Double.parseDouble(cost);
	}

	public String getcountry() {
		return country;
	}

	public String getcity() {
		return city;
	}

	public String gettravelDate() {
		return travelDate;
	}

	public String gettravelType() {
		return travelType;
	}

	public String getreturnDate() {
		return returnDate;
	}

	public int gettravelMileage() {
		return travelMileage;
	}

	public int getdays() {
		return days;
	}

	public String gethotel() {
		return hotel;
	}

	public double getcost() {
		return cost;
	}
	//This method prints out all of the data given when the button for it is pressed.
	public String print() {
		String total;
		total = "TravelType: " + travelType+"\n";
		total = total + "Country: " + country+"\n";
		total = total + "City: " + city+"\n";
		total = total + "TravelDate: " + travelDate+"\n";
		total = total + "ReturnDate: " + returnDate+"\n";
		total = total + "Days: " + days+"\n";
		total = total + "Hotel: " + hotel+"\n";
		total = total + "Cost: " + cost+"\n";
		total = total + "TravelMileage: " + travelMileage+"\n";
		return total;
	}

}
