package customer;

import Store.Banana;
import Store.Fruit;
import Store.Grape;
import Store.Orange;


public class MainMathod {

	public static void main(String[] args) {

		// 바나나와 포도, 오렌지 갯수가 많을 경우
		// 바나나 - 15개, 포도 6개, 오렌지 54개
		
//		Banana [] ba = new Banana[15]
//				;
//		ba[0] = new Banana(2500, 400);
//		ba[1] = new Banana(3500, 500);
//		ba[2] = new Banana(4500, 600);
//		ba[3] = new Banana(5500, 700);
//		
//		ba[0].makeJuice();
		
		// 다형성 - 하나의 타입으로 여러 타입을 다룰 수 있다.
		// 상속 관계, implements
		
//		Fruit f = new Banana(2500, 500);
//		f.makeJuice();
//		Fruit g = new Grape(3500, 400);
//		g.makeJuice();
		
		Fruit [] menu = new Fruit[10];
		
		menu[0] = new Banana(2500, 350);
		menu[1] = new Banana(3000, 400);
		menu[2] = new Orange(3500, 400);
		menu[3] = new Banana(3500, 500);
		menu[4] = new Grape(4500, 350);
		menu[5] = new Banana(4500, 550);
		menu[6] = new Grape(5000, 450);
		menu[7] = new Orange(4000, 350);
		menu[8] = new Orange(5000, 550);
		menu[9] = new Grape(6000, 600);		
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctm1 = new Buyer(10000); //첫번째 구매자 객체 생성
		
		
		for(Fruit m : menu) {
			System.out.println(m);
			
			
		}
		
		System.out.println(ctm1);
		
//		System.out.println("보유 머니 : " + ctm1.getMoney() + "원");
		
		
	
	}

}
