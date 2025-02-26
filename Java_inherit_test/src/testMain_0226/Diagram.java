package testMain_0226;

public abstract class Diagram { // 도형 클래스
	
	protected int width; // 가로 길이
	protected int height;// 세로길이
	
	public Diagram() {};
	protected Diagram(int width, int height) { // 도형 생성자 메서드
		this.width = width;
		this.height = height;
	}
	
	
	public abstract void drow(); // 추상메서드
	

}
