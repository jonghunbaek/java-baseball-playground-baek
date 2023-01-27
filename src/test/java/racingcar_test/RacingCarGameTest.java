package racingcar_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.Car;
import racingcar.RacingCarGame;

public class RacingCarGameTest {
	
	RacingCarGame racingCarGame;
	
	@BeforeEach
	public void setUp() {
		racingCarGame = new RacingCarGame();
	}

	@Test
	@DisplayName("입력된 자동차 이름 쉼표로 분리 테스트")
	public void splitCarNames() {
		String test = "car1,car2,car3";
		String[] result = {"car1","car2","car3"};
		assertThat(result).isEqualTo(racingCarGame.splitCarNames(test));
	}
	
	@Test
	@DisplayName("입력된 자동차 이름 동일여부 테스트")
	public void isSameCarName() {
		Car test1 = new Car("car1", 0);
		Car test2 = new Car("car1", 0);
		assertThat(racingCarGame.isSameCarName(test1, test2)).isFalse();
	}
}
