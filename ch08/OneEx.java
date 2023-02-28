package ch08;

import Pac.One;

public class OneEx extends One{ //OneEx 패키지에는 One이라는 class가 없으므로, One class의 패키지를 임포트 해줌
	public static void main(String[] args) {
		OneEx oe = new OneEx();
		System.out.println(oe.getOne());
		System.out.println(oe.one); //상속인 경우에는 protected도 사용가능
		
	}

}
