package string_calculator_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import string_calculator.StringCalculator;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
	StringCalculator stringCalculator;

	@BeforeEach
	public void setUp() {
		stringCalculator = new StringCalculator();
	}
	
	@Test
	@DisplayName("입력 문자 유효성 체크")
	public void textValidationCheck() {
		int result = 0;
		String test1 = null;
		String test2 = " ";
		assertThat(result).isEqualTo(stringCalculator.textValidationCheck(test1));
		assertThat(result).isEqualTo(stringCalculator.textValidationCheck(test2));
	}
	
}
