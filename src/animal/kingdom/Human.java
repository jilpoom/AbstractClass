package animal.kingdom;

public class Human extends Animal {

	
	// 추상 메소드는 자식 클래스가 반드시 구현해야한다. -> 
	@Override
	public void walk() {
		System.out.println("두 발로 걷는다.");
	}
	
	
	
}
