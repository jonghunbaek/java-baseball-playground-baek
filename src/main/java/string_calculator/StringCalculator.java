package string_calculator;

public class StringCalculator {

	public Object textValidationCheck(String text) {
		if (text == null || text == " " || text.isEmpty()) {
			return 0;
		}
		return text;
	}

}
