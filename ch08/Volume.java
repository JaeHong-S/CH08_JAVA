package ch08;

public interface Volume { // 하나의 인터터페이스를 활용하여 다형성 구현
	void volumeUp();
	void volumDown();
}

class Radio implements Volume{

	@Override
	public void volumeUp() {// 인터페이스 메소드 앞에는 public이 생략되어 있으므로, public 으로 구현
		System.out.println("라디오 볼륨을 올려요");
		
	}

	@Override
	public void volumDown() {
		System.out.println("라디오 볼륨을 내려요");
		
	}
	
}
class TV implements Volume{

	@Override
	public void volumeUp() {
		System.out.println("TV 볼륨을 올려요");
		
	}

	@Override
	public void volumDown() {
		System.out.println("TV 볼륨을 내려요");
		
	}
	
}

class Speaker implements Volume{
	@Override
	public void volumeUp() {
		System.out.println("스피커 볼륨을 올려요");
		
	}

	@Override
	public void volumDown() {
		System.out.println("스피커 볼륨을 내려요");
		
	}
}
