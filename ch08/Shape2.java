package ch08;
//메서드 중에 하나라도 추상메서드가 있으면 추상클래스
public abstract class Shape2 { 
//	매서드앞에 abstract 붙이면 추상메서드
	void disp() {
		System.out.println("대박사건");
	}
	abstract void drive(); //선언부는 있지만 구현부가 없다. abstract 클래스 상속 받아서 자식 클래스에서 구현

}
class Rectangle2 extends Shape2{

	@Override
	void drive() {
		System.out.println("사각형을 그린다.");
		
	}
	
}

class Circle2 extends Shape2{

	@Override
	void drive() {
		System.out.println("원형을 그린다.");
		
	}
	
}

class Triagngle2 extends Shape2{

	@Override
	void drive() {
		System.out.println("삼각형을 그린다.");
		
	}
	
}
