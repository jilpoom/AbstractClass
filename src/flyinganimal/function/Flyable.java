package flyinganimal.function;

public interface Flyable {
	// interface의 핵심 개념 : 모든 메소드가 추상 메소드로 선언된다.
	// 사실 default method, 상수 등 다른 것도 선언할 수 있지만, 가장 중요한 것은 모든 것이 추상 메소드.
	
	// interface의 모든 필드 및 메서드는 public 하다.
	// -> 모든 메서드가 추상적이기 때문에, 반드시 interface를 구현한 클래스에서 구현해야한다는 규칙이 있다. (절대적)
	// interface와 연결되는 기능(모듈)은 숨기고, 연결할 수 있는 부분만 열어둔다. -> interface의 역할
	// private 선언 이유(캡슐화 -> 정보 은닉) 
	// interface의 목적은 기능을 탑재할 때, 중간 매개체(연결)의 역할 (private할 필요가 없다.)
	
	
	
//	public abstract void fly();
	
	void fly(); // abstract void가 생략된 형태.
	
	
	
	
}
