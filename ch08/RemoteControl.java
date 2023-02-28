package ch08;

public interface RemoteControl {
//interface의 상수는 public static final이 생략
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
//	interface의 메서드는 PUblIC ABSTRACT가 생략
	void turnOn();
	void turnOff();
//	default method는 구현부를 만들 수 있다.
	default void setMute(boolean mute) {
		if (mute) System.out.println("무음 처리합니다");
		else System.out.println("무음을 해제합니다.");
	}
//	static method도 구현부를 만들 수 있다.
	static void changeBateery() {
		System.out.println("건전지를 교환합니다");
	}
}
