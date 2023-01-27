package racingcar;

import java.util.Objects;

public class Position {
	
	private int position;

	public Position(int position) {
		if (position != 0) {
			this.position = position;
		}
		this.position = 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return position == other.position;
	}

}
