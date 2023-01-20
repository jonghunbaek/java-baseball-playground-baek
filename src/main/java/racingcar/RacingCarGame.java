package racingcar;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

	public String checkWinners(Car[] cars) {
		Map<Integer, Integer> ranking = new HashMap<Integer, Integer>();
		for (int i=0; i<cars.length; i++) {
			ranking.put(i, cars[i].getPosition());
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(ranking.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(cars[entryList.get(0).getKey()].getCarName());
		
		for (int i=1; i<entryList.size(); i++) {
			if (entryList.get(0).getValue() == entryList.get(i).getValue()) {
				sb.append(", " + cars[entryList.get(i).getKey()].getCarName());
			}
		}
		
		return sb.toString();
	}

}
