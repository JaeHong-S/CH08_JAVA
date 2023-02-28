package ch08;

public class Over1 { // final을 class앞에 붙이면 상속 불가능
	void m1() { // final을 메소드 앞에 붙이면 overriding 불가능
		System.out.println("난 부모 메서드");
	}

}

class Over2 extends Over1{ //여기선 final 가능
	@Override // 어노테이션 : 설명도 해주고 잘못 여부 체크
	void m1() {
		System.out.println("난 자식 메서드");
	}
}
