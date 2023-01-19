package racingcar;

public class Car {

	private String carName;
	private int position;
	
	public Car (String carName, int position) {
		if (carName.length() > 5) {
			throw new RuntimeException("자동차의 이름은 5글자 이하여야 합니다.");
		}
		this.carName = carName;
		this.position = position;
	}

	public String getCarName() {
		return carName;
	}

	public int getPosition() {
		return position;
	}
}
