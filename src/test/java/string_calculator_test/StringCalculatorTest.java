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
		assertThat(result).isEqualTo(stringCalculator.textSplitBySeparator(test1));
		assertThat(result).isEqualTo(stringCalculator.textSplitBySeparator(test2));
	}
	
	@Test
	@DisplayName("입력 문자 구분자로 나눈 후 덧셈")
	public void textSplitBySeparator() {
		int result1 = 6;
		int result2 = 2;
		String test1 = "1,2:3";
		String test2 = "2";
		
		assertThat(result1).isEqualTo(stringCalculator.textSplitBySeparator(test1));
		assertThat(result2).isEqualTo(stringCalculator.textSplitBySeparator(test2));
	}
}
