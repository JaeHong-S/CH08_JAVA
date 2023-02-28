package ch08;

public class Shape2Ex {
	public static void main(String[] args) {
//		Shape2 sh = new Shape(); 추상클래스는 객체 생성 불가능, 자식 클래스를 만들어서 사용해야함.
		Shape2[] sh = new Shape2[3];
		sh[0] = new Rectangle2();
		sh[1] = new Circle2();
		sh[2] = new Triagngle2();
		
		for(Shape2 s : sh) {
			s.disp();
			s.drive();
		}
	}
	

}
