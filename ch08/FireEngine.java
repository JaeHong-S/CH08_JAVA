package ch08;

public class FireEngine extends Car{

	@Override
	void drive() {
		System.out.println("물을 싣고 달린다.");
	}
	void fire() {
		System.out.println("불을 끈다.");
	}

}
