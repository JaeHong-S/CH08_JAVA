package ch08;

public class RemoConEx2 {
	public static void main(String[] args) {
//		클래스를 생성하지 않고 추상머세드를 재정의 해서 객체를 생성할 수있다.
// 		객체를 생성하면 참조변수를 사용하여 메서드를 사용
//		무명 클래스 --> 프로그램 내에서 단발성으로 사용해야할 때 클래스를 만들어주기보다, 객체를 생성해서 일회용으로 쓴다
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV를 켠다");
				
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끈다");
				
			}
		};
		rc.turnOn(); rc.turnOff();
		rc.setMute(false);
		RemoteControl.changeBateery();
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
	
		RemoteControl rc2 = new RemoteControl() {

		@Override
			public void turnOn() {
				System.out.println("TV를 켠다");
			
			}

		@Override
			public void turnOff() {
				System.out.println("TV를 끈다");
			
			}
		};
		rc2.turnOn(); rc.turnOff();
		rc2.setMute(true);
		RemoteControl.changeBateery();
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
	}
}

