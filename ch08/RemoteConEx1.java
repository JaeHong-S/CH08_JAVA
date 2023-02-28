package ch08;

public class RemoteConEx1 {
	public static void main(String[] args) {
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = new TV1();
		rc[1] = new Radio2();
		
		for(int i = 0; i<rc.length; i++) {
			rc[i].turnOn();
			rc[i].turnOff();
			rc[i].setMute(false);
			RemoteControl.changeBateery();
			System.out.println(RemoteControl.MAX_VOLUME);
			System.out.println(RemoteControl.MIN_VOLUME);
		}
			
			
	}

}
