package baseball;

public class CheckBall {

	public int checkStrike(int comChar, int userChar, int i) {
		if (comChar == userChar) {
			return 1;
		}
		return 0;
	}
	
	public int countStrike(String computer, String user) {
		int count = 0;
		
		for (int i=0; i<3; i++) {
			count += checkStrike(computer.charAt(i), user.charAt(i), i);
		}
		return count;
	}


}
