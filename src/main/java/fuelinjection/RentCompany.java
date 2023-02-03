package fuelinjection;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
	
	private List<Car> cars = new ArrayList<Car>();
	private static final String NEWLINE = System.getProperty("line.separator");

	public static RentCompany create() {
		RentCompany rentCompany = new RentCompany();
		return rentCompany;
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public String generateReport() {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<cars.size(); i++) {
			sb.append(cars.get(i).getName() + " : " + (int)(cars.get(i).getChargeQuantity()) + "리터" + NEWLINE);
		}
		return sb.toString();
	}

}
