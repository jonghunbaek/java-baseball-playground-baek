package string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public int stringAddCalculator(String text) {
		if (text == null || text == " " || text.isEmpty()) {
			return 0;
		}
		if (text.length() == 1) {
			return Integer.parseInt(text);
		}
		
		String[] temp = textSplitBySeparator(text);
		
		for (int i=0; i<temp.length; i++) {
			checkMinus(temp[i]);
		}
		
		int sum = 0;
		for (int i=0; i<temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}

	private void checkMinus(String temp) {
		if (Integer.parseInt(temp) < 0) {
			checkThrowException();
		}
	}

	public String[] textSplitBySeparator(String text) {
		Matcher mc = Pattern.compile("//(.)\n(.*)").matcher(text);
		String[] temp;
		
		if (mc.find()) {
			String customDelimeter = mc.group(1);
			temp = mc.group(2).split(customDelimeter);
			return temp;
		}
		
		return text.split(",|:");
	}

	public void checkThrowException() {
		throw new RuntimeException("숫자는 양의 정수만 가능합니다.");
	}

}
