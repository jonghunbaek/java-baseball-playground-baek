package racingcar;

import java.util.Objects;

public class Car {

	public Name name;
	public Position position;
	
	public Car(String name, int position) {
		this.name = new Name(name);
		this.position = new Position(position);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name) && Objects.equals(position, other.position);
	}
	
	
}
