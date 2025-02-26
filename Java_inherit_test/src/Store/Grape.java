package Store;

public class Grape extends Fruit {

	public Grape (int cost, int capacity) {
		super(cost, capacity);
	}
	
	public void makeJuice() {
		System.out.println("포도 주스 제조");
	}
	
	public void pieceFruit() {
		System.out.println("포도 8알");
	}
	
	
	
}
