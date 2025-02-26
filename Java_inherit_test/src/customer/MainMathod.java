package customer;

import Store.Banana;

public class MainMathod {

	public static void main(String[] args) {

		// 바나나와 포도, 오렌지 갯수가 많을 경우
		// 바나나 - 15개, 포도 6개, 오렌지 54개
		
		Banana [] ba = new Banana[15]
				;
		ba[0] = new Banana(2500, 400);
		ba[1] = new Banana(3500, 500);
		ba[2] = new Banana(4500, 600);
		ba[3] = new Banana(5500, 700);
		
		ba[0].makeJuice();

	
	
	}

}
