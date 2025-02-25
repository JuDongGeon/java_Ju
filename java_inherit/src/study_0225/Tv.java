package study_0225;

public class Tv extends Product {// 부모자식 관계 이으는 방법 -> 자식클래스이름 extends 부모클래스 이름
	
	public Tv() {
		super(); // 부모클래스의 생성자메서드
		// super는 부모클래스의 객체를 의미한다.
	}
	public Tv(String brand, int price, String name) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
}
