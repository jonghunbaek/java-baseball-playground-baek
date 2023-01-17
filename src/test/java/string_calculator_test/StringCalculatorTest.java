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
		assertThat(result).isEqualTo(stringCalculator.stringAddCalculator(test1));
		assertThat(result).isEqualTo(stringCalculator.stringAddCalculator(test2));
	}
	
	@Test
	@DisplayName("입력 문자 구분자로 나눈 후 덧셈")
	public void stringAddCalculator() {
		int result1 = 6;
		int result2 = 2;
		int result3 = 3;
		String test1 = "1,2:3";
		String test2 = "2";
		String test3 = "1,2";
		
		assertThat(result1).isEqualTo(stringCalculator.stringAddCalculator(test1));
		assertThat(result2).isEqualTo(stringCalculator.stringAddCalculator(test2));
		assertThat(result3).isEqualTo(stringCalculator.stringAddCalculator(test3));
	}
	
	@Test
	@DisplayName("커스텀 구분자 지정 후 덧셈")
	public void textSplitBySeparator() {
		String[] result = {"1", "2", "3"};
		String test = "//;\n1;2;3";
		
		assertThat(result).isEqualTo(stringCalculator.textSplitBySeparator(test));
	}
	
	@Test
	@DisplayName("음수, 숫자가 아닌 값 입력시 예외 발생")
	public void checkThrowException() {
		assertThatThrownBy(() -> stringCalculator.stringAddCalculator("-1,2,3"))
								.isInstanceOf(RuntimeException.class);
	}
}
