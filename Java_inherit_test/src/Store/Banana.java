package Store;

public class Banana extends Fruit {

	public Banana (int cost, int capacity) {
		super(cost, capacity);
	}
	
	public void makeJuice() {
		System.out.println("바나나 주스 제조");
	}
	
	public void piece() {
		System.out.println("바나나 세조각");
	}
	
}
