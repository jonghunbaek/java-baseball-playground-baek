package racingcar;

public class RacingCarGame {
	
	RacingCarUtil util = new RacingCarUtil();
	
	public void racingStart(String carsBefore, int times) {
		String[] carsAfter = util.carTextSplit(carsBefore);
		Car[] cars = new Car[carsAfter.length];
		int[] ranNos = new int[carsAfter.length];
		
		for (int i=0; i<cars.length; i++) {
			cars[i] = new Car(carsAfter[i], 0);
		}

		for (int i=0; i<times; i++) {
			Car[] temp = checkMovingCar(cars, ranNos);
			for (int j=0; j<temp.length; j++) {
				System.out.println(temp[j].getCarName() + " : " + util.positionToString(temp[j].getPosition()));
			}
			System.out.println();
		}
	}

	private Car[] checkMovingCar(Car[] cars, int[] ranNos) {
		for (int i=0; i<ranNos.length; i++) {
			ranNos[i] = createRandomNumber();
			cars[i] = moveForwardCar(cars[i], ranNos[i]);
		}
		return cars;
	}

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
