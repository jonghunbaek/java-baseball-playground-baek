package racingcar;

import java.util.Scanner;

public class RacingCar {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RacingCarGame rcg = new RacingCarGame();
		
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String car = sc.next();
		
		System.out.println("시도할 횟수는 몇회인가요?");
		int n = sc.nextInt();
		
		System.out.println(rcg.checkWinners(rcg.racingStart(car, n)) + "가 최종 우승했습니다.");
		
	}
}
