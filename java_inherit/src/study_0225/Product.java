package study_0225;

public class Product { // Tv, Aircon, Computer의 부모 클래스로 만들기
	
	protected boolean onOff = false;
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; //제품명
	
	
	
	public void power() {
		onOff = !onOff;
		System.out.println("전원 : " + onOff);
	}
}
