package ch08;

public class TV1 implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
		
	}
	

}

class Radio2 implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Radio2를 켠다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio2를 끈다.");
		
	}
	
}
