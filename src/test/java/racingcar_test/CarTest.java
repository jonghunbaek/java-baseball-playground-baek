package racingcar_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.Car;

public class CarTest {

	@Test
	@DisplayName("Car객체 생성시 이름 유효성 체크")
	public void nameValidate() {
		String test1 = "123456";
		String test2 = "abcdef";
		assertThatThrownBy(() -> new Car(test1, 0)).isInstanceOf(RuntimeException.class);
	}
	
}
