package racingcar_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.RacingCarGame;

public class RacingCarGameTest {
	
	RacingCarGame racingCarGame;
	
	@BeforeEach
	public void setUp() {
		racingCarGame = new RacingCarGame();
	}

	@Test
	@DisplayName("입력받은 자동차이름 쉼표로 구분 테스트")
	public void carTextSplit() {
		String[] result = {"aa", "bb", "cc"};
		String test = "aa,bb,cc";
		assertThat(result).isEqualTo(racingCarGame.carTextSplit(test));
	}
}
