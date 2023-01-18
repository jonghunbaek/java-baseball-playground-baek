package racingcar;

public class Car {

	private String carName;
	private int position;
	
	public Car (String carName) {
		if (carName.length() > 5) {
			throw new RuntimeException("자동차의 이름은 5글자 이하여야 합니다.");
		}
		this.carName = carName;
	}

}
