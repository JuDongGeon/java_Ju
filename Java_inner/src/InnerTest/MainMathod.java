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
 *  상속과 포함 차이
 *  상속은 A와 B중 한쪽이 다른 한쪽으로 정의할 수 있으나
 * 	포함은 A와 B가 서로를 정의할 수 없으나 A나 B중 하나가 다른 하나를 이루는 개념
 */