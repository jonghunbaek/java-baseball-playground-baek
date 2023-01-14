package baseball;

public class CheckBall {

	public int checkStrike(char comChar, char userChar, int idx) {
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

	public int checkBall(char c, String computer, int idx) {
		int temp = computer.indexOf(c);
		
		if (temp == idx || temp == -1) {
			return 0;
		}	
		return 1;
	}

	public int countBall(String com, String user) {
		int count = 0;
		
		for (int i=0; i<3; i++) {
			count += checkBall(user.charAt(i), com, i);
		}
		return count;
	}


}
