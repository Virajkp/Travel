package application;

public class MyTravel {

	Travel myTravel[];

	void init(String input) {
		String line;
		int index = 0;
		int numberTravel = 0;

		ReadTextFile f = new ReadTextFile(input);

		f.open();

		if ((line = f.readline()) != null) { // total entries
			numberTravel = Integer.parseInt(line);
		}

		myTravel = new Travel[numberTravel];

		while ((line = f.readline()) != null) {
			String[] info = line.split(",");
			if (info[0].equals("Air") == true)
				myTravel[index++] = new AirTravel(info[1], info[2], info[3], info[4], info[5], info[6], info[7],
						info[8], info[9], info[10]);
			else
				myTravel[index++] = new LandTravel(info[1], info[2], info[3], info[4], info[5], info[6], info[7],
						info[8], info[9]);
		}
	}

	String print() {
		int totalDays = 0;
		double totalCost = 0;
		int totalLand = 0;
		int totalAir = 0;
		String total = "Travel Details\n";
		total=total+"\n";
		for (int i = 0; i < myTravel.length; i++) {
			total = total + myTravel[i].print();
			if (myTravel[i].gettravelType().equals("Air") == true) {
				totalAir += myTravel[i].gettravelMileage();
			} else {
				totalLand += myTravel[i].gettravelMileage();
			}
			totalCost += myTravel[i].getcost();
			totalDays += myTravel[i].getdays();
		}
		
		total = total + "Total Days: " + totalDays+"\n";
		total = total + "Total Cost: $" + totalCost+"\n";
		total = total + "Total Travel Air Mileage: " + totalAir+"\n";
		total = total + "Total Travel Land Mileage: " + totalLand+"\n";
		return total;
	}

	String PrintAD() {
		String total = "";
		for (int i = 0; i < myTravel.length; i++) {
			if (myTravel[i].gettravelType().equals("Air") == true) {
				total = total + myTravel[i].print();
			}
		}
		return total;
	}

	String PrintLD() {
		String total = "";
		for (int i = 0; i < myTravel.length; i++) {
			if (myTravel[i].gettravelType().equals("Land") == true) {
				total = total + myTravel[i].print();
			}
		}
		return total;
	}

	String PrintTD() {
		String total = "";
		int totalDays = 0;
		for (int i = 0; i < myTravel.length; i++) {
			totalDays += myTravel[i].getdays();
		}
		total = total + "Total Days: " + totalDays+"\n";
		return total;
	}

	String PrintTC() {
		String total = "";
		double totalCost = 0;
		for (int i = 0; i < myTravel.length; i++) {
			totalCost += myTravel[i].getcost();
		}
		total = total + "Total Cost: $" + totalCost+"\n";
		return total;
	}

	String PrintAM() {
		int totalAir = 0;
		String total = "";
		for (int i = 0; i < myTravel.length; i++) {
			if (myTravel[i].gettravelType().equals("Air") == true) {
				totalAir += myTravel[i].gettravelMileage();
			}
		}
		total = total + "Total Travel Air Mileage: " + totalAir+"\n";
		return total;
	}

	String PrintLM() {
		int totalLand = 0;
		String total = "";
		for (int i = 0; i < myTravel.length; i++) {
			if (myTravel[i].gettravelType().equals("Land") == true) {
				totalLand += myTravel[i].gettravelMileage();
			}
		}
		total = total + "Total Travel Land Mileage: " + totalLand+"\n";
		return total;
	}

}