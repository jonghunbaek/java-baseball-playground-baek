package baseball;

public class BaseballUtils {

	public String intToString(int numbers) {
		return String.valueOf(numbers);
	}
	
	public boolean isStringCanBeInt(String numbers) {
		
		try {
			int temp = Integer.parseInt(numbers);
		} catch(NumberFormatException e1) {
			return false;
		}
		
		return true;
	}

	public boolean isSuitedNumbersRange(int numbers) {
		if (110 < numbers && numbers < 1000) {
			return true;
		}	
		return false;
	}

}
