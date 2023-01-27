package racingcar;

import java.util.function.IntPredicate;

public class RacingCarGame {

	public String[] splitCarNames(String test) {
		return test.split(",");
	}

	public boolean isSameCarName(Car test1, Car test2) {
		if (test1.name.equals(test2.name)) {
			return false;
		}
		return true;
	}

}
