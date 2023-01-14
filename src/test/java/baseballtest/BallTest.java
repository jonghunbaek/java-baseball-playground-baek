package baseballtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.CheckBall;

import static org.assertj.core.api.Assertions.*;

public class BallTest {
	
	CheckBall checkBall;
	
	@BeforeEach
	public void setUp() {
		checkBall = new CheckBall();
	}
	
	@Test
	@DisplayName("스트라이크 체크")
	public void checkStrike() {
		int test = 1;
		char comChar = 1;
		char userChar = 1;
		assertThat(test).isEqualTo(checkBall.checkStrike(comChar, userChar, 0));
	}
	
	@Test
	@DisplayName("총 스트라이크 개수 체크")
	public void countStrike() {
		int test = 2;
		String com = "123";
		String user = "124";
		assertThat(test).isEqualTo(checkBall.countStrike(com, user));
	}
	
	@Test
	@DisplayName("볼 체크")
	public void checkBall() {
		int test = 1;
		char userChar = '1';
		String computer = "213";
		
		assertThat(test).isEqualTo(checkBall.checkBall(userChar, computer, 0));
	}
	
	@Test
	@DisplayName("총 볼개수 체크")
	public void countBall() {
		int test = 2;
		String com = "123";
		String user = "214";
		
		assertThat(test).isEqualTo(checkBall.countBall(com, user));
	}
}
