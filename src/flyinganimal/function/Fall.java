package flyinganimal.function;

import animal.kingdom.Eagle;

public class Fall {

	// 이제 Fall이라는 기능을 쓰기 위해서는 반드시 Flyable 인터페이스를 구현할 것을 강제했다.
	// 즉, Flyable을 구현한 객체를 활용할 수 있다.
	
	
	public void fall(Flyable flyingAnimal) {
		flyingAnimal.fly();
		
		System.out.println("낙하합니다.");
	}

	
	// 추가 기능 넣기 : 유지 보수가 수월해진다. -> 모든 Flyable을 구현한 클래스가 사용 가능하다.
	public void rapidFall(Flyable flyingAnimal) {
		flyingAnimal.fly();
		
		if(flyingAnimal instanceof Eagle) {
			System.out.println("고속 낙하.");
		} 
	}
	

	
	
}
