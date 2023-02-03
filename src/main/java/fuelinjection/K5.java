package fuelinjection;

public class K5 extends Car {

	private static final Name NAME = new Name("K5");
	private Distance distance;
	
	public K5 (int distance) {
		this.distance = new Distance(distance);
	}

	@Override
	double getDistancePerLiter() {
		return 13;
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
