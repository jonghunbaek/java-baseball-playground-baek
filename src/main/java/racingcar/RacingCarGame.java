package racingcar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RacingCarGame {
	
	RacingCarUtil util = new RacingCarUtil();
	
	public Car[] racingStart(String carsBefore, int times) {
		String[] carsAfter = util.carTextSplit(carsBefore);
		Car[] cars = new Car[carsAfter.length];
		int[] ranNos = new int[carsAfter.length];
		
		for (int i=0; i<cars.length; i++) {
			cars[i] = new Car(carsAfter[i], 0);
		}

		
		for (int i=0; i<times; i++) {
			cars = checkMovingCar(cars, ranNos);
			for (int j=0; j<cars.length; j++) {
				System.out.println(cars[j].getCarName() + " : " + util.positionToString(cars[j].getPosition()));
			}
			System.out.println();
		}
		
		return cars;
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

	public String checkWinners(Car[] test) {
		Map<Integer, Integer> ranking = new HashMap<Integer, Integer>();
		for (int i=0; i<test.length; i++) {
			ranking.put(i, test[i].getPosition());
		}
		
		
		return null;
	}

}
