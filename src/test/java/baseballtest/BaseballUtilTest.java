package baseballtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.BaseballUtils;

import static org.assertj.core.api.Assertions.*;

public class BaseballUtilTest {
	
	BaseballUtils baseballUtils;
	
	@BeforeEach
	public void setUp() {
		baseballUtils = new BaseballUtils();
	}

	@Test
	@DisplayName("int형 String 변환 테스트")
	public void parseIntToString() {
		String test1 = "123";
		assertThat(test1).isEqualTo(baseballUtils.intToString(123));
		
		boolean test2 = baseballUtils.isStringCanBeInt("test");
		assertThat(test2).isFalse();
		
		boolean test3 = baseballUtils.isStringCanBeInt("123");
		assertThat(test3).isTrue();
	}
	
	@Test
	@DisplayName("입력된 숫자 범위 유효성 체크")
	public void numbersRangeValidation() {
		boolean test1 = baseballUtils.isSuitedNumbersRange(111);
		boolean test2 = baseballUtils.isSuitedNumbersRange(110);
		boolean test3 = baseballUtils.isSuitedNumbersRange(999);
		boolean test4 = baseballUtils.isSuitedNumbersRange(1000);
		
		assertThat(test1).isTrue();
		assertThat(test2).isFalse();
		assertThat(test3).isTrue();
		assertThat(test4).isFalse();
	}
	
}
