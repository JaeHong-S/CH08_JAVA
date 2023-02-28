package ch08;

public class MermaidEx {
	public static void main(String[] args) {
		Mermaid m = new Mermaid();
		System.out.println(m.leg);
		m.swim();
		m.move();
		
		Mermaid m1 = new Mermaid(0) {};
		System.out.println(m1.leg);
		
		
	}
}
