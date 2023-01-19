package racingcar_test;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	@DisplayName("경주 우승자 확인 테스트") 
	public void checkWinners() {
		Car[] test = {new Car("car1", 2)
					 ,new Car("car2", 3)
					 ,new Car("car3", 4)
					 ,new Car("car4", 4)};
		
		String result = "car3, car4";
		assertThat(result).isEqualTo(racingCarGame.checkWinners(test));
	}
	
}
