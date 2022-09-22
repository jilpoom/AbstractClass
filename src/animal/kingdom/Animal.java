package animal.kingdom;

public abstract class Animal {
	// 추상 클래스 : 미완성의 설계도. -> 추상 메서드는 구현부가 없고, 선언부만 있다.
	// 일반 클래스 : 완성된 설계도. -> 객체 생성이 가능한 설계도.
	
	
	//non-abstract 메소드 : 강제성이 없다. 하지만 Overriding이 가능하다.
	public void breathe() {
		System.out.println("숨 쉰다.");
	}
	
	
	// 네 발로 걷는 동물, 두 발로 걷는 동물... 객체마다 서로 다르게 구현해야한다. -> 강제성
	// class 내부에 하나라도 abstract method가 있다면, 그 클래스는 abstract 클래스로 선언해야한다.
	public abstract void walk(); 
	
}
