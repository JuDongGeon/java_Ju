package testMain_0226;

public class Triangle extends Diagram { // 삼각형 클래스
	
	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void drow() {
		System.out.println("높이가 " + height + " 이고, 밑변이 " + width + " 인 삼각형을 그린다.");
	}
	
}
	