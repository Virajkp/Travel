package application;

public class LandTravel extends Travel {
	String carType;

	public LandTravel(String country, String city, String travelDate, String returnDate, String days, String hotel,
			String cost, String travelMileage, String carType) {
		super("Land", country, city, travelDate, returnDate, days, hotel, cost, travelMileage);
		this.carType = carType;
	}

	public void setcarType(String carType) {
		this.carType = carType;
	}

	public String getcarType() {
		return carType;
	}

	public String print() {
		String total = super.print();
		total = total + "CarType: " + carType+"\n";
		total = total + "\n";
		return total;
	}
}
