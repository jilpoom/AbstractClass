package animal.kingdom;

import flyinganimal.function.Flyable;

// Eagle은 걷기만 하나요..? 날기도 합니다.
// 날기라는 기능을 탑재할 필요가 생겼다.
public class Eagle extends Animal implements Flyable{

	@Override
	public void walk() {
		System.out.println("두 발로 걷는다.");
	}

	@Override
	public void fly() {
		System.out.println("훨훨 날아다닌다.");
	}

}
