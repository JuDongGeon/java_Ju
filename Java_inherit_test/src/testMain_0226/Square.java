package testMain_0226;

public class Square extends Diagram { // 사각형 클래스

	public Square (int width, int height) {
		super(width, height);
	}
	
	@Override
	public void drow() {
		System.out.println("가로가 " + width + " 이고, 세로가 " + height +" 인 사각협을 그린다.");
		
	}
	
}
