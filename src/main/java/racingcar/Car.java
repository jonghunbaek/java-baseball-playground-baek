package racingcar;

public class Car {

	public String name;
	public int position;
	
	public Car(String name, int position) {
		if (name.length() > 5) {
			throw new RuntimeException("이름은 5글자 이하로 입력하세요.");
		}
		this.name = name;
		this.position = position;
	}
}
