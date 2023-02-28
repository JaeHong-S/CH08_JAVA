package ch08;

public class Mermaid extends Person implements Fish{
	
	Mermaid(){}
	Mermaid(int leg){
		super(leg);
	}
		
	

	@Override
	public void swim() {
		System.out.println("물 속에서 헤엄친다.");
		
	}

}
