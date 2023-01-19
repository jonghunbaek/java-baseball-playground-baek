package racingcar;

public class RacingCarGame {

	public Car moveForwardCar(Car car, int randomNo) {
		if (randomNo > 3) {
			car = new Car(car.getCarName(), car.getPosition() + 1);
		}
		return car;
	}
	
	public int createRandomNumber() {
		return (int) (Math.random()*10);
	}

}
