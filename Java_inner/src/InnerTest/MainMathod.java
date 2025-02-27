package InnerTest;

public class MainMathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tire tire = new Tire();
		tire.setInch(18);
		
		Car car = new Car(tire);
		
		System.out.println(car.getTire().getInch());
		
		
	}

}

/*
 * 
 * 
 */