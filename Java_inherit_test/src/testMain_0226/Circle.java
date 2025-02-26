package testMain_0226;

public class Circle extends Diagram { //원 클래스

	public Circle (int width, int height) {
		super(width, height);
	}
	
	public void drow() {
		System.out.println("지름이 " + width + "인 원을 그린다.");
		
	}
}
