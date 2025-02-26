package study_0225;

public abstract class Product { // Tv, Aircon, Computer의 부모 클래스로 만들기
	 
	protected boolean onOff = false;
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; //제품명
	
	
	
	public Product() {
		System.out.println("부모클래스 생성");
	};
	
	public Product(String brand, int price, String name) {
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	
	
	public abstract void power();  
	// abstract 추상메서드로 자식클래스에서 오버라이딩하기 때문에
	// 내용없이 메서드 형태만 있으면됨
	// 추상메서드는 추상클래스라는 전제조건이 필요.
	
	// 추상클래스는 객체생성 불가
	// 추상클래스는 추상메서드를 가질수 있는 클래스이다.
	// 추상 메서드는 메모리의 크기를 얼마나 할당해야하는지 측정불가하기 때문에
	// 객체 공간 할당이 안된다.
	// 객체 공간을 할당 받으려면 얼마의 메모리가 필요한지 측정되어야 한다.
}
 