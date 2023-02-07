package coordinate_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coordinate.CoordinateUtil;

public class CoordinateTest {
	CoordinateUtil coordinateUtil;
	
	@BeforeEach
	public void setUp() {
		coordinateUtil = new CoordinateUtil();
	}

	@Test
	@DisplayName("좌표값 추출 테스트")
	public void extractCoordinateVal() {
		String test = "(10,10)";
		int[] result = {10, 10};
		assertThat(result).isEqualTo(coordinateUtil.extractCoordinateVal(test));
	}
}
