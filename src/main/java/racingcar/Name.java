package racingcar;

import java.util.Objects;

public class Name {
	
	private String name;

	public Name(String name) {
		if (name.length() > 5) {
			throw new RuntimeException("이름은 5글자 이하로 입력하세요.");
		}
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

}
