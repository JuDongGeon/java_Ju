package Store;

public abstract class Fruit {// 부모클래스=> 추상츨래스
	
	protected int cost; // 판매금액
	protected int capacity; // 용량
	
	protected Fruit() {};
	protected Fruit(int cost, int capacity) {
		this.cost = cost;
		this.capacity = capacity;
	}
	
	public abstract void makeJuice(); //과일 주스 만들기
	public abstract void pieceFruit(); // 컵단위 과일
	
	
	

}
