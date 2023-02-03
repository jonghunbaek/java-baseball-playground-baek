package fuelinjection;

public class Avante extends Car {

	private static final Name NAME = new Name("Avante");
	private Distance distance;
	
	public Avante(int distance) {
		this.distance = new Distance(distance);
	}
	@Override
	double getDistancePerLiter() {
		return 15;
	}
	@Override
	double getTripDistance() {
		return distance.getDistance();
	}
	@Override
	String getName() {
		return NAME.getName();
	}
}
