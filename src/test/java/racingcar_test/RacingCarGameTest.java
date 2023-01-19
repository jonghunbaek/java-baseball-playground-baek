package racingcar_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.Car;
import racingcar.RacingCarGame;

public class RacingCarGameTest {
	
	RacingCarGame racingCarGame;
	Car testCar;
	
	@BeforeEach
	public void setUp() {
		racingCarGame = new RacingCarGame();
		testCar = new Car("test", 0);
	}

	@Test
	@DisplayName("랜덤값 4이상일 경우 자동차 전진 테스트")
	public void moveForwardCar() {
		int test = 5;
		int result = 1;
		assertThat(result).isEqualTo(racingCarGame.moveForwardCar(testCar, test).getPosition());
	}
	
}
