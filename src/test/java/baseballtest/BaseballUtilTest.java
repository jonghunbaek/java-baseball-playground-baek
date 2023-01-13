package baseballtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
		String test = "123";
		assertThat(test).isEqualTo(baseballUtils.intToString(123));
	}
}
