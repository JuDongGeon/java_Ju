package InnerTest;

public class Car {

	private Tire tire;
	
	// 포함관계에서 클래스객체 생성시기
	// 매개변수를 통해 외부에서 만들어진게 들어올때 
	public Car(Tire tire) {
		this.setTire(tire);
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
	
}
