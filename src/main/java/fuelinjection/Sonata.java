package fuelinjection;

public class Sonata extends Car {

	private static final Name NAME = new Name("Sonata");
	private Distance distance;
	
	public Sonata(int distance) {
		this.distance = new Distance(distance);
	}

	@Override
	double getDistancePerLiter() {
		return 10;
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
