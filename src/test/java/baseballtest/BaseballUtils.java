package baseballtest;

public class BaseballUtils {

	public Object intToString(int numbers) {
		return String.valueOf(numbers);
	}

	public boolean isSuitedNumbersRange(int numbers) {
		if (110 < numbers && numbers < 1000) {
			return true;
		}	
		return false;
	}

}
