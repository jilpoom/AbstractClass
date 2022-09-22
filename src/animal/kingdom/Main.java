package animal.kingdom;

import java.io.Serializable;

import flyinganimal.function.Fall;
import flyinganimal.function.Flyable;

public class Main {

	public static void main(String[] args) {

		Lion lion = new Lion();
		lion.breathe(); // Animal에서 상속받은 메소드
		lion.walk(); // 오버라이딩. (추상 클래스를 통한 강제적 오버라이딩)
		
		Eagle eagle = new Eagle();
		eagle.breathe();
		eagle.walk();
		eagle.fly(); // interface를 통한 강제적 오버라이딩
		
		// 중요한 점.
		// Interface를 통한 Upcasting이 가능하다.
		// 하나의 계층 구조에서 해당 interface를 구현한 클래스 끼리 묶을 수 있다.
		Flyable flyingAnimal = new Eagle();
		
		Fall fall = new Fall();
		
		fall.rapidFall(flyingAnimal);
		// Serializable
		
	}

	
	
}
