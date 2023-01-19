package racingcar_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.Car;
import racingcar.RacingCarUtil;

public class RacingCarUtilTest {
	
	RacingCarUtil racingCarGame;
	
	@BeforeEach
	public void setUp() {
		racingCarGame = new RacingCarUtil();
	}

	@Test
	@DisplayName("입력받은 자동차이름 쉼표로 구분 테스트")
	public void carTextSplit() {
		String[] result = {"aa", "bb", "cc"};
		String test = "aa,bb,cc";
		assertThat(result).isEqualTo(racingCarGame.carTextSplit(test));
	}
	
	@Test
	@DisplayName("자동차 이름 5글자 이하 여부 확인 테스트")
	public void carNameLengthValidation () {
		assertThatThrownBy(() -> new Car("abcdef", 0)).isInstanceOf(RuntimeException.class);
	}
}
