package racingcar;

public class RacingCarUtil {

	public String[] carTextSplit(String carText) {
		return carText.split(",");
	}

	public String positionToString(int position) {
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=position; i++) {
			sb.append("-");
		}
		return sb.toString();
	}

}
