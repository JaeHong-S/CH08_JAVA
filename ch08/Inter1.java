package ch08;
interface A1 { // 객체를 생성할 수 없음
	int K = 7; // = (public static final) int k = 7;
	void m1(); // = (public abstract) void m1();
	void m2();
}
class A2 implements A1 { //인터페이스를 사용하기 위해서는 implements 구현한 클래스로 사용

	@Override
	public void m1() {
		System.out.println("m1 메소드");
	}

	@Override
	public void m2() {
		System.out.println("m2 메소드");
	}
	
}
public class Inter1 {
	public static void main(String[] args) {
		A1 a1 = new A2(); 
		A1 a2 = new A2();
		a1.m1();
		a1.m2();
		a2.m1();
		a2.m2();
//		a1.K = 88; final이므로 수정 불가 
		System.out.println("k = " + A1.K);
		System.out.println("k = " + a1.K);
	}
}
