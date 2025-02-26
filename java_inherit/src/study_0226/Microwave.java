package study_0226;

import study_0225.Product; // 다른 패키지에 있는 것과 상속관계를 맺기때문에 import 가 필요함

public class Microwave extends Product{ // 전자레인지

	public Microwave() {
		System.out.println(super.brand);
	}
	
	@Override
	public void power() {
		System.out.println("전자레인지");
	}
	
}
