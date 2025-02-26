package study_0225;

public class Tv extends Product {// 부모자식 관계 이으는 방법 -> 자식클래스이름 extends 부모클래스 이름
	
	public Tv() {
		
//		super(); // 부모클래스의 생성자메서드. 이 메서드가 반드시 먼저 실행된다.
		// super 는 부모클래스의 객체를 의미한다.
		System.out.println("자식클래스 생성");
	}
	public Tv(String brand, int price, String name) {
		super(brand, price, name);
	}
	
	/* 
	 오버라이딩
	 상속관계의 경우, 인터페이스 implements 인 경우에 사용

	 성립 조건                                                                                                                                                        
	 1. 메서드 원형은 그대로 유지
	 2. 내용만 변경한다.
	 3. 상속 또는 implements 인 경우에만 사용가능 
	*/
	
	@Override //@는 컴퓨터용 주석으로 해당 규칙에 맞는지를 검사함
	public void power() {
		onOff = !onOff;
		System.out.println("TV 전원 : " + onOff);
	}
	
	
}
 