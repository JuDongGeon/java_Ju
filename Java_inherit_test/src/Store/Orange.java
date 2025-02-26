package Store;

public class Orange extends Fruit {
	
	public Orange (int cost, int capacity) {
		super(cost, capacity);
	}
	
	public void makeJuice() {
		System.out.println("오렌지 주스 제조");
	}
	
	public void pieceFruit() {
		System.out.println("오렌지 5조각");
	}

}
