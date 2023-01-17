package string_calculator;

public class StringCalculator {

	public int textSplitBySeparator(String text) {
		if (text == null || text == " " || text.isEmpty()) {
			return 0;
		}
		if (text.length() == 1) {
			return Integer.parseInt(text);
		}
		String[] temp = text.split(",|:");
		int sum = 0;
		for (int i=0; i<temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}

}
